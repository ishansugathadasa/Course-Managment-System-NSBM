/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Lecturer;

/**
 *
 * @author DinukaMedis
 */
public class LecturerController {
    public static int addLecturer(Lecturer lecturer) throws ClassNotFoundException, SQLException{
        String sql = "Insert into lecturer values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturer.getLecturerId());
        stm.setObject(2, lecturer.getName());
        stm.setObject(3, lecturer.getNic());
        stm.setObject(4, lecturer.getEmail());
        stm.setObject(5, lecturer.getPhoneNo());
        stm.setObject(6, lecturer.getAddress());
        stm.setObject(7, lecturer.getGender());
        stm.setObject(8, lecturer.getDob());
        return  stm.executeUpdate(); 
    }
    
    public static int updateLecturer(Lecturer lecturer) throws ClassNotFoundException, SQLException{
        String sql = "Update lecturer set name=?,nic=?,email=?,phoneNo=?,address=?,gender=?,dob=? where lecturerId=?";
//       String sql= "Update lecturer set name='Cat',nic='952641514v',email='dsadsa@gmail.com',"
//                + "phoneNo=0717275722,address='sffdf',gender='f',dob='2018-05-23' where lecturerId='l0002'";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(8, lecturer.getLecturerId());
        stm.setObject(1, lecturer.getName());
        stm.setObject(2, lecturer.getNic());
        stm.setObject(3, lecturer.getEmail());
        stm.setObject(4, lecturer.getPhoneNo());
        stm.setObject(5, lecturer.getAddress());
        stm.setObject(6, lecturer.getGender());
        stm.setObject(7, lecturer.getDob());
        return  stm.executeUpdate();
    }
    
    public static int deleteLecturer(String lecturerId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From lecturer where lecturerId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturerId);
        return  stm.executeUpdate(); 
    }
    
    public static Lecturer searchLecturerId(String lecturerId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From lecturer where lecturerId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturerId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Lecturer lecturer=new Lecturer(
                rst.getString("lecturerId"),rst.getString("name"),rst.getString("nic"), rst.getString("email"),
                    rst.getInt("phoneNo"),rst.getString("address"),rst.getString("gender"),rst.getString("dob"));
            return lecturer;
        }else{
            return null;
        }
    }
    
    public static Lecturer searchLecturerName(String name) throws ClassNotFoundException, SQLException{
        String sql = "Select * From lecturer where name=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Lecturer lecturer=new Lecturer(
                rst.getString("lecturerId"),rst.getString("name"),rst.getString("nic"), rst.getString("email"),
                    rst.getInt("phoneNo"),rst.getString("address"),rst.getString("gender"),rst.getString("dob"));
            return lecturer;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Lecturer> getAllLecturer() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Lecturer");
        ArrayList<Lecturer>lecturerList=new ArrayList<>();
        while(rst.next()){
            Lecturer lecturer=new Lecturer(
                rst.getString("lecturerId"),rst.getString("name"),rst.getString("nic"), rst.getString("email"),
                    rst.getInt("phoneNo"),rst.getString("address"),rst.getString("gender"),rst.getString("dob"));
            lecturerList.add(lecturer);
        }
        return lecturerList; 
    }
}

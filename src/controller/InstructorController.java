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
import model.Instructor;

/**
 *
 * @author DinukaMedis
 */
public class InstructorController {
    public static int addInstructor(Instructor instructor) throws ClassNotFoundException, SQLException{
        String sql = "Insert into Instructor values(?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructor.getInstructorId());
        stm.setObject(2, instructor.getName());
        stm.setObject(3, instructor.getNic());
        stm.setObject(4, instructor.getEmail());
        stm.setObject(5, instructor.getAddress());
        stm.setObject(6, instructor.getGender());
        stm.setObject(7, instructor.getPhone());
        stm.setObject(8, instructor.getDob());
        return  stm.executeUpdate(); 
    }
    
    public static int updateInstructor(Instructor instructor) throws ClassNotFoundException, SQLException{
        String sql = "Update instructor set name=?,nic=?,email=?,phoneNo=?,address=?,gender=?,dob=? where instructorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(8, instructor.getInstructorId());
        stm.setObject(1, instructor.getName());
        stm.setObject(2, instructor.getNic());
        stm.setObject(3, instructor.getEmail());
        stm.setObject(4, instructor.getPhone());
        stm.setObject(5, instructor.getAddress());
        stm.setObject(6, instructor.getGender());
        stm.setObject(7, instructor.getDob());
        return  stm.executeUpdate();
    }
    
    public static int deleteInstructor(String instructorId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From Instructor where instructorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructorId);
        return  stm.executeUpdate(); 
    }
    
    public static Instructor searchInstructor(String instructorId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Instructor where instructorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructorId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Instructor instructor=new Instructor(
                rst.getString("instructorId"),rst.getString("name"),rst.getString("nic"), rst.getString("email"),
                    rst.getInt("phoneNo"),rst.getString("address"),rst.getString("gender"),rst.getString("dob"));
            return instructor;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Instructor> getAllInstructor() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Instructor");
        ArrayList<Instructor>instructorList=new ArrayList<>();
        while(rst.next()){
            Instructor instructor=new Instructor(
                rst.getString("instructorId"),rst.getString("name"),rst.getString("nic"), rst.getString("email"),
                    rst.getInt("phoneNo"),rst.getString("address"),rst.getString("gender"),rst.getString("dob"));
            instructorList.add(instructor);
        }
        return instructorList; 
    }
}

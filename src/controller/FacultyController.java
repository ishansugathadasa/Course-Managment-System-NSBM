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
import model.Faculty;

/**
 *
 * @author DinukaMedis
 */
public class FacultyController {
    /**
     * 
     * @param faculty
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static int addFaculty(Faculty faculty) throws ClassNotFoundException, SQLException{
        String sql = "Insert into Faculty values(?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, faculty.getFacultyId() );
        stm.setObject(2, faculty.getName());
        return  stm.executeUpdate(); 
    }
    
    /**
     * 
     * @param faculty
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static int updateFaculty(Faculty faculty) throws ClassNotFoundException, SQLException{
        String sql = "Update Faculty set name=? where facultyId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(2, faculty.getFacultyId());
        stm.setObject(1, faculty.getName());
        return  stm.executeUpdate();
    }
    
    /**
     * 
     * @param facultyId
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static int deleteFaculty(String facultyId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From Faculty where facultyId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, facultyId);
        return  stm.executeUpdate(); 
    }
    
    /**
     * 
     * @param facultyId
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException 
     */
    public static Faculty searchFacultyId(String facultyId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Faculty where facultyId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, facultyId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Faculty faculty=new Faculty(rst.getString("facultyId"),rst.getString("name"));
            return faculty;
        }else{
            return null;
        }
    }
    
    public static Faculty searchFacultyName(String name) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Faculty where name=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Faculty faculty=new Faculty(rst.getString("facultyId"),rst.getString("name"));
            return faculty;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Faculty> getAllFaculty() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Faculty");
        ArrayList<Faculty>facultys=new ArrayList<>();
        while(rst.next()){
            Faculty faculty=new Faculty(rst.getString("facultyId"),rst.getString("name"));
            facultys.add(faculty);
        }
        return facultys; 
    }
}

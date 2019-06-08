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
import model.LabInstructor;

/**
 *
 * @author DinukaMedis
 */
public class LabInstructorController {
    public static int addLabInstructor(LabInstructor labInstructor) throws ClassNotFoundException, SQLException{
        String sql = "Insert into labInstructor values(?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, labInstructor.getInstructorId());
        stm.setObject(2, labInstructor.getLabId());
        stm.setObject(3, labInstructor.getStartTime());
        stm.setObject(4, labInstructor.getEndTime());
        return  stm.executeUpdate(); 
    }
    
    public static int updateLabInstructor(LabInstructor labInstructor) throws ClassNotFoundException, SQLException{
        String sql = "Update labInstructor set admissionNo=?,amount=?,enrolledDate=? where instructorId=? AND labId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(3, labInstructor.getInstructorId());
        stm.setObject(4, labInstructor.getLabId());
        stm.setObject(1, labInstructor.getStartTime());
        stm.setObject(2, labInstructor.getEndTime());
        return  stm.executeUpdate();
    }
    
    public static int deleteLabInstructor(String instructorId, String labId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From labInstructor where instructorId=? AND labId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructorId);
        stm.setObject(2, labId);
        return  stm.executeUpdate(); 
    }
    
    public static LabInstructor searchLabInstructor(String instructorId, String labId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From labInstructor where instructorId=? AND labId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructorId);
        stm.setObject(2, labId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            LabInstructor labInstructor=new LabInstructor(
                rst.getString("instructorId"),rst.getString("labId"),
                    rst.getString("startTime"),rst.getString("endTime"));
            return labInstructor;
        }else{
            return null;
        }
    }
    
    public static ArrayList<LabInstructor> getAllLabInstructor() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From LabInstructor");
        ArrayList<LabInstructor>labInstructorList=new ArrayList<>();
        while(rst.next()){
            LabInstructor labInstructor=new LabInstructor(
                rst.getString("instructorId"),rst.getString("labId"),
                    rst.getString("startTime"),rst.getString("endTime"));
            labInstructorList.add(labInstructor);
        }
        return labInstructorList; 
    }
}

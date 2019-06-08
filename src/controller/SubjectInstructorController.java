/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.SubjectInstructor;

/**
 *
 * @author DinukaMedis
 */
public class SubjectInstructorController {
    public static int addSubjectInstructor(SubjectInstructor subjectInstructor) throws ClassNotFoundException, SQLException{
        String sql = "Insert into subjectInstructor values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectInstructor.getInstructorId());
        stm.setObject(2, subjectInstructor.getSubjectCode());
        stm.setObject(3, subjectInstructor.getLocation());
        return  stm.executeUpdate(); 
    }
    
    public static int updateSubjectInstructor(SubjectInstructor subjectInstructor) throws ClassNotFoundException, SQLException{
        String sql = "Update subjectInstructor set location=? where instructorId=? AND subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(2, subjectInstructor.getInstructorId());
        stm.setObject(3, subjectInstructor.getSubjectCode());
        stm.setObject(1, subjectInstructor.getLocation());
        return  stm.executeUpdate();
    }
    
    public static int deleteSubjectInstructor(String instructorId, String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Delete From subjectInstructor where instructorId=? AND subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, instructorId);
        stm.setObject(2, subjectCode);
        return  stm.executeUpdate(); 
    }
    
/*  public static SubjectInstructor searchSubjectInstructor(String subjectInstructorId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From subjectInstructor where subjectInstructorId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectInstructorId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            SubjectInstructor subjectInstructor=new SubjectInstructor(
                rst.getString("subjectInstructorId"),rst.getString("subjectInstructorDate"),rst.getString("subjectCode"));
            return subjectInstructor;
        }else{
            return null;
        }
    }
    
    public static ArrayList<SubjectInstructor> getAllSubjectInstructor() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From SubjectInstructor");
        ArrayList<SubjectInstructor>subjectInstructorList=new ArrayList<>();
        while(rst.next()){
            SubjectInstructor subjectInstructor=new SubjectInstructor(
                rst.getString("subjectInstructorId"),rst.getString("subjectInstructorDate"),rst.getString("subjectCode"));
            subjectInstructorList.add(subjectInstructor);
        }
        return subjectInstructorList; 
    }
*/
}

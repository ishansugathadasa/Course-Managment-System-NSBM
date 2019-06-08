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
import model.LecturerSubjects;

/**
 *
 * @author DinukaMedis
 */
public class LecturerSubjectsController {
    public static int addLecturerSubjects(LecturerSubjects lecturerSubjects) throws ClassNotFoundException, SQLException{
        String sql = "Insert into lecturerSubjects values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturerSubjects.getSubjectCode());
        stm.setObject(2, lecturerSubjects.getLecturerId());
        stm.setObject(3, lecturerSubjects.getLocation());
        return  stm.executeUpdate(); 
    }
    
    public static int updateLecturerSubjects(LecturerSubjects lecturerSubjects) throws ClassNotFoundException, SQLException{
        String sql = "Update lecturerSubjects set location=? where lecturerId=? AND subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(2, lecturerSubjects.getSubjectCode());
        stm.setObject(3, lecturerSubjects.getLecturerId());
        stm.setObject(1, lecturerSubjects.getLocation());
        return  stm.executeUpdate();
    }
    
    public static int deleteLecturerSubjects(String lecturerId,String subjectCode ) throws ClassNotFoundException, SQLException{
        String sql = "Delete From lecturerSubjects where lecturerId=? AND subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturerId);
        stm.setObject(2, subjectCode);
        return  stm.executeUpdate(); 
    }
    
/*  public static LecturerSubjects searchLecturerSubjects(String lecturerSubjectsId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From lecturerSubjects where lecturerSubjectsId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lecturerSubjectsId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            LecturerSubjects lecturerSubjects=new LecturerSubjects(
                rst.getString("lecturerSubjectsId"),rst.getString("lecturerSubjectsDate"),rst.getString("subjectCode"));
            return lecturerSubjects;
        }else{
            return null;
        }
    }
    
    public static ArrayList<LecturerSubjects> getAllLecturerSubjects() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From LecturerSubjects");
        ArrayList<LecturerSubjects>lecturerSubjectsList=new ArrayList<>();
        while(rst.next()){
            LecturerSubjects lecturerSubjects=new LecturerSubjects(
                rst.getString("lecturerSubjectsId"),rst.getString("lecturerSubjectsDate"),rst.getString("subjectCode"));
            lecturerSubjectsList.add(lecturerSubjects);
        }
        return lecturerSubjectsList; 
    }
*/
}

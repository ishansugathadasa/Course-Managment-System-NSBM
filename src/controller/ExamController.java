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
import model.Exam;

/**
 *
 * @author DinukaMedis
 */
public class ExamController {
    public static int addExam(Exam exam) throws ClassNotFoundException, SQLException{
        String sql = "Insert into exam values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, exam.getExamId());
        stm.setObject(2, exam.getExamDate());
        stm.setObject(3, exam.getSubjectCode());
        return  stm.executeUpdate(); 
    }
    
    public static int updateExam(Exam exam) throws ClassNotFoundException, SQLException{
        String sql = "Update exam set admissionNo=?,result=? where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(3, exam.getExamId());
        stm.setObject(1, exam.getExamDate());
        stm.setObject(2, exam.getSubjectCode());
        return  stm.executeUpdate();
    }
    
    public static int deleteExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From exam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        return  stm.executeUpdate(); 
    }
    
    public static Exam searchExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From exam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Exam exam=new Exam(
                rst.getString("examId"),rst.getString("examDate"),rst.getString("subjectCode"));
            return exam;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Exam> getAllExam() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Exam");
        ArrayList<Exam>examList=new ArrayList<>();
        while(rst.next()){
            Exam exam=new Exam(
                rst.getString("examId"),rst.getString("examDate"),rst.getString("subjectCode"));
            examList.add(exam);
        }
        return examList; 
    }
}

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
import model.MscExam;

/**
 *
 * @author DinukaMedis
 */
public class MscExamController {
    public static int addMscExam(MscExam mscExam) throws ClassNotFoundException, SQLException{
        String sql = "Insert into mscExam values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, mscExam.getExamId());
        stm.setObject(2, mscExam.getAdmissionNo());
        stm.setObject(3, mscExam.getResult());
        return  stm.executeUpdate(); 
    }
    
    public static int updateMscExam(MscExam mscExam) throws ClassNotFoundException, SQLException{
        String sql = "Update mscExam set admissionNo=?,result=? where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(3, mscExam.getExamId());
        stm.setObject(1, mscExam.getAdmissionNo());
        stm.setObject(2, mscExam.getResult());
        return  stm.executeUpdate();
    }
    
    public static int deleteMscExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From mscExam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        return  stm.executeUpdate(); 
    }
    
    public static MscExam searchMscExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From mscExam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            MscExam mscExam=new MscExam(
                rst.getString("examId"),rst.getString("admissionNo"),rst.getString("result"));
            return mscExam;
        }else{
            return null;
        }
    }
    
    public static ArrayList<MscExam> getAllMscExam() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From MscExam");
        ArrayList<MscExam>mscExamList=new ArrayList<>();
        while(rst.next()){
            MscExam mscExam=new MscExam(
                rst.getString("examId"),rst.getString("admissionNo"),rst.getString("result"));
            mscExamList.add(mscExam);
        }
        return mscExamList; 
    }
}

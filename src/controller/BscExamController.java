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
import model.BscExam;

/**
 *
 * @author DinukaMedis
 */
public class BscExamController {
    public static int addBscExam(BscExam bscExam) throws ClassNotFoundException, SQLException{
        String sql = "Insert into bscExam values(?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, bscExam.getExamId());
        stm.setObject(2, bscExam.getAdmissionNo());
        stm.setObject(3, bscExam.getResult());
        return  stm.executeUpdate(); 
    }
    
    public static int updateBscExam(BscExam bscExam) throws ClassNotFoundException, SQLException{
        String sql = "Update bscExam set admissionNo=?,result=? where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(3, bscExam.getExamId());
        stm.setObject(1, bscExam.getAdmissionNo());
        stm.setObject(2, bscExam.getResult());
        return  stm.executeUpdate();
    }
    
    public static int deleteBscExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From bscExam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        return  stm.executeUpdate(); 
    }
    
    public static BscExam searchBscExam(String examId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From bscExam where examId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, examId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            BscExam bscExam=new BscExam(
                rst.getString("examId"),rst.getString("admissionNo")
                    ,rst.getString("result"));
            return bscExam;
        }else{
            return null;
        }
    }
    
    public static ArrayList<BscExam> getAllBscExam() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From BscExam");
        ArrayList<BscExam>bscExamList=new ArrayList<>();
        while(rst.next()){
            BscExam bscExam=new BscExam(
                rst.getString("examId"),rst.getString("admissionNo")
                    ,rst.getString("result"));
            bscExamList.add(bscExam);
        }
        return bscExamList; 
    }
}

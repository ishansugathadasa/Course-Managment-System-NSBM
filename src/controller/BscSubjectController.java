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
import model.BscSubject;
import model.GetBscSubjects;

/**
 *
 * @author DinukaMedis
 */
public class BscSubjectController {
    public static int addBscSubject(BscSubject bscSubject) throws ClassNotFoundException, SQLException{
        String sql = "Insert into bscSubject values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, bscSubject.getSubjectCode());
        stm.setObject(2, bscSubject.getAdmissionNo());
        stm.setObject(3, bscSubject.getPaymentId());
        stm.setObject(4, bscSubject.getAmount());
        stm.setObject(5, bscSubject.getEnrolledDate());
        return  stm.executeUpdate(); 
    }
    
    public static int updateBscSubject(BscSubject bscSubject) throws ClassNotFoundException, SQLException{
        String sql = "Update bscSubject set paymentId=?,amount=?,enrolledDate=? where subjectCode=? and admissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(4, bscSubject.getSubjectCode());
        stm.setObject(5, bscSubject.getAdmissionNo());
        stm.setObject(1, bscSubject.getPaymentId());
        stm.setObject(2, bscSubject.getAmount());
        stm.setObject(3, bscSubject.getEnrolledDate());
        return  stm.executeUpdate();
    }
    
    public static int deleteBscSubject(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Delete From bscSubject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        return  stm.executeUpdate(); 
    }
    
    public static BscSubject searchBscSubject(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Select * From bscSubject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            BscSubject bscSubject=new BscSubject(
                rst.getString("subjectCode"),rst.getString("admissionNo"),rst.getString("PaymentId"),
                    rst.getDouble("Amount"),rst.getString("enrolledDate"));
            return bscSubject;
        }else{
            return null;
        }
    }
        
    public static ArrayList<GetBscSubjects> getStudentAllBscSubject(String admissionNo,int semester) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("SELECT * FROM bscsubject b, subject s where b.subjectCode=s.subjectCode AND b.admissionNo='"+admissionNo+"' AND s.semester="+semester);
        ArrayList<GetBscSubjects>getBscSubjectsList=new ArrayList<>();
        while(rst.next()){
            GetBscSubjects getBscSubjects=new GetBscSubjects(
                rst.getString("subjectCode"),rst.getString("admissionNo"),
                    rst.getDouble("Amount"),rst.getString("enrolledDate"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            getBscSubjectsList.add(getBscSubjects);
        }
        return getBscSubjectsList; 
    }
}

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
import model.GetMscSubjects;
import model.MscSubjects;

/**
 *
 * @author DinukaMedis
 */
public class MscSubjectController {
    public static int addMscSubjects(MscSubjects mscSubjects) throws ClassNotFoundException, SQLException{
        String sql = "Insert into mscSubject values(?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, mscSubjects.getSubjectCode());
        stm.setObject(2, mscSubjects.getAdmissionNo());
        stm.setObject(3, mscSubjects.getPaymentId());
        stm.setObject(4, mscSubjects.getAmount());
        stm.setObject(5, mscSubjects.getEnrolledDate());
        return  stm.executeUpdate(); 
    }
    
    public static int updateMscSubjects(MscSubjects mscSubjects) throws ClassNotFoundException, SQLException{
        String sql = "Update mscSubject set admissionNo=?,paymentId=?,amount=?,enrolledDate=? where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(5, mscSubjects.getSubjectCode());
        stm.setObject(1, mscSubjects.getAdmissionNo());
        stm.setObject(2, mscSubjects.getPaymentId());
        stm.setObject(3, mscSubjects.getAmount());
        stm.setObject(4, mscSubjects.getEnrolledDate());
        return  stm.executeUpdate();
    }
    
    public static int deleteMscSubjects(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Delete From mscSubject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        return  stm.executeUpdate(); 
    }
    
    public static MscSubjects searchMscSubjects(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Select * From mscSubject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            MscSubjects mscSubjects=new MscSubjects(
                rst.getString("subjectCode"),rst.getString("admissionNo"),rst.getString("PaymentId"),
                    rst.getDouble("Amount"),rst.getString("enrolledDate"));
            return mscSubjects;
        }else{
            return null;
        }
    }
    
    public static ArrayList<MscSubjects> getAllMscSubjects() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From MscSubject");
        ArrayList<MscSubjects>mscSubjectsList=new ArrayList<>();
        while(rst.next()){
            MscSubjects mscSubjects=new MscSubjects(
                rst.getString("subjectCode"),rst.getString("admissionNo"),rst.getString("PaymentId"),
                    rst.getDouble("Amount"),rst.getString("enrolledDate"));
            mscSubjectsList.add(mscSubjects);
        }
        return mscSubjectsList; 
    }
    
    public static ArrayList<GetMscSubjects> getStudentAllMscSubject(String admissionNo,int semester) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("SELECT * FROM mscsubject b, subject s where b.subjectCode=s.subjectCode AND b.admissionNo='"+admissionNo+"' AND s.semester="+semester);
        ArrayList<GetMscSubjects>getBscSubjectsList=new ArrayList<>();
        while(rst.next()){
            GetMscSubjects getBscSubjects=new GetMscSubjects(
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

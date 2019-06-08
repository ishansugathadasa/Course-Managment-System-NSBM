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
import model.PostGraduateStudent;

/**
 *
 * @author DinukaMedis
 */
public class PostGraduateStudentController {
    public static int addPostGraduateStudent(PostGraduateStudent underGraduateStudent) throws ClassNotFoundException, SQLException{
        String sql = "Insert into PostGraduateStudent values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, underGraduateStudent.getAddmissionNo());
        stm.setObject(2, underGraduateStudent.getAddmissionDate());
        stm.setObject(3, underGraduateStudent.getName());
        stm.setObject(4, underGraduateStudent.getNic());
        stm.setObject(5, underGraduateStudent.getDob());
        stm.setObject(6, underGraduateStudent.getGender());
        stm.setObject(7, underGraduateStudent.getEmail());
        stm.setObject(8, underGraduateStudent.getAddress());
        stm.setObject(9, underGraduateStudent.getPhoneNo());
        stm.setObject(10, underGraduateStudent.getQualificationType());
        stm.setObject(11, underGraduateStudent.getYearOfCompletion());
        stm.setObject(12, underGraduateStudent.getInstitute());
        stm.setObject(13, underGraduateStudent.getFacultyId());
        stm.setObject(14, underGraduateStudent.getCourseId());
        stm.setObject(15, underGraduateStudent.getLabId());
        stm.setObject(16, underGraduateStudent.getTotalCredites());
        return  stm.executeUpdate(); 
    }
    
    public static int updatePostGraduateStudent(PostGraduateStudent underGraduateStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update undergraduatestudent set addmissionDate=?,name=?,nic=?,dob=?,gender=?,email=?address=?,phoneNo=?,qualificationType=?,yearOfCompletion=?,institute=?,facultyId=?,courseId=?,labId=?,totalCredites=? where addmissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(16, underGraduateStudent.getAddmissionNo());
        stm.setObject(1, underGraduateStudent.getAddmissionDate());
        stm.setObject(2, underGraduateStudent.getName());
        stm.setObject(3, underGraduateStudent.getNic());
        stm.setObject(4, underGraduateStudent.getDob());
        stm.setObject(5, underGraduateStudent.getGender());
        stm.setObject(6, underGraduateStudent.getEmail());
        stm.setObject(7, underGraduateStudent.getAddress());
        stm.setObject(8, underGraduateStudent.getPhoneNo());
        stm.setObject(9, underGraduateStudent.getQualificationType());
        stm.setObject(10, underGraduateStudent.getYearOfCompletion());
        stm.setObject(11, underGraduateStudent.getInstitute());
        stm.setObject(12, underGraduateStudent.getFacultyId());
        stm.setObject(13, underGraduateStudent.getCourseId());
        stm.setObject(14, underGraduateStudent.getLabId());
        stm.setObject(15, underGraduateStudent.getTotalCredites());
        return  stm.executeUpdate();
    }
    
    public static int deletePostGraduateStudent(String addmissionNo) throws ClassNotFoundException, SQLException{
        String sql = "Delete From PostGraduateStudent where addmissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, addmissionNo);
        return  stm.executeUpdate(); 
    }
    
    public static PostGraduateStudent searchPostGraduateStudent(String addmissionNo) throws ClassNotFoundException, SQLException{
        String sql = "Select * From PostGraduateStudent where admissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, addmissionNo);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            PostGraduateStudent underGraduateStudent=new PostGraduateStudent(
                rst.getString("admissionNo"), rst.getString("admissionDate"),rst.getString("name"),
                rst.getString("nic"),rst.getString("dob"),
                rst.getString("gender"), rst.getString("email"), rst.getString("address"),
                rst.getInt("phoneNo"),rst.getString("qualificationType"),
                rst.getInt("yearOfCompletion"), rst.getString("institute"), rst.getString("facultyId"), 
                rst.getString("courseId"), rst.getString("lab_labId"), rst.getInt("totalCredites"));
            return underGraduateStudent;
        }else{
            return null;
        }
    }
    
    public static ArrayList<PostGraduateStudent> getAllPostGraduateStudent() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From PostGraduateStudent");
        ArrayList<PostGraduateStudent>underGraduateStudentList=new ArrayList<>();
        while(rst.next()){
            PostGraduateStudent underGraduateStudent=new PostGraduateStudent(
                rst.getString("admissionNo"), rst.getString("admissionDate"),rst.getString("name"),
                rst.getString("nic"),rst.getString("dob"),
                rst.getString("gender"), rst.getString("email"), rst.getString("address"),
                rst.getInt("phoneNo"),rst.getString("qualificationType"),
                rst.getInt("yearOfCompletion"), rst.getString("institute"), rst.getString("facultyId"), 
                rst.getString("courseId"), rst.getString("lab_labId"), rst.getInt("totalCredites"));
            underGraduateStudentList.add(underGraduateStudent);
        }
        return underGraduateStudentList; 
    }
}

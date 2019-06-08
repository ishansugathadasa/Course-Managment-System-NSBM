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
import model.UnderGraduateStudent;

/**
 *
 * @author DinukaMedis
 */
public class UnderGraduateStudentController {
    public static int addUnderGraduateStudent(UnderGraduateStudent underGraduateStudent) throws ClassNotFoundException, SQLException{
        String sql = "Insert into undergraduatestudent values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
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
        stm.setObject(10, underGraduateStudent.getAlSubjects());
        stm.setObject(11, underGraduateStudent.getAlRank());
        stm.setObject(12, underGraduateStudent.getFacultyId());
        stm.setObject(13, underGraduateStudent.getCourseId());
        stm.setObject(14, underGraduateStudent.getLabId());
        stm.setObject(15, underGraduateStudent.isFourthYearSelected());
        stm.setObject(16, underGraduateStudent.getTotalCredites());
        return  stm.executeUpdate(); 
    }
    
    public static int updateUnderGraduateStudent(UnderGraduateStudent underGraduateStudent) throws ClassNotFoundException, SQLException{
        String sql = "Update undergraduatestudent set admissionDate=?,name=?,nic=?,dob=?,gender=?,email=?,address=?,phoneNo=?,alSub1=?,alSub2=?,alSub3=?,alRank=?,facultyId=?,courseId=?,lab_labId=?,fourthYearSelected=?,totalCredites=? where admissionNo=?";
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
        stm.setObject(9, underGraduateStudent.getAlSubjects());
        stm.setObject(10, underGraduateStudent.getAlRank());
        stm.setObject(11, underGraduateStudent.getFacultyId());
        stm.setObject(12, underGraduateStudent.getCourseId());
        stm.setObject(13, underGraduateStudent.getLabId());
        stm.setObject(14, underGraduateStudent.isFourthYearSelected());
        stm.setObject(15, underGraduateStudent.getTotalCredites());
        return  stm.executeUpdate();
    }
    
    public static int deleteUnderGraduateStudent(String admissionNo) throws ClassNotFoundException, SQLException{
        String sql = "Delete From undergraduatestudent where admissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, admissionNo);
        return  stm.executeUpdate(); 
    }
    
    public static UnderGraduateStudent searchUnderGraduateStudent(String admissionNo) throws ClassNotFoundException, SQLException{
        String sql = "Select * From undergraduatestudent where admissionNo=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, admissionNo);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            UnderGraduateStudent underGraduateStudent=new UnderGraduateStudent(
                rst.getString("admissionNo"), rst.getString("admissionDate"),rst.getString("name"),
                rst.getString("nic"),rst.getString("dob"),
                rst.getString("gender"), rst.getString("email"), rst.getString("address"),
                rst.getInt("phoneNo"), rst.getString("alSubjects"), rst.getInt("alRank"), rst.getString("facultyId"), 
                rst.getString("courseId"),rst.getString("lab_labId"),rst.getBoolean("fourthYearSelected"),rst.getInt("totalCredites"));
            return underGraduateStudent;
        }else{
            return null;
        }
    }
    
    public static ArrayList<UnderGraduateStudent> getAllUnderGraduateStudent() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From UnderGraduateStudent");
        ArrayList<UnderGraduateStudent>underGraduateStudentList=new ArrayList<>();
        while(rst.next()){
            UnderGraduateStudent underGraduateStudent=new UnderGraduateStudent(
                rst.getString("admissionNo"), rst.getString("admissionDate"),rst.getString("name"),
                rst.getString("nic"),rst.getString("dob"),
                rst.getString("gender"), rst.getString("email"), rst.getString("address"),
                rst.getInt("phoneNo"), rst.getString("alSubjects"), rst.getInt("alRank"), rst.getString("facultyId"), 
                rst.getString("courseId"),rst.getString("lab_labId"),rst.getBoolean("fourthYearSelected"),rst.getInt("totalCredites"));
            underGraduateStudentList.add(underGraduateStudent);
        }
        return underGraduateStudentList; 
    }
}

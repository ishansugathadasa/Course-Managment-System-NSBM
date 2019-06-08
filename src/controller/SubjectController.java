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
import model.Subject;

/**
 *
 * @author DinukaMedis
 */
public class SubjectController {
    public static int addSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql = "Insert into Subject values(?,?,?,?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subject.getSubjectCode());
        stm.setObject(2, subject.getName());
        stm.setObject(3, subject.getCourseId());
        stm.setObject(4, subject.getLectureId());
        stm.setObject(5, subject.getLabId());
        stm.setObject(6, subject.getYear());
        stm.setObject(7, subject.getSemester());
        stm.setObject(8, subject.isCompulsary());
        stm.setObject(9, subject.getNoofCredites());
        stm.setObject(10, subject.getFee());
        return  stm.executeUpdate(); 
    }
    
    public static int updateSubject(Subject subject) throws ClassNotFoundException, SQLException{
        String sql = "Update undergraduatestudent set name=?,courseId=?,lecturerId=?,"
                + "labId=?,year=?,semester=?,compulsory=?,noOfCredits=?,fee=? where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(10, subject.getSubjectCode());
        stm.setObject(1, subject.getName());
        stm.setObject(2, subject.getCourseId());
        stm.setObject(3, subject.getLectureId());
        stm.setObject(4, subject.getLabId());
        stm.setObject(5, subject.getYear());
        stm.setObject(6, subject.getSemester());
        stm.setObject(7, subject.isCompulsary());
        stm.setObject(8, subject.getNoofCredites());
        stm.setObject(9, subject.getFee());
        return  stm.executeUpdate();
    }
    
    public static int deleteSubject(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Delete From Subject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        return  stm.executeUpdate(); 
    }
    
    public static Subject searchSubjectId(String subjectCode) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Subject where subjectCode=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectCode);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Subject subject=new Subject(rst.getString("subjectCode"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            return subject;
        }else{
            return null;
        }
    }
    
    public static Subject searchSubjectName(String subjectName) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Subject where name=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, subjectName);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Subject subject=new Subject(rst.getString("subjectCode"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            return subject;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Subject> getAllSubject() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Subject");
        ArrayList<Subject>subjectList=new ArrayList<>();
        while(rst.next()){
            Subject subject=new Subject(rst.getString("subjectCode"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            subjectList.add(subject);
        }
        return subjectList; 
    }
    
    public static ArrayList<Subject> getAllCompulsorySubject(String course,int year, int semester) throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Subject where year="+year+" AND semester="+semester
                +" AND courseId='"+course+"'");
        ArrayList<Subject>subjectList=new ArrayList<>();
        while(rst.next()){
            Subject subject=new Subject(rst.getString("subjectCode"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            if (rst.getBoolean("compulsory")) {
                subjectList.add(subject);
            }
        }
        return subjectList; 
    }
    
    public static ArrayList<Subject> searchSubjectsForSemester(String courseId, int year, int semester,String compulsory) throws ClassNotFoundException, SQLException{
        String sql="Select * From Subject where courseId ='"+courseId+"' AND "
                + "year="+year+" AND semester="+semester+" AND compulsory='"+compulsory+"'";
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        System.out.println(courseId);
        ResultSet rst=stm.executeQuery(sql);
        ArrayList<Subject>subjectList=new ArrayList<>();
        while(rst.next()){
            Subject subject=new Subject(rst.getString("subjectCode"), 
                    rst.getString("name"),rst.getString("courseId"),
                rst.getString("lecturerId"),rst.getString("labId"),
                    rst.getInt("year"),rst.getInt("semester"),rst.getBoolean("compulsory")
                    ,rst.getInt("noOfCredites"),rst.getDouble("fee"));
            subjectList.add(subject);
        }
        return subjectList; 
    }

}

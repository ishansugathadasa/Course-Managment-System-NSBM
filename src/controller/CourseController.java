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
import model.Course;

/**
 *
 * @author DinukaMedis
 */
public class CourseController {
    public static int addCourse(Course course) throws ClassNotFoundException, SQLException{
        String sql = "Insert into Course values(?,?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, course.getCourseId() );
        stm.setObject(2, course.getName());
        return  stm.executeUpdate(); 
    }
    
    public static int updateCourse(Course course) throws ClassNotFoundException, SQLException{
        String sql = "Update Course set name=? where courseId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(2, course.getCourseId());
        stm.setObject(1, course.getName());
        return  stm.executeUpdate();
    }
    
    public static int deleteCourse(String courseId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From Course where courseId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, courseId);
        return  stm.executeUpdate(); 
    }
    
    public static Course searchCourseId(String courseId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Course where courseId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, courseId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Course course=new Course(rst.getString("courseId"),rst.getString("name"));
            return course;
        }else{
            return null;
        }
    }
    
    public static Course searchCourseName(String name) throws ClassNotFoundException, SQLException{
        String sql = "Select * From Course where name=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, name);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Course course=new Course(rst.getString("courseId"),rst.getString("name"));
            return course;
        }else{
            return null;
        }
    }
    
    public static ArrayList<Course> getAllCourse() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Course");
        ArrayList<Course>courses=new ArrayList<>();
        while(rst.next()){
            Course course=new Course(rst.getString("courseId"),rst.getString("name"));
            courses.add(course);
        }
        return courses; 
    }
}

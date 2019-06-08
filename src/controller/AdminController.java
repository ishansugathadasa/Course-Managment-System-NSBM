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
import model.Admin;

/**
 *
 * @author DinukaMedis
 */
public class AdminController {
    public static int addAdmin(Admin admin) throws ClassNotFoundException, SQLException{
        String sql = "Insert into admin values(?,?,?,?,?,password(?))";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, admin.getAdminId());
        stm.setObject(2, admin.getName());
        stm.setObject(3, admin.getAddress());
        stm.setObject(4, admin.getPhoneNo());
        stm.setObject(5, admin.getEmail());
        stm.setObject(6, admin.getPassword());
        return  stm.executeUpdate(); 
    }
    
    public static int updateAdmin(Admin admin) throws ClassNotFoundException, SQLException{
        String sql = "Update admin set name=?,address=?,phoneNo=?,email=?,password=password(?) where userId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(6, admin.getAdminId());
        stm.setObject(1, admin.getName());
        stm.setObject(2, admin.getAddress());
        stm.setObject(3, admin.getPhoneNo());
        stm.setObject(4, admin.getEmail());
        stm.setObject(5, admin.getPassword());
        return  stm.executeUpdate();
    }
    
    public static int deleteAdmin(String adminId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From admin where userId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, adminId);
        return  stm.executeUpdate(); 
    }
    
    public static Admin searchAdmin(String adminId) throws ClassNotFoundException, SQLException{
        String sql = "Select * From admin where userId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, adminId);
        ResultSet rst = stm.executeQuery();
        if(rst.next()){
            Admin admin=new Admin(
                rst.getString("userId"),rst.getString("name"),rst.getString("address"), rst.getInt("phoneNo"),
                    rst.getString("email"),rst.getString("password"));
            return admin;
        }else{
            return null;
        }
    }
    
    public static boolean isCorrectPasword(String adminId,String password) throws ClassNotFoundException, SQLException{
        String sql = "Select * From admin where userId=? and password=password(?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, adminId);
        stm.setObject(2, password);
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
    
    public static ArrayList<Admin> getAllAdmin() throws ClassNotFoundException, SQLException{
        Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Admin");
        ArrayList<Admin>adminList=new ArrayList<>();
        while(rst.next()){
            Admin admin=new Admin(
                rst.getString("userId"),rst.getString("name"),rst.getString("address"), rst.getInt("phoneNo"),
                    rst.getString("email"),rst.getString("password"));
            adminList.add(admin);
        }
        return adminList; 
    }

}

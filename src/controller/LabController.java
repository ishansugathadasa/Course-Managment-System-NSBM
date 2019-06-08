/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Lab;

/**
 *
 * @author DinukaMedis
 */
public class LabController {
    public static int addLab(Lab lab) throws ClassNotFoundException, SQLException{
        String sql = "Insert into lab values(?)";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, lab.getLabId());
        return  stm.executeUpdate(); 
    }
    
//    public static int updateLab(Lab lab) throws ClassNotFoundException, SQLException{
//        String sql = "Update lab set admissionNo=?,result=? where labId=?";
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(sql);
//        stm.setObject(3, lab.getLabId());
//        return  stm.executeUpdate();
//    }
    
    public static int deleteLab(String labId) throws ClassNotFoundException, SQLException{
        String sql = "Delete From lab where labId=?";
        Connection conn = DBConnection.getDBConnection().getConnection();
        PreparedStatement stm = conn.prepareStatement(sql);
        stm.setObject(1, labId);
        return  stm.executeUpdate(); 
    }
    
//    public static Lab searchLab(String labId) throws ClassNotFoundException, SQLException{
//        String sql = "Select * From lab where labId=?";
//        Connection conn = DBConnection.getDBConnection().getConnection();
//        PreparedStatement stm = conn.prepareStatement(sql);
//        stm.setObject(1, labId);
//        ResultSet rst = stm.executeQuery();
//        if(rst.next()){
//            Lab lab=new Lab(
//                rst.getString("labId"),rst.getString("labDate"),rst.getString("subjectCode"));
//            return lab;
//        }else{
//            return null;
//        }
//    }
    
//    public static ArrayList<Lab> getAllLab() throws ClassNotFoundException, SQLException{
//        Connection conn=DBConnection.getDBConnection().getConnection();
//        Statement stm=conn.createStatement();
//        ResultSet rst=stm.executeQuery("Select * From Lab");
//        ArrayList<Lab>labList=new ArrayList<>();
//        while(rst.next()){
//            Lab lab=new Lab(
//                rst.getString("labId"),rst.getString("labDate"),rst.getString("subjectCode"));
//            labList.add(lab);
//        }
//        return labList; 
//    }
}

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

/**
 *
 * @author DinukaMedis
 */
public class UserController {
    
    public static boolean checkPassword(String userId,String password) throws SQLException, ClassNotFoundException{
        String sql = "Select * From Users where userId=?";
        Connection connection = DBConnection.getDBConnection().getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setObject(1, userId);
        ResultSet resultSet = statement.executeQuery();
        if(resultSet.next()){
//            User user=new User(resultSet.getString("userId"), resultSet.getString("password"));
            String password1=resultSet.getString("password");
            if(password.equals(password1)){
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
    /*
    Connection conn=DBConnection.getDBConnection().getConnection();
        Statement stm=conn.createStatement();
        ResultSet rst=stm.executeQuery("Select * From Customer");
        ArrayList<Customer>customerList=new ArrayList<>();
        while(rst.next()){
            Customer customer=new Customer(rst.getString("id"),rst.getString("name"),rst.getString("address"),rst.getDouble("salary"));
            customerList.add(customer);
        }
        return customerList;
    */
}

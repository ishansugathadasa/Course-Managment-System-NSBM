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
import model.BscSubject;
import model.MscSubjects;
import model.Payment;

/**
 *
 * @author DinukaMedis
 */
public class PaymentController {
    public static boolean makeBscPayment(Payment payment,BscSubject bscSubject) throws ClassNotFoundException, SQLException{
        String sql="INSERT INTO Payment VALUES(?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setObject(1, payment.getPaymentId());
            preparedStatement.setObject(2, payment.getAdmissionNo());
            preparedStatement.setObject(3, payment.getAmount());
            preparedStatement.setObject(4, payment.getDate());
            int rst=preparedStatement.executeUpdate();
            if (rst>0) {
                int isUpdated=BscSubjectController.updateBscSubject(bscSubject);
                if (isUpdated>0) {
                    connection.commit();
                    return true;
                }
                connection.rollback();
            }
            connection.rollback();
            return false;   
        }finally{
            connection.setAutoCommit(true);
        }
           
    }
    
    
    public static boolean makeMscPayment(Payment payment,MscSubjects mscSubjects) throws ClassNotFoundException, SQLException{
        String sql="INSERT INTO Payment VALUES(?,?,?,?)";
        Connection connection=DBConnection.getDBConnection().getConnection();
        connection.setAutoCommit(false);
        try{
            PreparedStatement preparedStatement=connection.prepareStatement(sql);
            preparedStatement.setObject(1, payment.getPaymentId());
            preparedStatement.setObject(2, payment.getAdmissionNo());
            preparedStatement.setObject(3, payment.getAmount());
            preparedStatement.setObject(4, payment.getDate());
            int rst=preparedStatement.executeUpdate();
            if (rst>0) {
                int isUpdated=MscSubjectController.updateMscSubjects(mscSubjects);
                if (isUpdated>0) {
                    connection.commit();
                    return true;
                }
                connection.rollback();
            }
            connection.rollback();
            return false;   
        }finally{
            connection.setAutoCommit(true);
        }
           
    }
}

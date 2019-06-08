/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DinukaMedis
 */
public class Payment {
    private String paymentId;
    private String admissionNo;
    private double amount;
    private String date;

    public Payment(String paymentId, String admissionNo, double amount, String date) {
        this.paymentId = paymentId;
        this.admissionNo = admissionNo;
        this.amount = amount;
        this.date = date;
    }

    /**
     * @return the paymentId
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the admissionNo
     */
    public String getAdmissionNo() {
        return admissionNo;
    }

    /**
     * @param admissionNo the admissionNo to set
     */
    public void setAdmissionNo(String admissionNo) {
        this.admissionNo = admissionNo;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
}

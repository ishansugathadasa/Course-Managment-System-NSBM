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
public class MscSubjects {
    private String subjectCode ;
    private String admissionNo;
    private String paymentId;
    private double amount;
    private String enrolledDate;

    public MscSubjects(String subjectCode, String admissionNo, String paymentId, double amount, String enrolledDate) {
        this.subjectCode = subjectCode;
        this.admissionNo = admissionNo;
        this.paymentId = paymentId;
        this.amount = amount;
        this.enrolledDate = enrolledDate;
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
     * @return the subjectCode
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * @param subjectCode the subjectCode to set
     */
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
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
     * @return the enrolledDate
     */
    public String getEnrolledDate() {
        return enrolledDate;
    }

    /**
     * @param enrolledDate the enrolledDate to set
     */
    public void setEnrolledDate(String enrolledDate) {
        this.enrolledDate = enrolledDate;
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
}

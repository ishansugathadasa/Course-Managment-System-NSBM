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
public class GetMscSubjects {
    private String subjectCode ;
    private String admissionNo;
    private double amount;
    private String enrolledDate;
    private String name;
    private String courseId;
    private String lecturerId;
    private String labId;
    private int year;
    private int semester;
    private boolean compulsary;
    private int noOfCredites;
    private double fee;

    public GetMscSubjects(String subjectCode, String admissionNo, double amount, String enrolledDate, String name, String courseId, String lecturerId, String labId, int year, int semester, boolean compulsary, int noOfCredites, double fee) {
        this.subjectCode = subjectCode;
        this.admissionNo = admissionNo;
        this.amount = amount;
        this.enrolledDate = enrolledDate;
        this.name = name;
        this.courseId = courseId;
        this.lecturerId = lecturerId;
        this.labId = labId;
        this.year = year;
        this.semester = semester;
        this.compulsary = compulsary;
        this.noOfCredites = noOfCredites;
        this.fee = fee;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the courseId
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * @param courseId the courseId to set
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    /**
     * @return the lecturerId
     */
    public String getLecturerId() {
        return lecturerId;
    }

    /**
     * @param lecturerId the lecturerId to set
     */
    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    /**
     * @return the labId
     */
    public String getLabId() {
        return labId;
    }

    /**
     * @param labId the labId to set
     */
    public void setLabId(String labId) {
        this.labId = labId;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the semester
     */
    public int getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(int semester) {
        this.semester = semester;
    }

    /**
     * @return the compulsary
     */
    public boolean isCompulsary() {
        return compulsary;
    }

    /**
     * @param compulsary the compulsary to set
     */
    public void setCompulsary(boolean compulsary) {
        this.compulsary = compulsary;
    }

    /**
     * @return the noOfCredites
     */
    public int getNoOfCredites() {
        return noOfCredites;
    }

    /**
     * @param noOfCredites the noOfCredites to set
     */
    public void setNoOfCredites(int noOfCredites) {
        this.noOfCredites = noOfCredites;
    }

    /**
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * @param fee the fee to set
     */
    public void setFee(double fee) {
        this.fee = fee;
    }
}

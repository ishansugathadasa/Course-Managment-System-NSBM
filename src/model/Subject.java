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
public class Subject {
    private String subjectCode;
    private String name;
    private String courseId;
    private String lecturerId;
    private String labId;
    private int year;
    private int semester;
    private boolean compulsary;
    private int noOfCredites;
    private double fee;

    public Subject(String subjectCode, String name, String courseId, String lecturerId, String labId, int year, int semester, boolean compulsary, int noofCredites, double fee) {
        this.subjectCode = subjectCode;
        this.name = name;
        this.courseId = courseId;
        this.lecturerId = lecturerId;
        this.labId = labId;
        this.year = year;
        this.semester = semester;
        this.compulsary = compulsary;
        this.noOfCredites = noofCredites;
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
    public String getLectureId() {
        return getLecturerId();
    }

    /**
     * @param lectureId the lecturerId to set
     */
    public void setLectureId(String lectureId) {
        this.setLecturerId(lectureId);
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
    public int getNoofCredites() {
        return noOfCredites;
    }

    /**
     * @param noofCredites the noOfCredites to set
     */
    public void setNoofCredites(int noofCredites) {
        this.noOfCredites = noofCredites;
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

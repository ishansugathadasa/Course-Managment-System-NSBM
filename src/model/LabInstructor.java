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
public class LabInstructor {
    private String instructorId;
    private String labId;
    private String startTime;
    private String endTime;

    public LabInstructor(String instructorId, String labId, String startTime, String endTime) {
        this.instructorId = instructorId;
        this.labId = labId;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    /**
     * @return the instructorId
     */
    public String getInstructorId() {
        return instructorId;
    }

    /**
     * @param instructorId the instructorId to set
     */
    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
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
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    
}

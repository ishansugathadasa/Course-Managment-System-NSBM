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
public class MscExam {
    private String examId;
    private String admissionNo;
    private String result;

    public MscExam(String examId, String admissionNo, String result) {
        this.examId = examId;
        this.admissionNo = admissionNo;
        this.result = result;
    }

    /**
     * @return the examId
     */
    public String getExamId() {
        return examId;
    }

    /**
     * @param examId the examId to set
     */
    public void setExamId(String examId) {
        this.examId = examId;
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
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }
}

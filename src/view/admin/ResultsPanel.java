/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import controller.ExamController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Exam;

/**
 *
 * @author DinukaMedis
 */
public class ResultsPanel extends javax.swing.JPanel {

    private AdminMain adminMain;
    /**
     * Creates new form ResultsPanel
     */
    public ResultsPanel() {
        initComponents();
    }
    
    public ResultsPanel(AdminMain adminMain) {
        initComponents();
        this.adminMain=adminMain;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        examIdTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subjectCodeTxt = new javax.swing.JTextField();
        examDateTxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        searchBydateBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        xCelLoadPanel = new javax.swing.JPanel();
        searchByExamIdBtn = new javax.swing.JButton();
        searchBySubCodeBtn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        examIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(examIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 240, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Exame Id :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Subject Code :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 110, 30));

        subjectCodeTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(subjectCodeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 240, -1));

        examDateTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel1.add(examDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 240, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Exam Date :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 100, 30));

        searchBydateBtn.setText("Search");
        searchBydateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBydateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBydateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 120, 30));

        xCelLoadPanel.setLayout(new javax.swing.BoxLayout(xCelLoadPanel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(xCelLoadPanel);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 1030, 290));

        searchByExamIdBtn.setText("Search");
        searchByExamIdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByExamIdBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchByExamIdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 120, 30));

        searchBySubCodeBtn.setText("Search");
        searchBySubCodeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBySubCodeBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBySubCodeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 120, 30));

        jButton5.setText("Upload");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, 150, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBydateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBydateBtnActionPerformed
        try {
            ArrayList<Exam> exams = ExamController.getAllExam();
            String examDate = examDateTxt.getText();
            for (Exam exam : exams) {
                ExameSelectorPanel exameSelectorPanel1=new ExameSelectorPanel(exam.getExamId(), exam.getExamId()+":"+exam.getSubjectCode()+":"+examDate, examDate);
                xCelLoadPanel.add(exameSelectorPanel1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ResultsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchBydateBtnActionPerformed

    private void searchByExamIdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByExamIdBtnActionPerformed
        try {
            ArrayList<Exam> exams = ExamController.getAllExam();
            String examId = examIdTxt.getText();
            for (Exam exam : exams) {
                ExameSelectorPanel exameSelectorPanel1=new ExameSelectorPanel(examId, examId+":"+exam.getSubjectCode()+":"+exam.getExamDate(), exam.getExamDate());
                xCelLoadPanel.add(exameSelectorPanel1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ResultsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchByExamIdBtnActionPerformed

    private void searchBySubCodeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBySubCodeBtnActionPerformed
        try {
            ArrayList<Exam> exams = ExamController.getAllExam();
            String subjectCode = subjectCodeTxt.getText();
            for (Exam exam : exams) {
                ExameSelectorPanel exameSelectorPanel1=new ExameSelectorPanel(exam.getExamId(), exam.getExamId()+":"+subjectCode+":"+exam.getExamDate(), exam.getExamDate());
                xCelLoadPanel.add(exameSelectorPanel1);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ResultsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchBySubCodeBtnActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        AddResultsPanel addResultsPanel=new AddResultsPanel();
        adminMain.mainWindow.removeAll();
        adminMain.mainWindow.add(addResultsPanel);
        adminMain.mainWindow.repaint();
        adminMain.mainWindow.revalidate();
        addResultsPanel.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField examDateTxt;
    private javax.swing.JTextField examIdTxt;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchByExamIdBtn;
    private javax.swing.JButton searchBySubCodeBtn;
    private javax.swing.JButton searchBydateBtn;
    private javax.swing.JTextField subjectCodeTxt;
    private javax.swing.JPanel xCelLoadPanel;
    // End of variables declaration//GEN-END:variables
}
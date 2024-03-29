/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.admin;

import controller.AdminController;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Admin;
import other.ComboSearch;
import other.IDGenerator;

/**
 *
 * @author DinukaMedis
 */
public class ManageAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAdminPanel
     */
    public ManageAdminPanel() {
        initComponents();
        fillAdminIdCombo();
        adminIdCombo.setVisible(true);
        adminIdTxt.setVisible(false);
        addBtn.setVisible(false);
        newAdminBtn.setVisible(true);
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
        picFrame = new javax.swing.JLabel();
        changePicBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        emailTxt = new javax.swing.JTextField();
        phoneNoTxt = new javax.swing.JTextField();
        adminIdTxt = new javax.swing.JTextField();
        nameTxt = new javax.swing.JTextField();
        VisibleFalse = new javax.swing.JLabel();
        VisibleTrue = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        passwordTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        adminIdCombo = new javax.swing.JComboBox<>();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        newAdminBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        picFrame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profilePics/dpSample.png"))); // NOI18N
        picFrame.setText("jLabel1");
        picFrame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(picFrame, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 110, 150));

        changePicBtn.setText("Change");
        changePicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePicBtnActionPerformed(evt);
            }
        });
        jPanel1.add(changePicBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Basic Info", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Admin Id :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Name :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, 30));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("E mail :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Phone No :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Address :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 30));

        addressTxt.setColumns(20);
        addressTxt.setRows(5);
        jScrollPane1.setViewportView(addressTxt);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 260, 110));

        emailTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(emailTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 310, -1));

        phoneNoTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(phoneNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 190, -1));

        adminIdTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(adminIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, -1));

        nameTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(nameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 310, -1));

        VisibleFalse.setBackground(new java.awt.Color(210, 205, 205));
        VisibleFalse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        VisibleFalse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisibleFalseMouseClicked(evt);
            }
        });
        jPanel2.add(VisibleFalse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 20, 30));

        VisibleTrue.setBackground(new java.awt.Color(210, 205, 205));
        VisibleTrue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye.png"))); // NOI18N
        VisibleTrue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VisibleTrueMouseClicked(evt);
            }
        });
        jPanel2.add(VisibleTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 20, 30));

        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordFieldKeyReleased(evt);
            }
        });
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 270, 30));

        passwordTxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jPanel2.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 270, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel12.setText("Password :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, 30));

        adminIdCombo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adminIdCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                adminIdComboItemStateChanged(evt);
            }
        });
        jPanel2.add(adminIdCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 920, 360));

        deleteBtn.setBackground(new java.awt.Color(51, 255, 255));
        deleteBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 190, 40));

        updateBtn.setBackground(new java.awt.Color(51, 255, 255));
        updateBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 190, 40));

        addBtn.setBackground(new java.awt.Color(51, 255, 255));
        addBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel1.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 190, 40));

        newAdminBtn.setBackground(new java.awt.Color(51, 255, 255));
        newAdminBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        newAdminBtn.setText("NEW ADMIN");
        newAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAdminBtnActionPerformed(evt);
            }
        });
        jPanel1.add(newAdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 190, 40));

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

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            String adminId=adminIdCombo.getSelectedItem().toString();
            int isDeleted=AdminController.deleteAdmin(adminId);
            if (isDeleted>0) {
                JOptionPane.showMessageDialog(this, "Admin Deleted successfully....");
                setTxtFieldEmpty();
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong....");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        try {
            String adminId=adminIdCombo.getSelectedItem().toString();
            String name=nameTxt.getText();
            String email=emailTxt.getText();
            String address=addressTxt.getText();
            int phoneNo=Integer.parseInt(phoneNoTxt.getText());
            String password=passwordTxt.getText();

            Admin admin=new Admin(adminId, name, address, phoneNo, email, password);
            int isUpdated=AdminController.updateAdmin(admin);
            if (isUpdated>0) {
                JOptionPane.showMessageDialog(this, "Admin Updated successfully....");
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong....");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        try {
            String adminId=adminIdTxt.getText();
            String name=nameTxt.getText();
            String email=emailTxt.getText();
            String address=addressTxt.getText();
            int phoneNo=Integer.parseInt(phoneNoTxt.getText());
            String password=passwordTxt.getText();

            Admin admin=new Admin(adminId, name, address, phoneNo, email, password);
            int isAdded=AdminController.addAdmin(admin);
            if (isAdded>0) {
                JOptionPane.showMessageDialog(this, "Admin Added successfully....");
                adminIdCombo.setVisible(true);
                adminIdTxt.setVisible(false);
                addBtn.setVisible(false);
                newAdminBtn.setVisible(true);
                setTxtFieldEmpty();
            }else{
                JOptionPane.showMessageDialog(this, "Somthing wrong....");
                adminIdCombo.setVisible(true);
                adminIdTxt.setVisible(false);
                addBtn.setVisible(false);
                newAdminBtn.setVisible(true);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(SearchUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void newAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAdminBtnActionPerformed
        try {
            String newId = IDGenerator.getNewId("admin", "userId", "a");
            adminIdTxt.setText(newId);
            adminIdCombo.setVisible(false);
            adminIdTxt.setVisible(true);
            addBtn.setVisible(true);
            newAdminBtn.setVisible(false);
            setTxtFieldEmpty();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ManageAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_newAdminBtnActionPerformed

    private void adminIdComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_adminIdComboItemStateChanged
        if (adminIdCombo.getSelectedItem()!=null) {
            try {
                String adminId = adminIdCombo.getSelectedItem().toString();
                Admin admin=AdminController.searchAdmin(adminId);
                if (admin!=null) {
                    nameTxt.setText(admin.getName());
                    addressTxt.setText(admin.getAddress());
                    emailTxt.setText(admin.getEmail());
                    phoneNoTxt.setText(Integer.toString(admin.getPhoneNo()));
                    passwordTxt.setText(admin.getPassword());
                }else{
                    JOptionPane.showMessageDialog(this, "Somthing wrong...");
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(ManageAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_adminIdComboItemStateChanged

    private void changePicBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePicBtnActionPerformed
        try {
            JFileChooser chooser = new JFileChooser();
            chooser.setDialogTitle("Save Image");
            chooser.setFileFilter(new FileNameExtensionFilter("IMAGES ONLY", "png", "jpeg", "jpg")); //this file extentions are shown
            BufferedImage image=new BufferedImage(110, 150, BufferedImage.TRANSLUCENT);
            int showSaveDialog = chooser.showSaveDialog(this);
            String filePath = "G:\\UCSC\\2nd year\\2year1sem\\SCS2104_Programming III\\"
                    + "JAVA take home\\NewProject\\TakeHomeAssignment_New\\src\\images\\profilePics";//chooser.getCurrentDirectory().toString().replace("\\", "/");
            String fileName = chooser.getSelectedFile().getName(); //get user entered file name to save
            ImageIO.write(image, "PNG", new File(filePath + "/" + fileName + ".png"));
        } catch (IOException ex) {
            Logger.getLogger(ManageAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_changePicBtnActionPerformed

    private void VisibleFalseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleFalseMouseClicked
        VisibleFalse.setVisible(false);
        passwordTxt.setVisible(false);
        passwordField.setVisible(true);
        VisibleTrue.setVisible(true);
    }//GEN-LAST:event_VisibleFalseMouseClicked

    private void VisibleTrueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VisibleTrueMouseClicked
        VisibleTrue.setVisible(false);
        passwordTxt.setVisible(true);
        passwordField.setVisible(false);
        VisibleFalse.setVisible(true);
    }//GEN-LAST:event_VisibleTrueMouseClicked

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void passwordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyReleased
        passwordTxt.setText(passwordField.getText());
    }//GEN-LAST:event_passwordFieldKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel VisibleFalse;
    private javax.swing.JLabel VisibleTrue;
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea addressTxt;
    private javax.swing.JComboBox<String> adminIdCombo;
    private javax.swing.JTextField adminIdTxt;
    private javax.swing.JButton changePicBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton newAdminBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JTextField phoneNoTxt;
    private javax.swing.JLabel picFrame;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void fillAdminIdCombo(){
        try {
            ArrayList<Admin> admins=AdminController.getAllAdmin();
            for (Admin admin : admins) {
                adminIdCombo.addItem(admin.getAdminId());
            }
            new ComboSearch().setSearchableCombo(adminIdCombo, true, "No Admin found");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegisterUnderGraduateStudentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void setTxtFieldEmpty(){
        nameTxt.setText("");
        addressTxt.setText("");
        emailTxt.setText("");
        phoneNoTxt.setText(Integer.toString(0));
        passwordTxt.setText("");
    }
}

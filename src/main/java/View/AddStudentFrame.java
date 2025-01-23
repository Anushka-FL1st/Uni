/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.StudentController;
import Model.DatabaseConnection;
import Model.StudentModel;
import com.mycompany.university_ms.HomePage;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS Zenbook
 */
public class AddStudentFrame extends javax.swing.JFrame {
    // Create the Controller varable
    private StudentController studentController;

    
    public AddStudentFrame() {
        initComponents();
        
        // Get the database connection
    Connection connection = DatabaseConnection.getConnection();
    
    // Initialize the controller
    studentController = new StudentController(connection);
    studentController.loadAllStudents(tblStudentsDetails);
    
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudentsDetails = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblClose1 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentsDetails1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtStudentID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStudentName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtStudentPhoneNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtStudentPayment = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbStudentCourse = new javax.swing.JComboBox<>();
        cmbStudentDepartment = new javax.swing.JComboBox<>();
        btnClrStd = new javax.swing.JButton();
        btnUpdStd = new javax.swing.JButton();
        btnDelStd = new javax.swing.JButton();
        btnAddStd = new javax.swing.JButton();
        btnAddStudents2 = new javax.swing.JButton();
        btnAddStudents3 = new javax.swing.JButton();
        btnAddStudents4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(940, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel2.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS Zenbook\\Downloads\\Students.png")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 80));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data of Students");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        tblStudentsDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Phone No", "Course", "Payment Bill", "Department"
            }
        ));
        jScrollPane1.setViewportView(tblStudentsDetails);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 900, 290));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose1.setBackground(new java.awt.Color(255, 255, 255));
        lblClose1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClose1.setText("X");
        lblClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose1MouseClicked(evt);
            }
        });
        jPanel3.add(lblClose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        btnBack1.setBackground(new java.awt.Color(153, 51, 255));
        btnBack1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack1.setForeground(new java.awt.Color(255, 255, 255));
        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS Zenbook\\Downloads\\Students.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Data of Students");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        tblStudentsDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Date of Birth", "Phone No", "Batch No", "Payment Bill", "Department"
            }
        ));
        jScrollPane2.setViewportView(tblStudentsDetails1);
        if (tblStudentsDetails1.getColumnModel().getColumnCount() > 0) {
            tblStudentsDetails1.getColumnModel().getColumn(4).setHeaderValue("Batch No");
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 900, 290));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Student ID :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, -1));

        txtStudentID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Name :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 60, -1));

        txtStudentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtStudentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Phone No :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 420, 90, -1));

        txtStudentPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentPhoneNoActionPerformed(evt);
            }
        });
        jPanel3.add(txtStudentPhoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 130, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Course :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 70, -1));

        txtStudentPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentPaymentActionPerformed(evt);
            }
        });
        jPanel3.add(txtStudentPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 490, 130, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Payment :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Department :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 110, -1));

        cmbStudentCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Certificate Course", "Diploma", "Higher National Diploma (HND)", "Degree" }));
        jPanel3.add(cmbStudentCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 130, 30));

        cmbStudentDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "School of Business", "School of Computing", "School of Language" }));
        jPanel3.add(cmbStudentDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 490, 130, 30));

        btnClrStd.setBackground(new java.awt.Color(153, 51, 255));
        btnClrStd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClrStd.setForeground(new java.awt.Color(255, 255, 255));
        btnClrStd.setText("CLEAR");
        btnClrStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrStdActionPerformed(evt);
            }
        });
        jPanel3.add(btnClrStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 120, 30));

        btnUpdStd.setBackground(new java.awt.Color(153, 51, 255));
        btnUpdStd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdStd.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdStd.setText("UPDATE");
        btnUpdStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdStdActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 120, 30));

        btnDelStd.setBackground(new java.awt.Color(153, 51, 255));
        btnDelStd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelStd.setForeground(new java.awt.Color(255, 255, 255));
        btnDelStd.setText("DELETE");
        btnDelStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelStdActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 120, 30));

        btnAddStd.setBackground(new java.awt.Color(153, 51, 255));
        btnAddStd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddStd.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStd.setText("ADD");
        btnAddStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStdActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddStd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 120, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 660));

        btnAddStudents2.setBackground(new java.awt.Color(153, 51, 255));
        btnAddStudents2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddStudents2.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudents2.setText("ADD");
        btnAddStudents2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudents2ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddStudents2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 120, 30));

        btnAddStudents3.setBackground(new java.awt.Color(153, 51, 255));
        btnAddStudents3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddStudents3.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudents3.setText("ADD");
        btnAddStudents3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudents3ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddStudents3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 120, 30));

        btnAddStudents4.setBackground(new java.awt.Color(153, 51, 255));
        btnAddStudents4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddStudents4.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudents4.setText("ADD");
        btnAddStudents4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudents4ActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddStudents4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 120, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 660));

        setSize(new java.awt.Dimension(941, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int status  =  JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(status == JOptionPane.YES_OPTION){
            System.exit(status);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void btnClrStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrStdActionPerformed
        txtStudentID.setText("");
        txtStudentName.setText("");
        txtStudentPayment.setText("");
        txtStudentPhoneNo.setText("");
        cmbStudentCourse.setSelectedIndex(0);
        cmbStudentDepartment.setSelectedIndex(0);
    }//GEN-LAST:event_btnClrStdActionPerformed

    private void txtStudentPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentPaymentActionPerformed

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        
        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        AddStudentFrame.this.setVisible(false);
        
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtStudentIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIDActionPerformed

    private void txtStudentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameActionPerformed

    private void txtStudentPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentPhoneNoActionPerformed

    private void btnAddStudents2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudents2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddStudents2ActionPerformed

    private void btnAddStudents3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudents3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddStudents3ActionPerformed

    private void btnAddStudents4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudents4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddStudents4ActionPerformed

    private void btnUpdStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdStdActionPerformed
        
        String studentId = txtStudentID.getText();
        String name = txtStudentName.getText();
        String phoneNo = txtStudentPhoneNo.getText();
        String course = cmbStudentCourse.getSelectedItem().toString();
        double payment = Double.parseDouble(txtStudentPayment.getText());
        String department = cmbStudentDepartment.getSelectedItem().toString();

        StudentModel student = new StudentModel(studentId, name, phoneNo, course, payment, department);

        if (studentController.updateStudent(student)) {
            JOptionPane.showMessageDialog(null, "Student updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update student.");
        }
        studentController.loadAllStudents(tblStudentsDetails);
    }//GEN-LAST:event_btnUpdStdActionPerformed

    private void btnDelStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelStdActionPerformed
        String studentId = txtStudentID.getText();

        if (studentController.deleteStudent(studentId)) {
            JOptionPane.showMessageDialog(null, "Student deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete student.");
        }
        studentController.loadAllStudents(tblStudentsDetails);
    }//GEN-LAST:event_btnDelStdActionPerformed

    private void btnAddStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStdActionPerformed
        
        String studentId = txtStudentID.getText();
        String name = txtStudentName.getText();
        String phoneNo = txtStudentPhoneNo.getText();
        String course = cmbStudentCourse.getSelectedItem().toString();
        double payment = Double.parseDouble(txtStudentPayment.getText());
        String department = cmbStudentDepartment.getSelectedItem().toString();

        StudentModel student = new StudentModel(studentId, name, phoneNo, course, payment, department);

        if (studentController.addStudent(student)) {
            JOptionPane.showMessageDialog(null, "Student added successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add student.");
        }
        studentController.loadAllStudents(tblStudentsDetails);
    }//GEN-LAST:event_btnAddStdActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddStudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddStudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStd;
    private javax.swing.JButton btnAddStudents2;
    private javax.swing.JButton btnAddStudents3;
    private javax.swing.JButton btnAddStudents4;
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnClrStd;
    private javax.swing.JButton btnDelStd;
    private javax.swing.JButton btnUpdStd;
    private javax.swing.JComboBox<String> cmbStudentCourse;
    private javax.swing.JComboBox<String> cmbStudentDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JTable tblStudentsDetails;
    private javax.swing.JTable tblStudentsDetails1;
    private javax.swing.JTextField txtStudentID;
    private javax.swing.JTextField txtStudentName;
    private javax.swing.JTextField txtStudentPayment;
    private javax.swing.JTextField txtStudentPhoneNo;
    // End of variables declaration//GEN-END:variables
}

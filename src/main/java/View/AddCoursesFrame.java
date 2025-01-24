/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.CourseController;
import Controller.LectureController;
import Model.CourseModel;
import Model.DatabaseConnection;
import com.mycompany.university_ms.HomePage;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ASUS Zenbook
 */
public class AddCoursesFrame extends javax.swing.JFrame {

    private CourseController courseController;
    
    public AddCoursesFrame() {
        initComponents();
        Connection connection = DatabaseConnection.getConnection();
        courseController = new CourseController(connection);
        courseController.loadAllCourses(tblCourseDetails);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblClose1 = new javax.swing.JLabel();
        btnBack3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourseDetails = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtCourseDepID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCourseCredit = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCourseDuration = new javax.swing.JComboBox<>();
        btnClrCor = new javax.swing.JButton();
        btnUpdCor = new javax.swing.JButton();
        btnDelCor = new javax.swing.JButton();
        btnAddCor = new javax.swing.JButton();
        txtCourseID = new javax.swing.JTextField();
        btnCourseReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        btnBack3.setBackground(new java.awt.Color(153, 51, 255));
        btnBack3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack3.setForeground(new java.awt.Color(255, 255, 255));
        btnBack3.setText("BACK");
        btnBack3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack3ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 620, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS Zenbook\\Downloads\\Courses.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 70, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Data of Courses");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        tblCourseDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Name", "Credits", "Department ID", "Duration"
            }
        ));
        jScrollPane2.setViewportView(tblCourseDetails);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 900, 290));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Course ID :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, -1));

        txtCourseDepID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseDepIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtCourseDepID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 130, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Name :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 60, -1));

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtCourseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 130, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText("Credits :");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 70, -1));

        txtCourseCredit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseCreditActionPerformed(evt);
            }
        });
        jPanel3.add(txtCourseCredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 140, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Department  ID :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 130, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Duration :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 490, -1, -1));

        cmbCourseDuration.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "6 moths", "12 months", "2 years", "3 years", "4 years", " ", " " }));
        jPanel3.add(cmbCourseDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 100, 30));

        btnClrCor.setBackground(new java.awt.Color(153, 51, 255));
        btnClrCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClrCor.setForeground(new java.awt.Color(255, 255, 255));
        btnClrCor.setText("CLEAR");
        btnClrCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrCorActionPerformed(evt);
            }
        });
        jPanel3.add(btnClrCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 120, 30));

        btnUpdCor.setBackground(new java.awt.Color(153, 51, 255));
        btnUpdCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdCor.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdCor.setText("UPDATE");
        btnUpdCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdCorActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 120, 30));

        btnDelCor.setBackground(new java.awt.Color(153, 51, 255));
        btnDelCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelCor.setForeground(new java.awt.Color(255, 255, 255));
        btnDelCor.setText("DELETE");
        btnDelCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelCorActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 120, 30));

        btnAddCor.setBackground(new java.awt.Color(153, 51, 255));
        btnAddCor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCor.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCor.setText("ADD");
        btnAddCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCorActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 120, 30));

        txtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtCourseID, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 130, 30));

        btnCourseReport.setBackground(new java.awt.Color(153, 51, 255));
        btnCourseReport.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCourseReport.setForeground(new java.awt.Color(255, 255, 255));
        btnCourseReport.setText("REPORT");
        btnCourseReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseReportActionPerformed(evt);
            }
        });
        jPanel3.add(btnCourseReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 120, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 660));

        setSize(new java.awt.Dimension(941, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        int status  =  JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(status == JOptionPane.YES_OPTION){
            System.exit(status);
        }
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnBack3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack3ActionPerformed

        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        AddCoursesFrame.this.setVisible(false);
    }//GEN-LAST:event_btnBack3ActionPerformed

    private void txtCourseDepIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseDepIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseDepIDActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void txtCourseCreditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseCreditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseCreditActionPerformed

    private void btnClrCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrCorActionPerformed
        txtCourseCredit.setText("");
        txtCourseDepID.setText("");
        txtCourseID.setText("");
        txtCourseName.setText("");
        cmbCourseDuration.setSelectedIndex(0);
    }//GEN-LAST:event_btnClrCorActionPerformed

    private void btnUpdCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdCorActionPerformed
        String courseId = txtCourseID.getText();
        String name = txtCourseName.getText();
        int credits = Integer.parseInt(txtCourseCredit.getText());
        String departmentId = txtCourseDepID.getText();
        String duration = cmbCourseDuration.getSelectedItem().toString();

        if (courseId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Course ID is required for updating.");
            return;
        }

        CourseModel course = new CourseModel(courseId, name, credits, departmentId, duration);

        if (courseController.updateCourse(course)) {
            JOptionPane.showMessageDialog(null, "Course updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update course.");
        }
        courseController.loadAllCourses(tblCourseDetails);
    }//GEN-LAST:event_btnUpdCorActionPerformed

    private void btnDelCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelCorActionPerformed
        String courseId = txtCourseID.getText();

        if (courseId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Course ID is required for deletion.");
            return;
        }

        if (courseController.deleteCourse(courseId)) {
            JOptionPane.showMessageDialog(null, "Course deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete course.");
        }
        courseController.loadAllCourses(tblCourseDetails);
    }//GEN-LAST:event_btnDelCorActionPerformed

    
    
    private void btnAddCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCorActionPerformed
        String courseId = txtCourseID.getText();
        String name = txtCourseName.getText();
        int credits = Integer.parseInt(txtCourseCredit.getText());
        String departmentId = txtCourseDepID.getText();
        String duration = cmbCourseDuration.getSelectedItem().toString();

        CourseModel course = new CourseModel(courseId, name, credits, departmentId, duration);

        if (courseController.addCourse(course)) {
            JOptionPane.showMessageDialog(null, "Course added successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add course.");
        } 
        courseController.loadAllCourses(tblCourseDetails);
    }//GEN-LAST:event_btnAddCorActionPerformed

    private void txtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseIDActionPerformed

    private void btnCourseReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseReportActionPerformed
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/University?useSSL=false", 
                "root", 
                "Anu200439"
            );
          String reportPath = "C:\\Users\\ASUS Zenbook\\Documents\\NIBM Diploma Level (1 Year)\\EAD - Enterprice Application Develpment 1\\Course Work\\Report\\CoursesDetails.jrxml";
          JasperReport jr = JasperCompileManager.compileReport(reportPath);
          JasperPrint jp = JasperFillManager.fillReport(jr,null,connection);
          JasperViewer.viewReport(jp);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnCourseReportActionPerformed

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
            java.util.logging.Logger.getLogger(AddCoursesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCoursesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCoursesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCoursesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCoursesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCor;
    private javax.swing.JButton btnBack3;
    private javax.swing.JButton btnClrCor;
    private javax.swing.JButton btnCourseReport;
    private javax.swing.JButton btnDelCor;
    private javax.swing.JButton btnUpdCor;
    private javax.swing.JComboBox<String> cmbCourseDuration;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JTable tblCourseDetails;
    private javax.swing.JTextField txtCourseCredit;
    private javax.swing.JTextField txtCourseDepID;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    // End of variables declaration//GEN-END:variables
}

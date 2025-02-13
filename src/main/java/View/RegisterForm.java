/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.DatabaseConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS Zenbook
 */
public class RegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();
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
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnSignIn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegiUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRegiPassword = new javax.swing.JPasswordField();
        checkRegiShowPasswod = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        lblClose = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRegiConPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("University Management System");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Already have an Account?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 550, -1, -1));

        btnSignIn.setBackground(new java.awt.Color(153, 51, 255));
        btnSignIn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignIn.setForeground(new java.awt.Color(255, 255, 255));
        btnSignIn.setText("SIGN IN");
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, 330, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS Zenbook\\Downloads\\Uni Icon.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 60, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 660));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("REGISTER");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 170, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Username:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 90, -1));

        txtRegiUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel2.add(txtRegiUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 260, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Password:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 90, -1));

        txtRegiPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRegiPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegiPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtRegiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 260, 40));

        checkRegiShowPasswod.setBackground(new java.awt.Color(255, 255, 255));
        checkRegiShowPasswod.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        checkRegiShowPasswod.setText("Show Password");
        checkRegiShowPasswod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRegiShowPasswodActionPerformed(evt);
            }
        });
        jPanel2.add(checkRegiShowPasswod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 160, 30));

        btnSignUp.setBackground(new java.awt.Color(153, 51, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("SIGN UP");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        lblClose.setBackground(new java.awt.Color(255, 255, 255));
        lblClose.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel2.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Confirm Password:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 170, -1));

        txtRegiConPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRegiConPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegiConPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(txtRegiConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 260, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 500, 660));

        setSize(new java.awt.Dimension(942, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        RegisterForm.this.setVisible(false);
    }//GEN-LAST:event_btnSignInActionPerformed

    private void txtRegiPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegiPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegiPasswordActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int status  =  JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(status == JOptionPane.YES_OPTION){
            System.exit(status);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtRegiConPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegiConPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegiConPasswordActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        
        String username = txtRegiUsername.getText();
        String password = new String(txtRegiPassword.getPassword());
        String conpassword = new String(txtRegiConPassword.getPassword());
    
    if (password.equals(conpassword)) {
        try {
            
            Connection conn = DatabaseConnection.getConnection();
    
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Admins VALUES (?, ?)");
            ps.setString(1, username);
            ps.setString(2, password);
            
            int status = ps.executeUpdate();
            
            if (status == 1) {
                JOptionPane.showMessageDialog(rootPane, "Sign Up Successful!");
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
                this.setVisible(false);
            } 
            else {
                JOptionPane.showMessageDialog(rootPane, "Sign Up Failed!");
            }
        } 
        catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "SQL Error: " + e.toString());
        }
    } 
    else {
        JOptionPane.showMessageDialog(rootPane, "Passwords do not match.");
    }
    
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void checkRegiShowPasswodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRegiShowPasswodActionPerformed
        if(checkRegiShowPasswod.isSelected()){
            txtRegiPassword.setEchoChar((char)0);
            txtRegiConPassword.setEchoChar((char)0);
        }
        else{
            txtRegiPassword.setEchoChar('*');
            txtRegiConPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_checkRegiShowPasswodActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignIn;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JCheckBox checkRegiShowPasswod;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblClose;
    private javax.swing.JPasswordField txtRegiConPassword;
    private javax.swing.JPasswordField txtRegiPassword;
    private javax.swing.JTextField txtRegiUsername;
    // End of variables declaration//GEN-END:variables
}

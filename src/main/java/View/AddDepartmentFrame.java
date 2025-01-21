/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DepartmentController;
import Model.DatabaseConnection;
import Model.DepartmentModel;
import com.mycompany.university_ms.HomePage;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS Zenbook
 */
public class AddDepartmentFrame extends javax.swing.JFrame {

    private DepartmentController departmentController;
    
    public AddDepartmentFrame() {
        initComponents();
        Connection connection = DatabaseConnection.getConnection();
        departmentController = new DepartmentController(connection);
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
        btnBack4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStudentsDetails1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtDepLocation = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDepName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnClrDep = new javax.swing.JButton();
        btnUpdDep = new javax.swing.JButton();
        btnDelDep = new javax.swing.JButton();
        btnAddDep = new javax.swing.JButton();
        txtDepID = new javax.swing.JTextField();
        txtDepHead = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        btnBack4.setBackground(new java.awt.Color(153, 51, 255));
        btnBack4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack4.setForeground(new java.awt.Color(255, 255, 255));
        btnBack4.setText("BACK");
        btnBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack4ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 620, 120, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS Zenbook\\Downloads\\Department.png")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Data of Departments");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        tblStudentsDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Department ID", "Name", "Head of Department", "Location"
            }
        ));
        jScrollPane2.setViewportView(tblStudentsDetails1);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 900, 290));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Department ID :");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 140, -1));

        txtDepLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepLocationActionPerformed(evt);
            }
        });
        jPanel3.add(txtDepLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, 190, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText("Name :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 60, -1));

        txtDepName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepNameActionPerformed(evt);
            }
        });
        jPanel3.add(txtDepName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 230, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText("Head of Department :");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, 180, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Location :");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 90, -1));

        btnClrDep.setBackground(new java.awt.Color(153, 51, 255));
        btnClrDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClrDep.setForeground(new java.awt.Color(255, 255, 255));
        btnClrDep.setText("CLEAR");
        btnClrDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrDepActionPerformed(evt);
            }
        });
        jPanel3.add(btnClrDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 570, 120, 30));

        btnUpdDep.setBackground(new java.awt.Color(153, 51, 255));
        btnUpdDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdDep.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdDep.setText("UPDATE");
        btnUpdDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdDepActionPerformed(evt);
            }
        });
        jPanel3.add(btnUpdDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 120, 30));

        btnDelDep.setBackground(new java.awt.Color(153, 51, 255));
        btnDelDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelDep.setForeground(new java.awt.Color(255, 255, 255));
        btnDelDep.setText("DELETE");
        btnDelDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelDepActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 570, 120, 30));

        btnAddDep.setBackground(new java.awt.Color(153, 51, 255));
        btnAddDep.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddDep.setForeground(new java.awt.Color(255, 255, 255));
        btnAddDep.setText("ADD");
        btnAddDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDepActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddDep, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 120, 30));

        txtDepID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepIDActionPerformed(evt);
            }
        });
        jPanel3.add(txtDepID, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 160, 30));

        txtDepHead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepHeadActionPerformed(evt);
            }
        });
        jPanel3.add(txtDepHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 490, 160, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 941, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(941, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose1MouseClicked
        int status  =  JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

        if(status == JOptionPane.YES_OPTION){
            System.exit(status);
        }
    }//GEN-LAST:event_lblClose1MouseClicked

    private void btnBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack4ActionPerformed

        HomePage homePage = new HomePage();
        homePage.setVisible(true);
        AddDepartmentFrame.this.setVisible(false);
    }//GEN-LAST:event_btnBack4ActionPerformed

    private void txtDepLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepLocationActionPerformed

    private void txtDepNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepNameActionPerformed
        
    }//GEN-LAST:event_txtDepNameActionPerformed

    private void btnClrDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClrDepActionPerformed

    private void btnUpdDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdDepActionPerformed
        String departmentId = txtDepID.getText();
        String name = txtDepName.getText();
        String headOfDep = txtDepHead.getText();
        String Location = txtDepLocation.getText();
        
        if (departmentId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Department ID is required for updating.");
            return;
        }

        DepartmentModel department = new DepartmentModel(departmentId, name, headOfDep, Location);

        if (departmentController.updateDepartment(department)) {
            JOptionPane.showMessageDialog(null, "Department updated successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update department.");
        }
        
    }//GEN-LAST:event_btnUpdDepActionPerformed

    private void btnDelDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelDepActionPerformed
        String departmentId = txtDepID.getText();
        
        if (departmentId.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Department ID is required for deletion.");
            return;
        }

        if (departmentController.deleteDepartment(departmentId)) {
            JOptionPane.showMessageDialog(null, "Department deleted successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to delete department.");
        }
    }//GEN-LAST:event_btnDelDepActionPerformed

    private void btnAddDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDepActionPerformed
        String departmentId = txtDepID.getText();
        String name = txtDepName.getText();
        String headOfDep = txtDepHead.getText();
        String Location = txtDepLocation.getText();

        DepartmentModel department = new DepartmentModel(departmentId, name, headOfDep, Location);

        if (departmentController.addDepartment(department)) {
            JOptionPane.showMessageDialog(null, "Department added successfully!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to add department.");
        } 
    }//GEN-LAST:event_btnAddDepActionPerformed

    private void txtDepIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepIDActionPerformed

    private void txtDepHeadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepHeadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepHeadActionPerformed

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
            java.util.logging.Logger.getLogger(AddDepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDepartmentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDepartmentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDep;
    private javax.swing.JButton btnBack4;
    private javax.swing.JButton btnClrDep;
    private javax.swing.JButton btnDelDep;
    private javax.swing.JButton btnUpdDep;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblClose1;
    private javax.swing.JTable tblStudentsDetails1;
    private javax.swing.JTextField txtDepHead;
    private javax.swing.JTextField txtDepID;
    private javax.swing.JTextField txtDepLocation;
    private javax.swing.JTextField txtDepName;
    // End of variables declaration//GEN-END:variables
}

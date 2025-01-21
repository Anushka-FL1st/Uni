/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DepartmentModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DepartmentController {
    private Connection connection;

    public DepartmentController(Connection connection) {
        this.connection = connection;
    }

    public boolean addDepartment(DepartmentModel department) {
        try {
            String query = "INSERT INTO departments (department_id, name, head_of_department, location) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, department.getDepartmentId());
            ps.setString(2, department.getName());
            ps.setString(3, department.getHeadOfDepartment());
            ps.setString(4, department.getLocation());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateDepartment(DepartmentModel department) {
        try {
            String query = "UPDATE departments SET name = ?, head_of_department = ?, location = ? WHERE department_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, department.getName());
            ps.setString(2, department.getHeadOfDepartment());
            ps.setString(3, department.getLocation());
            ps.setString(4, department.getDepartmentId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteDepartment(String departmentId) {
        try {
            String query = "DELETE FROM departments WHERE department_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, departmentId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Method to load all departments into the JTable
    public void loadAllDepartments(javax.swing.JTable table) {
        try {
            ArrayList<DepartmentModel> departments = DepartmentModel.getAllDepartments(); // Fetch all departments
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear any previous data

            // Add each department's data to the JTable model
            for (DepartmentModel department : departments) {
                model.addRow(new Object[]{
                        department.getDepartmentId(),
                        department.getName(),
                        department.getHeadOfDepartment(),
                        department.getLocation()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}

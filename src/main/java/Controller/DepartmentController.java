/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DepartmentModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}

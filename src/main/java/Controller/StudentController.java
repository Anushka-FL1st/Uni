/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.StudentModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentController {
    private Connection connection;

    public StudentController(Connection connection) {
        this.connection = connection;
    }

    // Add Student
    public boolean addStudent(StudentModel student) {
        String query = "INSERT INTO Students VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, student.getStudentId());
            ps.setString(2, student.getName());
            ps.setString(3, student.getPhoneNo());
            ps.setString(4, student.getCourse());
            ps.setDouble(5, student.getPayment());
            ps.setString(6, student.getDepartment());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Update Student
    public boolean updateStudent(StudentModel student) {
        String query = "UPDATE Students SET Name = ?, PhoneNo = ?, Course = ?, Payment = ?, Department = ? WHERE StudentId = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, student.getName());
            ps.setString(2, student.getPhoneNo());
            ps.setString(3, student.getCourse());
            ps.setDouble(4, student.getPayment());
            ps.setString(5, student.getDepartment());
            ps.setString(6, student.getStudentId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Delete Student
    public boolean deleteStudent(String studentId) {
        String query = "DELETE FROM Students WHERE StudentId = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, studentId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


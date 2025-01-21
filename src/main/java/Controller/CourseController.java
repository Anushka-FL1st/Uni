/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CourseModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseController {
    private Connection connection;

    public CourseController(Connection connection) {
        this.connection = connection;
    }

    public boolean addCourse(CourseModel course) {
        try {
            String query = "INSERT INTO courses (course_id, name, credits, department_id, duration) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, course.getCourseId());
            ps.setString(2, course.getName());
            ps.setInt(3, course.getCredits());
            ps.setString(4, course.getDepartmentId());
            ps.setString(5, course.getDuration());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateCourse(CourseModel course) {
        try {
            String query = "UPDATE courses SET name = ?, credits = ?, department_id = ?, duration = ? WHERE course_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, course.getName());
            ps.setInt(2, course.getCredits());
            ps.setString(3, course.getDepartmentId());
            ps.setString(4, course.getDuration());
            ps.setString(5, course.getCourseId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean deleteCourse(String courseId) {
        try {
            String query = "DELETE FROM courses WHERE course_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, courseId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


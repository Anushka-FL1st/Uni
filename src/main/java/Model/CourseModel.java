/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CourseModel {
    private String courseId;
    private String name;
    private int credits;
    private String departmentId;
    private String duration;

    public CourseModel(String courseId, String name, int credits, String departmentId, String duration) {
        this.courseId = courseId;
        this.name = name;
        this.credits = credits;
        this.departmentId = departmentId;
        this.duration = duration;
    }

    // Getters and setters
    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    
    // Static method to fetch all courses from the database
    public static ArrayList<CourseModel> getAllCourses() {
        ArrayList<CourseModel> courses = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            String sql = "SELECT * FROM courses"; // Database table name
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                courses.add(new CourseModel(
                        rs.getString("course_id"),
                        rs.getString("name"),
                        rs.getInt("credits"),
                        rs.getString("department_id"),
                        rs.getString("duration")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return courses;
    }
}


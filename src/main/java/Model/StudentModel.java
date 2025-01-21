/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentModel {
    private String studentId;
    private String name;
    private String phoneNo;
    private String course;
    private double payment;
    private String department;

    public StudentModel(String studentId, String name, String phoneNo, String course, double payment, String department) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.course = course;
        this.payment = payment;
        this.department = department;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getCourse() {
        return course;
    }

    public double getPayment() {
        return payment;
    }

    public String getDepartment() {
        return department;
    }
    
     // Static method to fetch all students
    public static ArrayList<StudentModel> getAllStudents() {
        ArrayList<StudentModel> students = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            String sql = "SELECT * FROM students"; // Ensure the table has the correct schema
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                students.add(new StudentModel(
                    rs.getString("StudentId"),
                    rs.getString("Name"),
                    rs.getString("PhoneNo"),
                    rs.getString("Course"),
                    rs.getDouble("Payment"),
                    rs.getString("Department")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}

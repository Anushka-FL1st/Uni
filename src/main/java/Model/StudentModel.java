/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

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
}

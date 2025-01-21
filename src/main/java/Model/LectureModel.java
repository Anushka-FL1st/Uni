/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Model;

public class LectureModel {
    private String lectureId;
    private String name;
    private String email;
    private String phoneNo;
    private String department;
    private String specialization;

    // Constructor
    public LectureModel(String lectureId, String name, String email, String phoneNo, String department, String specialization) {
        this.lectureId = lectureId;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.department = department;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getLectureId() { return lectureId; }
    public void setLectureId(String lectureId) { this.lectureId = lectureId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}


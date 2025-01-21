/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


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
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DepartmentModel {
    private String departmentId;
    private String name;
    private String headOfDepartment;
    private String location;

    public DepartmentModel(String departmentId, String name, String headOfDepartment, String location) {
        this.departmentId = departmentId;
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.location = location;
    }

   
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getHeadOfDepartment() { return headOfDepartment; }
    public void setHeadOfDepartment(String headOfDepartment) { this.headOfDepartment = headOfDepartment; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    
   
    public static ArrayList<DepartmentModel> getAllDepartments() {
        ArrayList<DepartmentModel> departments = new ArrayList<>();
        try {
            DatabaseConnection databaseConnection = new DatabaseConnection();
            Connection connection = databaseConnection.getConnection();
            String sql = "SELECT * FROM departments"; // Database table name
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                departments.add(new DepartmentModel(
                        rs.getString("department_id"),
                        rs.getString("name"),
                        rs.getString("head_of_department"),
                        rs.getString("location")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return departments;
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import Model.LectureModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LectureController {
    private Connection connection;

    public LectureController(Connection connection) {
        this.connection = connection;
    }

    public boolean addLecture(LectureModel lecture) {
        try {
            String query = "INSERT INTO lectures (lecture_id, name, email, phone_no, department, specialization) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, lecture.getLectureId());
            ps.setString(2, lecture.getName());
            ps.setString(3, lecture.getEmail());
            ps.setString(4, lecture.getPhoneNo());
            ps.setString(5, lecture.getDepartment());
            ps.setString(6, lecture.getSpecialization());
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    public boolean updateStudent(LectureModel lecture) {
        String query = "UPDATE lectures SET name = ?, email = ?, phone_no = ?, department = ?, specialization = ? WHERE lecture_id = ?";
    try (PreparedStatement ps = connection.prepareStatement(query)) {
        ps.setString(1, lecture.getName());
        ps.setString(2, lecture.getEmail());
        ps.setString(3, lecture.getPhoneNo());
        ps.setString(4, lecture.getDepartment());
        ps.setString(5, lecture.getSpecialization());
        ps.setString(6, lecture.getLectureId());
        return ps.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
    }

    public boolean deleteLecture(String lectureId) {
        try {
            String query = "DELETE FROM lectures WHERE lecture_id = ?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, lectureId);
            int rows = ps.executeUpdate();
            return rows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    
    public void loadAllLectures(javax.swing.JTable table) {
        try {
            ArrayList<LectureModel> lectures = LectureModel.getAllLectures(); // Fetch all lectures
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing data

            for (LectureModel lecture : lectures) {
                model.addRow(new Object[]{
                        lecture.getLectureId(),
                        lecture.getName(),
                        lecture.getEmail(),
                        lecture.getPhoneNo(),
                        lecture.getDepartment(),
                        lecture.getSpecialization()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    private static Connection connection = null;
    
    // Constructor එකක් හරහා Database සම්බන්ධතාවය ආරම්භ කරන්න.
    public DatabaseConnection() {
        DatabaseConnect();
    }
    
    private void DatabaseConnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/University?useSSL=false", 
                "root", 
                "Anu200439"
            );
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database Connection Failed: " + e.toString());
        }
    }
    
    public static Connection getConnection() {
        if (connection == null) {
            new DatabaseConnection(); // Constructor එක හරහා සම්බන්ධතාවය ආරම්භ කරන්න.
        }
        return connection;
    }
}


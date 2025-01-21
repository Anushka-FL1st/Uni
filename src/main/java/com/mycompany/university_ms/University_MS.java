/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.university_ms;

import javax.swing.SwingUtilities;

/**
 *
 * @author ASUS Zenbook
 */
public class University_MS {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable(){
        @Override
        public void run(){
            new LoginFrame().setVisible(true);
        }
    });
    }
}

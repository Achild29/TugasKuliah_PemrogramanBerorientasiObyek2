/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps;

import crud_apps.Model.Database.KoneksiDB;
import crud_apps.View.Welcome.WelcomeFrameStart;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class CRUD_Apps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WelcomeFrameStart start = new WelcomeFrameStart();
        int pilihan;
        pilihan = JOptionPane.showConfirmDialog(
                null,
                "Try to Test Connection to Database?",
                "Click YES or NO",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null
        );  
        
        if (pilihan == JOptionPane.YES_OPTION) {
            getConnected();
            start.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "you're not connected to Database", "information", JOptionPane.INFORMATION_MESSAGE);
            start.setVisible(true);
        }
        
        
        
    }
    
    private static void getConnected(){
        Connection connection = KoneksiDB.getConnection();
        if (connection != null) {
            JOptionPane.showMessageDialog(null, "Connected with Database", "Information", JOptionPane.INFORMATION_MESSAGE);
            try {
                connection.close();
                JOptionPane.showMessageDialog(null, "Connection has been closed for securityr reason", "Information", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, Arrays.toString(e.getStackTrace())+ "\n" + e.getMessage(), "EROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Not Connected to Database!");
        }
    }
}

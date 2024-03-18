/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model.Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class KoneksiDB {
    private static final String URL = "jdbc:mysql://localhost:3306/CRUD_Apps";
    private static final String user = "root";
    private static final String password = "";
    
    public static Connection getConnection(){
        try {
            Connection conDB = (Connection) DriverManager.getConnection(URL, user, password);
            return conDB;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Connection to Database EROR"+"\n"+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getErrorCode());
            //forceclose
            System.exit(0);
        }
        return null;
    }
}

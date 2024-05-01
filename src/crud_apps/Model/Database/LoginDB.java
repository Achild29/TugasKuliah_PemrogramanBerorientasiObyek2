/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model.Database;

import crud_apps.Controller.LoginController;
import crud_apps.Model.LoginModel;
import crud_apps.View.Welcome.MainHomeFrame;
import crud_apps.View.Welcome.WelcomeFrame;
import crud_apps.View.Welcome.WelcomeFrameLogin;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class LoginDB {
    private LoginController loginController;
    private LoginModel loginModel;


    public LoginDB(LoginController loginController, LoginModel loginModel) {
        this.loginController = loginController;
        this.loginModel = loginModel;
    }
    
    private final String perintahSQL = "SELECT Username, Password FROM users WHERE Username = ? AND Password = ?";
    
    public void validationDB(){
        String username = loginModel.getUsername();
        String password = loginModel.getPassword();
        String passwordEncrypted = enskripPassword.md5(password);
        
        try {
            PreparedStatement ps = KoneksiDB.getConnection().prepareStatement(perintahSQL);
            ps.setString(1, username);
            ps.setString(2, passwordEncrypted);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
//                new WelcomeFrameLogin().dispose();
                JOptionPane.showMessageDialog(null, "Anda Berhasil Login sebagai"+"\n"+username,
                        "Welcome "+username, JOptionPane.INFORMATION_MESSAGE);
                //next open home
//                new MainHomeFrame().setVisible(true);
                boolean successed = true;
                loginModel.setSuccess(successed);
            }
            
            rs.close();
            ps.close(); 
            KoneksiDB.getConnection().close();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "EROR LOGIN ValidationDB", JOptionPane.ERROR);
        }
    }
}

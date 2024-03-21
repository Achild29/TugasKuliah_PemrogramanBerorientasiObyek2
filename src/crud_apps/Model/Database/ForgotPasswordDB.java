/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model.Database;

import crud_apps.Controller.ForgotPasswordController;
import crud_apps.Model.ForgotPasswordModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
//import java.lang.AutoCloseable;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class ForgotPasswordDB {
    private ForgotPasswordController forgotPasswordController;
    private ForgotPasswordModel forgotPasswordModel;
    private boolean emailAda;
    private String emailAkunDidapatkan;
    private PreparedStatement ps;
    private ResultSet rs;

    public ForgotPasswordDB(ForgotPasswordController forgotPasswordController, ForgotPasswordModel forgotPasswordModel) {
        this.forgotPasswordController = forgotPasswordController;
        this.forgotPasswordModel = forgotPasswordModel;
    }
    
    private final String perintahSQL = "SELECT Username, Email FROM users WHERE Username = ?";
    private String cariAkunIni;
    public void cariAkunIniDB(){
        cariAkunIni = forgotPasswordModel.getAkun();
        try {
            ps = KoneksiDB.getConnection().prepareStatement(perintahSQL);
            ps.setString(1, cariAkunIni);
            rs = ps.executeQuery();
            
            if (rs.next()) {
                this.emailAkunDidapatkan = rs.getString("Email");
                emailAda = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username : '"+cariAkunIni+"' yang anda masukan tidak ada di database", "Username not found", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
            rs.close();
            KoneksiDB.getConnection().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "EROR CariAkunDB", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean btnVerifyDB(){
        boolean btnVerifyDb = false;
        cariAkunIni = forgotPasswordModel.getAkun();
        String email = forgotPasswordModel.getEmail();
        try {
            ps = KoneksiDB.getConnection().prepareStatement(perintahSQL+" AND Email = ?");
            ps.setString(1, cariAkunIni);
            ps.setString(2, email);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                btnVerifyDb = true;
            }
            ps.close();
            rs.close();
            KoneksiDB.getConnection().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "EROR btnVerifyDB", JOptionPane.ERROR_MESSAGE);
        }
        return btnVerifyDb;
        
    }
    
    private final String perintahSQLupdate = "UPDATE users SET Password = ? WHERE Username = ? AND Email = ?";
    
    public boolean btnChangePasswordDb(){
        boolean btnChangePasswordDB = false;
        cariAkunIni = forgotPasswordModel.getAkun();
        String email = forgotPasswordModel.getEmail();
        String password = forgotPasswordModel.getPassword();
        String passwordEncrypted = enskripPassword.md5(password);
//        PreparedStatement psUpdate; 
        try {
            ps = KoneksiDB.getConnection().prepareStatement(perintahSQLupdate);
            ps.setString(1, passwordEncrypted);
            ps.setString(2, cariAkunIni);
            ps.setString(3, email);
            int cek;
            cek = ps.executeUpdate();
            btnChangePasswordDB = cek > 0; // ini adalah Ternary Operator
            ps.close();
//            rs.close();
            KoneksiDB.getConnection().close();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "EROR btnChangePasswordDb", JOptionPane.ERROR_MESSAGE);
        }
        return btnChangePasswordDB;
    }
    

    public boolean isEmailAda() {
        return emailAda;
    }

    public String getEmailAkunDidapatkan() {
        return emailAkunDidapatkan;
    }
    
}

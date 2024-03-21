/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model.Database;

import crud_apps.Controller.RegisterController;
import static crud_apps.Model.Database.enskripPassword.md5;
import crud_apps.Model.RegisterModel;
import crud_apps.Model.createDate;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class RegisterDB {
    
    private RegisterModel modelRegister;
    private RegisterController registerController;

    public RegisterDB(RegisterModel modelRegister, RegisterController registerController) {
        this.modelRegister = modelRegister;
        this.registerController = registerController;
    }
    
    private final String intsertIntoSQL = "INSERT INTO users (NamaLengkap, Username, Password, Email, Created) VALUES (?, ?, ?, ?, ?)";
    private final String CreateDate = createDate.getCreateDate();
    private final String cekUser = "SELECT Username FROM users WHERE Username = ?";
    
    public void validationDB(){
//        System.out.println("before if validationDB");
        if (cekUserDB()) {
//            System.out.println("di dalam ValidationDB if jika benar");
            stroringIntoDB();
        }
    }
    
    private boolean cekUserDB(){
        boolean cekUserDB = false;
//        System.out.println("di dalam CekUserDB");
//        System.out.println(cekUserDB);
        String username = modelRegister.getUsername();
        try {
            PreparedStatement ps = KoneksiDB.getConnection().prepareStatement(cekUser);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
//            System.out.println(rs);
//            System.out.println(rs.next());
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, username+" Sudah pernah didaftarkan"+"\n"+
                        "Coba dengan yang lain atau masuk ke Forgot password pada halaman Login", "invalid Username", JOptionPane.ERROR_MESSAGE);
            } else {
                cekUserDB = true;
                System.out.println(cekUserDB);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+"\n on CekUserDB", "Eror", JOptionPane.ERROR_MESSAGE);
        }
        return cekUserDB;
    }   
    
    public void stroringIntoDB(){
//        System.out.println("di dalam StoringDB");
        String nama = modelRegister.getNama();
        String username = modelRegister.getUsername();
        String email = modelRegister.getEmail();
        String password = modelRegister.getPassword();
        String enskripPass = md5(password);
        
        try {
            PreparedStatement ps = KoneksiDB.getConnection().prepareStatement(intsertIntoSQL);
            ps.setString(1, nama);
            ps.setString(2, username);
            ps.setString(3, enskripPass);
            ps.setString(4, email);
            ps.setString(5, CreateDate);
            
            int cek = ps.executeUpdate();
//            System.out.println(cek);
            
            if (cek > 0 ) {
                JOptionPane.showMessageDialog(null, "Selamat anda berhasil melakukan Registrasi", "Registration Successfull", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Registration failed", "erof", JOptionPane.ERROR_MESSAGE);
            }
            ps.close();
            KoneksiDB.getConnection().close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage()+"\n on StroingIntoDB", "EROR", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}

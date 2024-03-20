/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class RegisterModel {   
    private String Nama;
    private String Username;
    private String Email;
    private String Password;
    private String PasswordConfirm;

    public RegisterModel(String Nama, String Username, String Email, String Password, String PasswordConfirm) {
        this.Nama = Nama;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.PasswordConfirm = PasswordConfirm;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPasswordConfirm() {
        return PasswordConfirm;
    }

    public void setPasswordConfirm(String PasswordConfirm) {
        this.PasswordConfirm = PasswordConfirm;
    }
    
    
}

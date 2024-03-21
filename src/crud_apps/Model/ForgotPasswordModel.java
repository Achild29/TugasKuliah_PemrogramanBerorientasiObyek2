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
public class ForgotPasswordModel  {
    
    private String akun;
    private String email;
    private String password;
    private String passwordConfirm;

    public ForgotPasswordModel(String akun, String email) {
        this.akun = akun;
        this.email = email;
    }

    public ForgotPasswordModel(String akun) {
        this.akun = akun;
    }

    public ForgotPasswordModel(String akun, String email, String password, String passwordConfirm) {
        this.akun = akun;
        this.email = email;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
    
    public String getAkun() {
        return akun;
    }

    public void setAkun(String akun) {
        this.akun = akun;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
    
}

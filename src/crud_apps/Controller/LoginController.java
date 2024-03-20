/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import crud_apps.Model.Database.LoginDB;
import crud_apps.Model.LoginModel;
import crud_apps.View.Welcome.WelcomeFrameLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class LoginController {
    
    private WelcomeFrameLogin welcomeFrameLogin;
    private LoginModel loginModel;
    private LoginController loginController;
    private LoginDB loginDB;

    public LoginController(LoginModel loginModel, LoginController loginController) {
        this.loginModel = loginModel;
        this.loginController = loginController;
    }

    public LoginController(WelcomeFrameLogin welcomeFrameLogin, LoginModel loginModel) {
        this.welcomeFrameLogin = welcomeFrameLogin;
        this.loginModel = loginModel;
    }

    
    
    public void validation(){
        loginDB = new LoginDB(this, loginModel);
        if (editVield()) {
            loginDB.validationDB();
        }
    }
    
    private boolean editVield(){
        boolean editVield = false;
        String username = loginModel.getUsername();
        String pasword = loginModel.getUsername();
        
        if (username.equals("enter your username")) {
            JOptionPane.showMessageDialog(null, "Anda belum merubah Field Username", "Username not edited", JOptionPane.ERROR_MESSAGE);
        } else if (welcomeFrameLogin.getPasswordTxt().getEchoChar() == '\u0000') {
            JOptionPane.showMessageDialog(null, "Anda belum merubah Field Password", "Password not edited", JOptionPane.ERROR_MESSAGE);
        } else if (username.isEmpty() || pasword.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field username dan Field Password tidak boleh kosong"+"\n"+
                    "keduanya harus terisi", "Field is empty", JOptionPane.ERROR_MESSAGE);
        } else {
            editVield = true;
        }
        return editVield;
    }
}

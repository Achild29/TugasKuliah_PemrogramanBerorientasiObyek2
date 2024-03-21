/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import crud_apps.Model.Database.ForgotPasswordDB;
import crud_apps.Model.ForgotPasswordModel;
import crud_apps.View.Welcome.WelcomeFrameForgotPassword;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class ForgotPasswordController {
    
    private WelcomeFrameForgotPassword welcomeFrameForgotPassword;
    private ForgotPasswordController forgotPasswordController;
    private ForgotPasswordModel forgotPasswordModel;
    private ForgotPasswordDB forgotPasswordDB;
    private String outputDisplay;

    public ForgotPasswordController(WelcomeFrameForgotPassword welcomeFrameForgotPassword, ForgotPasswordModel forgotPasswordModel) {
        this.welcomeFrameForgotPassword = welcomeFrameForgotPassword;
        this.forgotPasswordModel = forgotPasswordModel;
    }

    public ForgotPasswordController(ForgotPasswordController forgotPasswordController, ForgotPasswordModel forgotPasswordModel) {
        this.forgotPasswordController = forgotPasswordController;
        this.forgotPasswordModel = forgotPasswordModel;
        
    }
    
    public void btnCari(){
        
        forgotPasswordDB = new ForgotPasswordDB(this, forgotPasswordModel);
        String cariAkunIni = forgotPasswordModel.getAkun();
        if (cariAkunIni.length() < 5) {
            JOptionPane.showMessageDialog(null, "Username minimal 5 Karakter", "Username is not Valid", JOptionPane.ERROR_MESSAGE);
        } else {
            forgotPasswordDB.cariAkunIniDB();
        }
        String input;
        input = forgotPasswordDB.getEmailAkunDidapatkan();
        if (forgotPasswordDB.isEmailAda()) {
            String emaildidaptkan;
            emaildidaptkan = sensorDisplay(input);
            this.outputDisplay = emaildidaptkan;
        }
        
    }
    
    public boolean btnVerify(){
        boolean btnVerify = false;
        forgotPasswordDB = new ForgotPasswordDB(this, forgotPasswordModel);
        if (forgotPasswordDB.btnVerifyDB()) {
            btnVerify = true;
        }
        return btnVerify;
    }
    
    public boolean btnChange(){
        boolean btnChange = false;
        String password = forgotPasswordModel.getPassword();
        String passwordConfirm = forgotPasswordModel.getPasswordConfirm();
        forgotPasswordDB = new ForgotPasswordDB(this, forgotPasswordModel);
        System.out.println(btnChange);
        if (welcomeFrameForgotPassword.getPasswordReg().getEchoChar() == '\u0000') {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Password", "Password Eror", JOptionPane.ERROR_MESSAGE);
        } else if (welcomeFrameForgotPassword.getPasswordConfirm().getEchoChar() == '\u0000') {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Password Confirmation", "Password Confirmation Eror", JOptionPane.ERROR_MESSAGE);
        } else if (!passwordConfirm.equals(password)) {
            JOptionPane.showMessageDialog(null, "CONFIRMATION PASSWORD harus sama dengan PASSWORD", "Confirmation Password is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if ((password.length() <= 7) && (password.length() <= 7)) {
            JOptionPane.showMessageDialog(null, "Password minimal 8 Karakter", "Password is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (password.equalsIgnoreCase("password")) {
            JOptionPane.showMessageDialog(null, "Password anda terlalu mudah, silahkan pilih password yang lain", "Password is weak", JOptionPane.ERROR_MESSAGE);
        } else if (forgotPasswordDB.btnChangePasswordDb()) {
            JOptionPane.showMessageDialog(null, "Password anda berhasil diganti", "Password has been Successfull change", JOptionPane.INFORMATION_MESSAGE);
            System.out.println(btnChange);
            btnChange = true;
        } else {
            JOptionPane.showMessageDialog(null, "Password anda GAGAL diganti", "EROR btnChangeController", JOptionPane.ERROR_MESSAGE);
        }
        return btnChange;
    }

    private String sensorDisplay(String input){
        String outString = null;
        String awalan = input.substring(0, 4);
        String akhiran = input.substring(input.length()- 6);
        int hilang = input.length()-10;
        String bintang = "*";
        String repeatStr = "";
        for (int i = 1; i < hilang; i++) {
            repeatStr += bintang;
        }
        
        outString = awalan+ repeatStr +akhiran;
        return outString;

    }

    public String getOutputDisplay() {
        return outputDisplay;
    }

}

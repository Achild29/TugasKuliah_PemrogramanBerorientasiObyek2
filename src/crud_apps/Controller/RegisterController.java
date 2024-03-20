/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import crud_apps.Model.Database.RegisterDB;
import crud_apps.Model.RegisterModel;
import crud_apps.View.Welcome.WelcomeFrameRegister;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class RegisterController{
    private WelcomeFrameRegister frameRegister;
    private RegisterModel modelRegister;
    private RegisterDB registerDB;
    private RegisterController registerController;
    

    public RegisterController(RegisterDB registerDB, RegisterController registerController) {
        this.registerDB = registerDB;
        this.registerController = registerController;
    }
    

//    public RegisterController(WelcomeFrameRegister frameRegister, RegisterModel modelRegister, RegisterDB registerDB) {
//        this.frameRegister = frameRegister;
//        this.modelRegister = modelRegister;
//        this.registerDB = registerDB;       
//    }

    public RegisterController(WelcomeFrameRegister frameRegister, RegisterModel modelRegister) {
        this.frameRegister = frameRegister;
        this.modelRegister = modelRegister;
    }
    
//    private boolean over;
    
    public void validation(){
        registerDB = new RegisterDB(modelRegister, this);
        String pas = modelRegister.getPassword();
//        System.out.println("ini password sebelum di enskripsi : "+pas);
//        System.out.println("before if ");
        if (editedField() && validField() ) {
//            System.out.println("di dalan if jika benar ");
//            System.out.println("running edit field");
//            System.out.println("next step is Enskripsi Password");
            registerDB.validationDB();
        }
//        registerDB.stroringIntoDB();
    }
    
    private boolean editedField(){
        boolean editedField = false;
//        System.out.println("di dalam edit Field");
//        System.out.println(editedField);
        String nama = modelRegister.getNama();
        String username = modelRegister.getUsername();
        String email = modelRegister.getEmail();
        String password = modelRegister.getPassword();
        String passwordConfirm = modelRegister.getPasswordConfirm();
    
        if (nama.isEmpty() || username.isEmpty() || email.isEmpty() || password.isEmpty() || passwordConfirm.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua Field tidak boleh Kosong"+"\n"+
                    "Semua Field Harus Terisi", "Eror field Kosong", JOptionPane.ERROR_MESSAGE);
        } else if (nama.equals("Type your Full name here")) {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Full name", "Full Name Eror", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals("Create your username")) {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Username", "Username Eror", JOptionPane.ERROR_MESSAGE);
        } else if (email.equals("Type your email here")) {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Email", "Email Eror", JOptionPane.ERROR_MESSAGE);
        } else if (frameRegister.getPasswordReg().getEchoChar() == '\u0000') {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Password", "Password Eror", JOptionPane.ERROR_MESSAGE);
        } else if (frameRegister.getPasswordConfirm().getEchoChar() == '\u0000') {
            JOptionPane.showMessageDialog(null, "Anda belum merubah isi dari Password Confirmation", "Password Confirmation Eror", JOptionPane.ERROR_MESSAGE);
        } else {
           editedField = true;
//           System.out.println(editedField);
        }
        
//        return over;
        return editedField;
    }
    
    private boolean validField(){
        boolean validField = false;
//        System.out.println("di dalam valid Field");
//        System.out.println(validField);
        String nama = modelRegister.getNama();
        String username = modelRegister.getUsername();
        String email = modelRegister.getEmail();
        String password = modelRegister.getPassword();
        String passwordConfirm = modelRegister.getPasswordConfirm();
        
        if (nama.length() < 5) {
            JOptionPane.showMessageDialog(null, "Full name minimal 5 Karakter", "FullName is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (username.length() < 5) {
            JOptionPane.showMessageDialog(null, "Username minimal 5 Karakter", "Username is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (username.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh menggunakan Karakter Spasi ' '", "Username is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (username.equals(nama)) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh sama dengan Nama", "Username is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (username.equalsIgnoreCase(nama)) {
            JOptionPane.showMessageDialog(null, "Username tidak boleh sama dengan Nama", "Username is not Valid", JOptionPane.ERROR_MESSAGE);            
        } else if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Masukan Alamat email yang Vaild", "Email is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (!passwordConfirm.equals(password)) {
            JOptionPane.showMessageDialog(null, "CONFIRMATION PASSWORD harus sama dengan PASSWORD", "Confirmation Password is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if ((password.length() <= 7) && (password.length() <= 7)) {
            JOptionPane.showMessageDialog(null, "Password minimal 8 Karakter", "Password is not Valid", JOptionPane.ERROR_MESSAGE);
        } else if (password.equalsIgnoreCase("password")) {
            JOptionPane.showMessageDialog(null, "Password anda terlalu mudah, silahkan pilih password yang lain", "Password is weak", JOptionPane.ERROR_MESSAGE);
        }else {
            validField = true;
//            System.out.println(validField);
        }
            
        return validField;
        
    }
    
    public static boolean isValidEmail(String Email){
        String regex = "^[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Email);
        return matcher.matches();
    }
    
}

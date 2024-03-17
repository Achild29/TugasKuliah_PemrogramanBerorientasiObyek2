/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.View.Welcome;

import crud_apps.Controller.CustomFonts;
import crud_apps.Controller.Lokasi;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Arrays;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class WelcomeFrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form WelcomeFrame
     */
    Lokasi lokasi = new Lokasi(this);
    private boolean over;
    CustomFonts fontCustoms = new CustomFonts();
    WelcomeFrameRegister register = new WelcomeFrameRegister();
    public WelcomeFrameLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBg = new javax.swing.JPanel();
        panelLoginForm = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelFormUsername = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        usernameTxtLogin = new javax.swing.JTextField();
        bgUsername = new crud_apps.Controller.CustomButton();
        panelFormPassword = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JPasswordField();
        bgPassword = new crud_apps.Controller.CustomButton();
        LoginBtn = new crud_apps.Controller.CustomButton();
        jLabel5 = new javax.swing.JLabel();
        Register = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BgFormLogin = new javax.swing.JLabel();
        BackgroundLbl = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        startMenu = new javax.swing.JMenuItem();
        registerMenu = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenuItem();
        menutTitle = new javax.swing.JMenu();
        XBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1020, 670));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBg.setBackground(new java.awt.Color(255, 255, 255));
        panelBg.setMinimumSize(new java.awt.Dimension(1020, 670));
        panelBg.setPreferredSize(new java.awt.Dimension(1020, 670));
        panelBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLoginForm.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 4, true), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Sylfaen", 1, 18), new java.awt.Color(204, 255, 255))); // NOI18N
        panelLoginForm.setOpaque(false);
        panelLoginForm.setPreferredSize(new java.awt.Dimension(510, 670));
        panelLoginForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud_apps/Model/img/yourLogo.png"))); // NOI18N
        logo.setNextFocusableComponent(usernameTxtLogin);
        panelLoginForm.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel1.setFont(fontCustoms.getRobotoBlak().deriveFont(22f)
        );
        jLabel1.setText("Sign in");
        panelLoginForm.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        panelFormUsername.setOpaque(false);
        panelFormUsername.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(fontCustoms.getPoppinsSemiBold().deriveFont(20f)
        );
        jLabel3.setText("Username");
        panelFormUsername.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        usernameTxtLogin.setFont(fontCustoms.getPoppinsMedium().deriveFont(18f)
        );
        usernameTxtLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usernameTxtLogin.setText("enter your username");
        usernameTxtLogin.setToolTipText("enter your username");
        usernameTxtLogin.setBorder(null);
        usernameTxtLogin.setFocusable(false);
        usernameTxtLogin.setNextFocusableComponent(passwordTxt);
        usernameTxtLogin.setOpaque(false);
        usernameTxtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTxtLoginFocusGained(evt);
            }
        });
        usernameTxtLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                usernameTxtLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                usernameTxtLoginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usernameTxtLoginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                usernameTxtLoginMouseReleased(evt);
            }
        });
        panelFormUsername.add(usernameTxtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 30));

        bgUsername.setBackground(new java.awt.Color(255, 255, 255));
        bgUsername.setBorder(null);
        bgUsername.setEnabled(false);
        bgUsername.setTepi(25);
        bgUsername.setWarnaClick(new java.awt.Color(255, 255, 0));
        bgUsername.setWarnaOver(new java.awt.Color(255, 153, 51));
        bgUsername.setWarnaTepi(new java.awt.Color(255, 153, 51));
        panelFormUsername.add(bgUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 50));

        panelLoginForm.add(panelFormUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 300, 150));

        panelFormPassword.setOpaque(false);
        panelFormPassword.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(fontCustoms.getPoppinsSemiBold().deriveFont(20f)
        );
        jLabel4.setText("Password");
        panelFormPassword.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        forgotPassword.setFont(fontCustoms.getPoppinsSemiBold().deriveFont(12f)
        );
        forgotPassword.setForeground(new java.awt.Color(0, 0, 204));
        forgotPassword.setText("forgot password?");
        forgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                forgotPasswordMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                forgotPasswordMouseReleased(evt);
            }
        });
        panelFormPassword.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, -1, -1));

        passwordTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passwordTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordTxt.setText("password");
        passwordTxt.setToolTipText("");
        passwordTxt.setBorder(null);
        passwordTxt.setEchoChar('\u0000');
        passwordTxt.setFocusable(false);
        passwordTxt.setNextFocusableComponent(LoginBtn);
        passwordTxt.setOpaque(false);
        passwordTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTxtFocusGained(evt);
            }
        });
        passwordTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordTxtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passwordTxtMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                passwordTxtMouseReleased(evt);
            }
        });
        passwordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordTxtKeyPressed(evt);
            }
        });
        panelFormPassword.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 250, 30));

        bgPassword.setBackground(new java.awt.Color(255, 255, 255));
        bgPassword.setBorder(null);
        bgPassword.setEnabled(false);
        bgPassword.setTepi(25);
        bgPassword.setWarnaClick(new java.awt.Color(255, 255, 0));
        bgPassword.setWarnaOver(new java.awt.Color(255, 153, 51));
        bgPassword.setWarnaTepi(new java.awt.Color(255, 153, 51));
        panelFormPassword.add(bgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, 50));

        panelLoginForm.add(panelFormPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 300, 150));

        LoginBtn.setBackground(new java.awt.Color(255, 255, 255));
        LoginBtn.setBorder(null);
        LoginBtn.setText("Login");
        LoginBtn.setFont(fontCustoms.getRobotoBlak().deriveFont(18f)
        );
        LoginBtn.setTepi(25);
        LoginBtn.setWarnaClick(new java.awt.Color(255, 255, 0));
        LoginBtn.setWarnaOver(new java.awt.Color(255, 153, 51));
        LoginBtn.setWarnaTepi(new java.awt.Color(255, 153, 51));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        LoginBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginBtnKeyPressed(evt);
            }
        });
        panelLoginForm.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 200, 50));

        jLabel5.setFont(fontCustoms.getPoppinsSemiBold().deriveFont(12f)
        );
        jLabel5.setText("are you newcomer?");
        panelLoginForm.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, -1, -1));

        Register.setFont(fontCustoms.getPoppinsSemiBold().deriveFont(12f)
        );
        Register.setForeground(new java.awt.Color(0, 0, 204));
        Register.setText("Create an account");
        Register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegisterMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RegisterMouseReleased(evt);
            }
        });
        panelLoginForm.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, -1, -1));
        panelLoginForm.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 160, 20));

        BgFormLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud_apps/Model/img/BackgroundWhiteOpacity.png"))); // NOI18N
        panelLoginForm.add(BgFormLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 20, 490, 620));

        panelBg.add(panelLoginForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, -1, 650));

        BackgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud_apps/Model/img/BackgroundWellcome1.png"))); // NOI18N
        panelBg.add(BackgroundLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(panelBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 670));

        menuBar.setBackground(new java.awt.Color(255, 255, 255));
        menuBar.setBorder(null);
        menuBar.setBorderPainted(false);
        menuBar.setFont(fontCustoms.getRobotoMedium().deriveFont(20f)
        );
        menuBar.setMaximumSize(new java.awt.Dimension(1020, 50));
        menuBar.setOpaque(false);
        menuBar.setPreferredSize(new java.awt.Dimension(1020, 30));

        menuFile.setBorder(null);
        menuFile.setText("File");
        menuFile.setFont(fontCustoms.getRobotoMedium().deriveFont(16f)
        );
        menuFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFileActionPerformed(evt);
            }
        });

        startMenu.setFont(fontCustoms.getRobotoMedium().deriveFont(16f));
        startMenu.setText("Start");
        startMenu.setBorder(null);
        startMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMenuActionPerformed(evt);
            }
        });
        menuFile.add(startMenu);

        registerMenu.setFont(fontCustoms.getRobotoMedium().deriveFont(16f));
        registerMenu.setText("Register");
        registerMenu.setBorder(null);
        registerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMenuActionPerformed(evt);
            }
        });
        menuFile.add(registerMenu);

        menuBar.add(menuFile);

        menuHelp.setBorder(null);
        menuHelp.setText("Help");
        menuHelp.setFont(fontCustoms.getRobotoMedium().deriveFont(16f)
        );

        helpMenu.setFont(fontCustoms.getRobotoMedium().deriveFont(16f));
        helpMenu.setText("Help");
        helpMenu.setBorder(null);
        menuHelp.add(helpMenu);

        aboutMenu.setFont(fontCustoms.getRobotoMedium().deriveFont(16f));
        aboutMenu.setText("About");
        aboutMenu.setBorder(null);
        aboutMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuActionPerformed(evt);
            }
        });
        menuHelp.add(aboutMenu);

        menuBar.add(menuHelp);

        menutTitle.setText(getTitle());
        menutTitle.setContentAreaFilled(false);
        menutTitle.setEnabled(false);
        menutTitle.setFont(fontCustoms.getRobotoMedium().deriveFont(14f));
        menutTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menutTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menutTitle.setIconTextGap(400);
        menutTitle.setMaximumSize(new java.awt.Dimension(1000, 50));
        menutTitle.setPreferredSize(new java.awt.Dimension(880, 24));
        menutTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                menutTitleMouseDragged(evt);
            }
        });
        menutTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menutTitleMousePressed(evt);
            }
        });
        menuBar.add(menutTitle);

        XBtn.setBorder(null);
        XBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud_apps/Model/img/button-x.png"))); // NOI18N
        XBtn.setContentAreaFilled(false);
        XBtn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        XBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XBtnMouseClicked(evt);
            }
        });
        menuBar.add(XBtn);

        setJMenuBar(menuBar);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XBtnMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_XBtnMouseClicked

    private void menutTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menutTitleMousePressed
        // TODO add your handling code here:
        lokasi.pressed(evt);
    }//GEN-LAST:event_menutTitleMousePressed

    private void menutTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menutTitleMouseDragged
        // TODO add your handling code here:
        lokasi.dragged(evt);
    }//GEN-LAST:event_menutTitleMouseDragged

    private void startMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMenuActionPerformed
        // TODO add your handling code here:
        WelcomeFrameStart start = new WelcomeFrameStart();
        start.setLocation(lokasi.p());
        start.setVisible(true);
        dispose();
    }//GEN-LAST:event_startMenuActionPerformed

    private void usernameTxtLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtLoginMouseEntered
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarnaOver());
        this.over = true;
        usernameTxtLogin.setFocusable(over);
    }//GEN-LAST:event_usernameTxtLoginMouseEntered

    private void usernameTxtLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtLoginMouseExited
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarna());
        this.over = false;
    }//GEN-LAST:event_usernameTxtLoginMouseExited

    private void usernameTxtLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtLoginMousePressed
        // TODO add your handling code here:
        bgUsername.setBackground(bgUsername.getWarnaClick());
        usernameTxtLogin.selectAll();
    }//GEN-LAST:event_usernameTxtLoginMousePressed

    private void usernameTxtLoginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameTxtLoginMouseReleased
        // TODO add your handling code here:
        if(this.over) {
            bgUsername.setBackground(bgUsername.getWarnaOver());
        } else {
            bgUsername.setBackground(bgUsername.getWarna());
        }
    }//GEN-LAST:event_usernameTxtLoginMouseReleased

    private void passwordTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMouseEntered
        // TODO add your handling code here:
        bgPassword.setBackground(bgPassword.getWarnaOver());
        this.over = true;
        passwordTxt.setFocusable(over);
    }//GEN-LAST:event_passwordTxtMouseEntered

    private void passwordTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMouseExited
        // TODO add your handling code here:
        bgPassword.setBackground(bgPassword.getWarna());
        this.over = true;
    }//GEN-LAST:event_passwordTxtMouseExited

    private void passwordTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMousePressed
        // TODO add your handling code here:
        bgPassword.setBackground(bgPassword.getWarnaClick());
        passwordTxt.setEchoChar('\u25cf');
        passwordTxt.selectAll();
    }//GEN-LAST:event_passwordTxtMousePressed

    private void passwordTxtMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordTxtMouseReleased
        // TODO add your handling code here:
        if(this.over){
            bgPassword.setBackground(bgPassword.getWarnaOver());
        } else {
            bgPassword.setBackground(bgPassword.getWarna());
        }
    }//GEN-LAST:event_passwordTxtMouseReleased

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
        System.out.println("OK");
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void forgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseEntered
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.over = true;
    }//GEN-LAST:event_forgotPasswordMouseEntered

    private void forgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseExited
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.over = false;
    }//GEN-LAST:event_forgotPasswordMouseExited

    private void forgotPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMousePressed
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.setForeground(Color.WHITE);

    }//GEN-LAST:event_forgotPasswordMousePressed

    private void forgotPasswordMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotPasswordMouseReleased
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        if(this.over) {
            forgotPassword.setForeground(new java.awt.Color(0, 0, 204));
        } else {
            forgotPassword.setForeground(new java.awt.Color(0, 0, 204));            
        }
    }//GEN-LAST:event_forgotPasswordMouseReleased

    private void RegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseEntered
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        this.over = true;
    }//GEN-LAST:event_RegisterMouseEntered

    private void RegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseExited
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.over = false;
    }//GEN-LAST:event_RegisterMouseExited

    private void RegisterMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMousePressed
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Register.setForeground(Color.WHITE);
    }//GEN-LAST:event_RegisterMousePressed

    private void RegisterMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseReleased
        // TODO add your handling code here:
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        if(this.over){
            Register.setForeground(new java.awt.Color(0,0,204));
        } else {
            Register.setForeground(new java.awt.Color(0,0,204));
        }
    }//GEN-LAST:event_RegisterMouseReleased

    private void aboutMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutMenuActionPerformed

    private void RegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterMouseClicked
        // TODO add your handling code here:
        register.setLocation(lokasi.p());
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_RegisterMouseClicked

    private void usernameTxtLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTxtLoginFocusGained
        // TODO add your handling code here:
        if (usernameTxtLogin.getText().equals("enter your username")) {
            usernameTxtLogin.setText("");
            passwordTxt.setFocusable(true);
        }
    }//GEN-LAST:event_usernameTxtLoginFocusGained

    private void passwordTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTxtFocusGained
        // TODO add your handling code here:
        if (passwordTxt.getText().equals("password")) {
            passwordTxt.setText("");
            passwordTxt.setEchoChar('\u25cf');
        } else if (passwordTxt.hasFocus()) {
            passwordTxt.selectAll();
        }
    }//GEN-LAST:event_passwordTxtFocusGained

    private void passwordTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordTxtKeyPressed
        // TODO add your handling code here:
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                LoginBtn.doClick();
        }
    }//GEN-LAST:event_passwordTxtKeyPressed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            LoginBtn.doClick();
        }
    }//GEN-LAST:event_LoginBtnKeyPressed

    private void registerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMenuActionPerformed
        // TODO add your handling code here:
        register.setLocation(lokasi.p());
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerMenuActionPerformed

    private void menuFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFileActionPerformed
        // TODO add your handling code here:
        register.setLocation(lokasi.p());
        register.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuFileActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JLabel BgFormLogin;
    private crud_apps.Controller.CustomButton LoginBtn;
    private javax.swing.JLabel Register;
    private javax.swing.JMenu XBtn;
    private javax.swing.JMenuItem aboutMenu;
    private crud_apps.Controller.CustomButton bgPassword;
    private crud_apps.Controller.CustomButton bgUsername;
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JMenuItem helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenu menutTitle;
    private javax.swing.JPanel panelBg;
    private javax.swing.JPanel panelFormPassword;
    private javax.swing.JPanel panelFormUsername;
    private javax.swing.JPanel panelLoginForm;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JMenuItem registerMenu;
    private javax.swing.JMenuItem startMenu;
    private javax.swing.JTextField usernameTxtLogin;
    // End of variables declaration//GEN-END:variables
}

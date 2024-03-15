/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class CustomFonts {
    
    private Font RobotoMedium;
    private Font RubikMedium;
    private Font Starjedise;
    private Font HandleeRegular;

    public CustomFonts() {
        File robotomedium = new File("src/CRUD_Apps/Model/Fonts/Roboto-Medium.ttf");
        File rubikmedium = new File("src/CRUD_Apps/Model/Fonts/Rubik-Medium.ttf");
        File strarjedise = new File("src/CRUD_Apps/Model/Fonts/STJEDISE.ttf");
        File handle = new File("src/CRUD_Apps/Model/Fonts/Handlee-Regular.ttf");
        try {
            RobotoMedium = Font.createFont(Font.TRUETYPE_FONT, robotomedium);
            RubikMedium = Font.createFont(Font.TRUETYPE_FONT, robotomedium);
            Starjedise = Font.createFont(Font.TRUETYPE_FONT, strarjedise);
            HandleeRegular = Font.createFont(Font.TRUETYPE_FONT, handle);
        } catch (FontFormatException | IOException e) {
            RobotoMedium = new Font("Dialog", Font.PLAIN, 20);
            RubikMedium = new Font("Dialog", Font.PLAIN, 20);
            Starjedise = new Font("Dialog", Font.PLAIN, 20);
            HandleeRegular = new Font("Dialog", Font.PLAIN, 20);
        }
    }

    public Font getRobotoMedium() {
        return RobotoMedium;
    }

    public Font getRubikMedium() {
        return RubikMedium;
    }

    public Font getStarjedise() {
        return Starjedise;
    }

    public Font getHandleeRegular() {
        return HandleeRegular;
    }
    
}

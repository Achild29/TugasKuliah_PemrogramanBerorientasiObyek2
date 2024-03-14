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
public class FontCustoms {
    
    private Font RobotoMedium;

    public FontCustoms() {
        File robotomedium = new File("src/CRUD_Apps/Model/Fonts/Roboto-Medoum.ttf");
        try {
            RobotoMedium = Font.createFont(Font.TRUETYPE_FONT, robotomedium);
        } catch (FontFormatException | IOException e) {
            RobotoMedium = new Font("Dialog", Font.PLAIN, 20);
        }
    }

    public Font getRobotoMedium() {
        return RobotoMedium;
    }
    
}

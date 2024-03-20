/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class createDate {
    
    public static String getCreateDate(){
        Date tanggal = new Date();
        SimpleDateFormat TanggalFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String CreateDate;
        CreateDate = TanggalFormat.format(tanggal);
        return CreateDate;
    }
}

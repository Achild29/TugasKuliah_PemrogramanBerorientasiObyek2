/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class Lokasi extends ComponentAdapter {
    private int xx, xy, x, y;
    private Frame frame;

    public Lokasi(Frame frame) {
        this.frame = frame;
    }

//    @Override
//    public void componentMoved(ComponentEvent e) {
//        Point lokasiFrame = frame.getLocation();
//        System.out.println("Lokasi frame : (" + lokasiFrame.getX() + ", " + lokasiFrame.getY() + ")");
//    }
    
    public void pressed(java.awt.event.MouseEvent evt){
        xx = evt.getX();
        xy = evt.getY();
        System.out.print("xx = " + xx +" , " );
        System.out.println("xy = " + xy);
    }
    
    public void dragged(java.awt.event.MouseEvent evt){
        x = evt.getXOnScreen();
        y = evt.getYOnScreen();
        setLokasiFrame(x - xx, y - xy);
    }
    
    public void setLokasiFrame(int x, int y) {
        if (isValidLocation(x, y)) {
            frame.setLocation(x, y);
        } else {
            // Handle invalid location (e.g., negative coordinates)
            System.err.println("Lokasi frame tidak valid!");
        }
    }
    
     private boolean isValidLocation(int x, int y) {
        // Implement logic to check for valid location (e.g., within screen bounds)
        return x >= 0 && y >= 0;
    }
}

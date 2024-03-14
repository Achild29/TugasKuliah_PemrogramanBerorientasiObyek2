/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_apps.Controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 *
 * @author Wahyu Khoirur Rizal
 */
public class CustomButton extends JButton{
    
    private boolean over;
    private Color warna;
    private Color warnaClick;
    private Color warnaOver;
    private Color warnaTepi;
    private int tepi = 0;

    public CustomButton() {
        
        setWarna(Color.WHITE);
        warnaOver = new Color(179, 250, 160);
        warnaClick = new Color(152, 184, 144);
        warnaTepi = new Color(30, 136, 56);
        setContentAreaFilled(false);
        
        addMouseListener(new MouseAdapter() {
            
                @Override
                public void mouseEntered(MouseEvent e) {
                    setBackground(warnaOver);
                    over = true;
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setBackground(warna);
                    over = true;
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    setBackground(warnaClick);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (over) {
                        setBackground(warnaOver);
                    } else {
                        setBackground(warna);
                    }
                }
            }
        );
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2=(Graphics2D)grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        // Paint Border
        g2.setColor(warnaTepi);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), tepi, tepi);
        g2.setColor(getBackground());
        // Border set 2 Pix
        g2.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, tepi, tepi);
        super.paintComponent(grphcs);
    }
    
    public boolean isOver() {
        return over;
    }

    public void setOver(boolean over) {
        this.over = over;
    }

    public Color getWarna() {
        return warna;
    }

    public void setWarna(Color warna) {
        this.warna = warna;
    }

    public Color getWarnaClick() {
        return warnaClick;
    }

    public void setWarnaClick(Color warnaClick) {
        this.warnaClick = warnaClick;
    }

    public Color getWarnaOver() {
        return warnaOver;
    }

    public void setWarnaOver(Color warnaOver) {
        this.warnaOver = warnaOver;
    }

    public Color getWarnaTepi() {
        return warnaTepi;
    }

    public void setWarnaTepi(Color warnaTepi) {
        this.warnaTepi = warnaTepi;
    }

    public int getTepi() {
        return tepi;
    }

    public void setTepi(int tepi) {
        this.tepi = tepi;
    }
    
}

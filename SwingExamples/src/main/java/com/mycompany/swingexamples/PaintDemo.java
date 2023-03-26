/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexamples;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Shalon
 */

public class PaintDemo extends JFrame{
    Container container;
    public PaintDemo(){
        container = this.getContentPane();
        this.setBounds(100,100,500,400);
//        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mypanel panel = new mypanel();
        container.add(panel);
        
        this.setVisible(true);
        
        
    }
    class mypanel extends JPanel{
        @Override
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(10,10,80,50);
        g.setColor(Color.green);
        g.fillRect(100,10,80,50);
        
        g.setColor(Color.BLACK);
        g.fillOval(200, 10, 50, 50);
//        ImageIcon icon = new ImageIcon ("");
//        Image image = icon.getImage();
    }
    }
    
    public static void main(String[] args) {
        new PaintDemo();
    }
}

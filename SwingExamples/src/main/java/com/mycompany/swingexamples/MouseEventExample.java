/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexamples;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Shalon
 */
public class MouseEventExample extends JFrame {
    public Container container;
    public MouseEventExample(){
        container = this.getContentPane();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,400,800,400);
        
        
        JLabel label = new JLabel("click me");
        label.addMouseListener(new myListener());
        
        
        
        label.setBounds(10,10,80,20);
        container.add(label);
        
        this.setVisible(true);
        
    }
}

//class myListener implements MouseListener{
//
//    @Override
//    public void mouseClicked(MouseEvent e) {
//        System.out.println("mouse clicked");
//    }
//
//    @Override
//    public void mousePressed(MouseEvent e) {
//        System.out.println("mouse pressed");
//    }
//
//    @Override
//    public void mouseReleased(MouseEvent e) {
//        System.out.println("mouse released");
//    }
//
//    @Override
//    public void mouseEntered(MouseEvent e) {
//        System.out.println("mouse entered");
//        
//    }
//
//    @Override
//    public void mouseExited(MouseEvent e) {
//      System.out.println("mouse exited");
//    }
//    
//}
    class myListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e){
            System.out.println("mouse clicked");
        }
       @Override
        public void mouseEntered(MouseEvent e){
            System.out.println("mouse entered");
        }
    }


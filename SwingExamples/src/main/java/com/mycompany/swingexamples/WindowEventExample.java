/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexamples;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author Shalon
 */
public class WindowEventExample extends JFrame{
     public Container container;
    public WindowEventExample(){
        container = this.getContentPane();
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,400,800,400);
        this.addWindowListener(new myWindow());
        
        this.setVisible(true);
}
    //class myWindow implements WindowListener {
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("window opened");
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        System.out.println("windows closing");
//        System.exit(0);
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//      System.out.println("window closed");
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//      System.out.println("iconified");
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//      System.out.println("deiconified");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        System.out.println("activated");
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        System.out.println("deactivated");
//    }
    
//}

class myWindow extends WindowAdapter{
    @Override 
    public void windowOpened(WindowEvent e){
        System.out.println("opened");
    }
}
}

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
public class LoginForm extends JFrame implements ActionListener{
    public Container container;
    public LoginForm(){
        JFrame frame = new JFrame();
        container= frame.getContentPane();
        container.setLayout(null);
        frame.setBounds(100,100,800,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel username = new JLabel("Username");
        JTextField txtUsername = new JTextField();
        JLabel password = new JLabel("Password");
        JTextField txtPass = new JTextField();
        JButton submit = new JButton("login");
        
         username.setBounds(20,50,100,30);
        txtUsername.setBounds(150,50,100,30);
        password.setBounds(20,100,100,30);
        txtPass.setBounds(150,100,100,30);
        submit.setBounds(20,150,100,20);
        
        container.add(username);
        container.add(txtUsername);
        container.add(password);
        container.add(txtPass);
        container.add(submit);
        
       
        
        
        
        
        
        
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

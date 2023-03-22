/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexamples;

/**
 *
 * @author Shalon
 */
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


/**
 *
 * @author Shalon
 */
public class JPanelExample extends JFrame {
    Container container;
    JPanelExample(){
        container = this.getContentPane();
        container.setLayout(null);
       
        this.setBounds(100,100,400,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        JPanel red = new JPanel();
//        red.setLayout(null);
//        red.setBounds(0,0,400,100);
//        red.setBackground(Color.red);
//        
//        JPanel green = new JPanel();
//        green.setLayout(new FlowLayout());
//        green.setBackground(Color.green);
//        green.setBounds(0,100,200,500);
//        
//        JPanel blue = new JPanel();
//        blue.setLayout(null);
//        blue.setBackground(Color.blue);
//        blue.setBounds(200,100,200,500);
//        
//        JPanel yellow = new JPanel();
//        yellow.setLayout(null);
//        yellow.setBackground(Color.yellow);
//        yellow.setBounds(0,0,100,100);
//        
//        JPanel black = new JPanel();
//        black.setLayout(null);
//        black.setBackground(Color.black);
//        black.setBounds(0,100,100,100);
//        
//        JButton button1 = new JButton("button1");
//        JButton button2 = new JButton("button2");
//        JButton button3 = new JButton("button3");
//        JButton button4 = new JButton("button4");
//        JButton button5 = new JButton("button5");
//        
//        container.add(red);
//        container.add(green);
//        container.add(blue);
//        
//        green.add(button1);
//        green.add(button2);
//        green.add(button3);
//        
//        red.add(button4);
//        button4.setBounds(50,10,80,30);
//        
//        blue.add(button5);
//        blue.add(yellow);
//        blue.add(black);
//        button5.setBounds(100,10,80,30);
//        
        JPanel gender = new JPanel();
        gender.setBounds(10,10,300,50);
        gender.setLayout(new FlowLayout());
        gender.setBackground(Color.blue);
        
        Border border= BorderFactory.createTitledBorder("Gender");
        gender.setBorder(border);
        
        JRadioButton male = new JRadioButton("male");
        JRadioButton female = new JRadioButton("female");
//        male.setBounds(10,10,)

       gender.add(male);
       gender.add(female);
       container.add(gender);
        
        this.setVisible(true);
        
    }
}

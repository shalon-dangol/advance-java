/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.swingexamples;

/**
 *
 * @author Shalon
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuExample extends JFrame implements ActionListener {
        JMenuItem item1;
        JMenuItem item2;
        JMenuItem item3;
        JMenuItem item4;
        JMenuItem item5;
        JMenuItem item6;
        JMenuItem item7;
        JMenuItem item8;
        JMenuItem item9;
        JMenuItem item10;
        JMenuItem item11;
        JMenuItem item12;
        JMenuItem item13;
        JTextArea txtArea;
        public MenuExample(){
            Container container = this.getContentPane();
             this.setSize(800, 800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Registration Form");
        this.getContentPane().setBackground(Color.WHITE);
        this.setResizable(false);
        this.setBounds(100, 100, 800, 500);
        
        //creating menu
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        JMenu view = new JMenu("View");
        
        menubar.add(file);
        menubar.add(edit);
        menubar.add(view);
        
        item1 = new JMenuItem("Open");
        item2 = new JMenuItem("Save");
        item3 = new JMenuItem("Save as");
        item4 = new JMenuItem("New");
        item5 = new JMenuItem("Close");
        item6 = new JMenuItem("Copy");
        item7 = new JMenuItem("Cut");
        item8 = new JMenuItem("Paste");
        item9 = new JMenuItem("Select All");
        item10 = new JMenuItem("Undo");
        item11 = new JMenuItem("Redo");
        item12 = new JMenuItem("Word Wrap");
        item13 = new JMenuItem("Full Screen");
        
        
       file.add(item1);
       file.add(item2);
       file.add(item3);
       file.add(item4);
       file.add(item5);
       
       edit.add(item6);
       edit.add(item7);       
       edit.add(item8);
       edit.add(item9);
       edit.add(item10);
       
       view.add(item11);
       view.add(item12);
       view.add(item13);
       
       //add action listener
       item1.addActionListener(this);
       item2.addActionListener(this);
       item3.addActionListener(this);
       item4.addActionListener(this);
       item5.addActionListener(this);
       item6.addActionListener(this);
       item7.addActionListener(this);
       item8.addActionListener(this);
       item9.addActionListener(this);
       item10.addActionListener(this);
       item11.addActionListener(this);
       item12.addActionListener(this);
       item13.addActionListener(this);
       
       txtArea = new JTextArea();
       this.add(txtArea);
       
       this.setJMenuBar(menubar);
       
       this.setVisible(true);
        
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == item9){
            txtArea.selectAll();
        }
        if(e.getSource()==item6){
            txtArea.copy();
        }
        if(e.getSource()==item8){
            txtArea.paste();
        }
    }
    
    public static void main(String[] args){
                new MenuExample();
}

}


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


public class TableDemo extends JFrame {
    public Container container;
    public TableDemo(){
        container = this.getContentPane();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,400,800,400);

       
        String data[][] = {
            {"shyam","pokhara","22"},
            {"hari","lalitpur","30"},
            {"ram","ktm","21"}
    };
        
        String colName[]={"Name","Address","Age"};
        JTable table = new JTable(data, colName);
        JScrollPane scroll = new JScrollPane(table);
        
        container.add(scroll);
        
        
        
        
        
         this.setVisible(true);
    }
    
}

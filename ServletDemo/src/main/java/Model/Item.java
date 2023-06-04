/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import backend.DBConnect;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class Item implements  Serializable{
  Connection con;
    int id, price, stock;
    String name, photo;
    
    public Item() {
        try {
            con = DBConnect.connect();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public String getPhoto() {
        return photo;
    }
    
   

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

   
    
    public void saveItem() throws SQLException, ClassNotFoundException{
        Connection con = DBConnect.connect();
        String query = "INSERT INTO `tbl_item`( `name`, `price`, `stock`, `photo`) VALUES (?,?,?,?)";
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setString(1, this.name);
        stmt.setInt(2, this.price);
        stmt.setInt(3, this.stock);
        stmt.setString(4, this.photo);
        
        stmt.execute();
        
    }
    
    public void getOneItem(){
        
    }
    
    
    
   
      
      
      
}

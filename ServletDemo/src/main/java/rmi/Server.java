/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shalon
 */
public class Server {
    public static void main(String[] args) {
        try {
            AddImplement obj = new AddImplement() {};
            Naming.rebind("rmi:///add", (Remote) obj); //add object to registry
            System.out.println("server started");
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        } catch (MalformedURLException ex) {
           System.out.println(ex.getMessage());
        }
        
    }
}

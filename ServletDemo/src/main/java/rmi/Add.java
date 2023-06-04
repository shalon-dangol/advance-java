/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package rmi;

//import jakarta.ejb.Remote;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Shalon
 */
public interface Add  extends Remote{
    public int add(int a, int b) throws RemoteException;
}

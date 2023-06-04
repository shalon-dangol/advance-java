/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmi;


import java.lang.annotation.Annotation;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Shalon
 */
public class AddImplement extends UnicastRemoteObject implements Add{

    public AddImplement() throws RemoteException{
        
    }
    
    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }


   
 


}

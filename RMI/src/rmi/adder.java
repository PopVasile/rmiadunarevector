package rmi;


import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flori
 */
public interface adder extends Remote {
    public void add(int[] n1,int[] n2) throws RemoteException;
   
}

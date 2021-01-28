package rmi;


import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class server  extends UnicastRemoteObject implements adder{
    public server() throws RemoteException
    {
        super();
    }

    public void add(int[] n1, int[] n2) throws RemoteException {
        for(int i=0;i<n1.length;i++)
        {
            System.out.println(n1[i]+n2[i]+" ");
        }
    }
   
    public static void main(String args[])
    {
        try{
            Registry reg=LocateRegistry.createRegistry(4444);
            reg.rebind("hi_server", new server());
            System.out.println("server is ready");
        }
        catch(RemoteException e)
        {
            System.out.println("Exception"+e);
        }
    }

    
    
    
}

package rmi;


import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class client {
    int []a={1,2,3,4,5,6,7,8,9};
    int []b={1,2,3,4,5,6,7,8,9};
  
    public static void main(String args[]) throws RemoteException
    {
        client c=new client();
        c.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try{
            Registry reg=LocateRegistry.getRegistry("localhost", 4444);
            adder ad=(adder) reg.lookup("hi_server");
            ad.add(a, b);
            
            
        }
        catch(NotBoundException|RemoteException e)
        {
            System.out.println("Exception"+e);
                    
        }
    }
}

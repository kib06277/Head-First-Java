package com.hfad.eighteenclass;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements  MyRemote
{
    public String sayHello()
    {
        return "Server says,'Hey'";
    }

    public MyRemoteImpl() throws RemoteException
    {

    }

    public static void main(String args[])
    {
        try
        {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("Remote Hello",service);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

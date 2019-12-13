package com.hfad.eighteenclass;
import java.rmi.*;
public interface ServiceServer extends Remote
{
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}
package com.patterns.proxy;

import com.patterns.proxy.remote.MyRemote;
import com.patterns.proxy.remote.MyRemoteImpl;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DemoRunServer {
  public static void main(String[] args) throws RemoteException, MalformedURLException {
    MyRemote service = new MyRemoteImpl();
    Registry reg = LocateRegistry.createRegistry(1099);
    reg.rebind("hello", service);
    System.out.println("server is ready");
  }
}

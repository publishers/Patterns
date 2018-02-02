package com.patterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
  public MyRemoteImpl() throws RemoteException {
  }

  @Override
  public String sayHello() throws RemoteException {
    return "Hello. It's remote access.";
  }

  public static void main(String[] args) throws RemoteException, MalformedURLException {
    MyRemote service = new MyRemoteImpl();
    Registry reg = LocateRegistry.createRegistry(1099);
    reg.rebind("hello", service);
    System.out.println("server is ready");
  }
}

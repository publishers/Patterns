package com.patterns.proxy;

import com.patterns.proxy.remote.MyRemote;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class DemoRunRMIAccess {
  public static void main(String[] args) throws RemoteException, MalformedURLException {
    try {
      Registry myReg = LocateRegistry.getRegistry("localhost", 1099);
      MyRemote stub = (MyRemote) myReg.lookup("hello");
      String response = stub.sayHello();
      System.out.println("response: " + response);
    } catch (Exception e) {
      System.err.println("Client exception: " + e.toString());
      e.printStackTrace();
    }
  }
}

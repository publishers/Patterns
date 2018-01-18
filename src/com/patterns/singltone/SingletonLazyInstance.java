package com.patterns.singltone;

public class SingletonLazyInstance {
  private volatile static SingletonLazyInstance singleInstance;

  private SingletonLazyInstance(){}

  public static SingletonLazyInstance getInstance() {
    if (singleInstance == null) {
      synchronized (singleInstance) {
        if (singleInstance == null) {
          singleInstance = new SingletonLazyInstance();
        }
      }
    }
    return singleInstance;
  }
}

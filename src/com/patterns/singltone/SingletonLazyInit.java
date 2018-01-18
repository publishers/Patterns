package com.patterns.singltone;

public class SingletonLazyInit {
  private volatile static SingletonLazyInit singletonLazyInit;

  public static SingletonLazyInit getSingletonLazyInit() {
    if (singletonLazyInit == null) {
      synchronized (singletonLazyInit) {
        if (singletonLazyInit == null) {
          singletonLazyInit = new SingletonLazyInit();
        }
      }
    }
    return singletonLazyInit;
  }
}

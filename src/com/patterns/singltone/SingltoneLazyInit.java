package com.patterns.singltone;

public class SingltoneLazyInit {
  private static SingltoneLazyInit singltoneLazyInit;

  public synchronized static SingltoneLazyInit getSingltoneLazyInit() {
    if (singltoneLazyInit == null) {
      singltoneLazyInit = new SingltoneLazyInit();
    }
    return singltoneLazyInit;
  }
}

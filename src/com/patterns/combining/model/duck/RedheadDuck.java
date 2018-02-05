package com.patterns.combining.model.duck;

import com.patterns.combining.model.Quackable;

public class RedheadDuck implements Quackable {
  @Override
  public void quack() {
    System.out.println("Quack");
  }
}

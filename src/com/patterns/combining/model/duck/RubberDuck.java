package com.patterns.combining.model.duck;

import com.patterns.combining.model.Quackable;

public class RubberDuck implements Quackable {
  @Override
  public void quack() {
    System.out.println("Squeak");
  }
}

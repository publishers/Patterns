package com.patterns.decorator.cafe;

public abstract class Beverage {
  protected String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();

}

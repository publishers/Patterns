package com.patterns.decorator.cafe;

public abstract class Beverage {
  protected String description = "Unknown Beverage";
  protected BeverageSize size;

  public Beverage() {
    this.size = BeverageSize.GRANDE;
  }

  public String getDescription() {
    return description;
  }

  public abstract double cost();

  public BeverageSize getSize() {
    return size;
  }
}

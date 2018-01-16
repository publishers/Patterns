package com.patterns.decorator.cafe.size;

import com.patterns.decorator.cafe.Beverage;

public class MiddleSize extends Size {
  private Beverage beverage;

  public MiddleSize(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .15 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Middle";
  }
}

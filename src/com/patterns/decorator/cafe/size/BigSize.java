package com.patterns.decorator.cafe.size;

import com.patterns.decorator.cafe.Beverage;

public class BigSize extends Size {
  private Beverage beverage;

  public BigSize(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .2 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Big";
  }
}

package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public class Milk extends CondimentDecorator {
  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .57 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}

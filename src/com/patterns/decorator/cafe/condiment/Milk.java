package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public class Milk extends CondimentDecorator {
  private Beverage beverage;

  public Milk(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.getSize();
  }

  @Override
  public double cost() {
    return beverage.cost() + size.costFromSize(.57);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Milk";
  }
}

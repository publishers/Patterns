package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public class Mocha extends CondimentDecorator {
  private Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.getSize();
  }

  @Override
  public double cost() {
    return beverage.cost() + size.costFromSize(.20);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }
}

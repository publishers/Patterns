package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public class Soy extends CondimentDecorator {
  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.getSize();
  }

  @Override
  public double cost() {
    return beverage.cost() + size.costFromSize(.10);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}

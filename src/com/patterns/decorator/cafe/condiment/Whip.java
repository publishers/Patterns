package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public class Whip extends CondimentDecorator {
  private Beverage beverage;

  public Whip(Beverage beverage) {
    this.beverage = beverage;
    this.size = beverage.getSize();
  }

  @Override
  public double cost() {
    return beverage.cost() + size.costFromSize(.80);
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
}

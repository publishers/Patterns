package com.patterns.decorator.caffe.condiment;

import com.patterns.decorator.caffe.Beverage;

public class Soy extends CondimentDecorator {
  private Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }
}

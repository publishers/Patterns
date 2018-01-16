package com.patterns.decorator.caffe.condiment;

import com.patterns.decorator.caffe.Beverage;

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

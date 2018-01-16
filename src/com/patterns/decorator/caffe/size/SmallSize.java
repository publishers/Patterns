package com.patterns.decorator.caffe.size;

import com.patterns.decorator.caffe.Beverage;

public class SmallSize extends Size {
  private Beverage beverage;

  public SmallSize(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public double cost() {
    return .10 + beverage.cost();
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Small";
  }
}

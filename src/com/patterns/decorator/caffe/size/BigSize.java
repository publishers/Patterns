package com.patterns.decorator.caffe.size;

import com.patterns.decorator.caffe.Beverage;

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

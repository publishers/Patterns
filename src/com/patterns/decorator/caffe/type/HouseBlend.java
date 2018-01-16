package com.patterns.decorator.caffe.type;

import com.patterns.decorator.caffe.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}

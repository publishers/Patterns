package com.patterns.decorator.cafe.type;

import com.patterns.decorator.cafe.Beverage;

public class HouseBlend extends Beverage {
  public HouseBlend() {
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return 0.89;
  }
}

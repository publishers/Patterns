package com.patterns.decorator.cafe.type;

import com.patterns.decorator.cafe.Beverage;
import com.patterns.decorator.cafe.BeverageSize;

public class HouseBlend extends Beverage {

  public HouseBlend(BeverageSize beverageSize) {
    size = beverageSize;
    description = "House Blend Coffee";
  }

  @Override
  public double cost() {
    return size.costFromSize(0.89);
  }
}

package com.patterns.decorator.cafe.type;

import com.patterns.decorator.cafe.Beverage;
import com.patterns.decorator.cafe.BeverageSize;

public class DarkRoast extends Beverage {

  public DarkRoast(BeverageSize beverageSize) {
    size = beverageSize;
    description = "Dark roast beverage";
  }

  @Override
  public double cost() {
    return size.costFromSize(1.5);
  }
}

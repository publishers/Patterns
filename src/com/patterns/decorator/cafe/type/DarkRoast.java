package com.patterns.decorator.cafe.type;

import com.patterns.decorator.cafe.Beverage;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark roast beverage";
  }

  @Override
  public double cost() {
    return 1.5;
  }
}

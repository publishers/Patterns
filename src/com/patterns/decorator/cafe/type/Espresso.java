package com.patterns.decorator.cafe.type;

import com.patterns.decorator.cafe.Beverage;
import com.patterns.decorator.cafe.BeverageSize;

public class Espresso extends Beverage {

  public Espresso(BeverageSize beverageSize) {
    size = beverageSize;
    description = "Espresso";
  }

  @Override
  public double cost() {
    return size.costFromSize(1.99);
  }
}

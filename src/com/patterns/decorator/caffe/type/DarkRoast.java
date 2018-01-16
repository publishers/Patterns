package com.patterns.decorator.caffe.type;

import com.patterns.decorator.caffe.Beverage;

public class DarkRoast extends Beverage {

  public DarkRoast() {
    description = "Dark roast beverage";
  }

  @Override
  public double cost() {
    return 1.5;
  }
}

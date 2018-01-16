package com.patterns.decorator.caffe.type;

import com.patterns.decorator.caffe.Beverage;

public class Espresso extends Beverage {

  public Espresso() {
    description = "Espresso";
  }

  @Override
  public double cost() {
    return 1.99;
  }
}

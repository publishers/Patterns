package com.patterns.decorator.caffe.condiment;

import com.patterns.decorator.caffe.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}

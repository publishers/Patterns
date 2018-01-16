package com.patterns.decorator.cafe.condiment;

import com.patterns.decorator.cafe.Beverage;

public abstract class CondimentDecorator extends Beverage {
  public abstract String getDescription();
}

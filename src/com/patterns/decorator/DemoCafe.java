package com.patterns.decorator;

import com.patterns.decorator.cafe.Beverage;
import com.patterns.decorator.cafe.condiment.Mocha;
import com.patterns.decorator.cafe.condiment.Soy;
import com.patterns.decorator.cafe.condiment.Whip;
import com.patterns.decorator.cafe.size.BigSize;
import com.patterns.decorator.cafe.size.MiddleSize;
import com.patterns.decorator.cafe.size.SmallSize;
import com.patterns.decorator.cafe.type.Espresso;
import com.patterns.decorator.cafe.type.DarkRoast;
import com.patterns.decorator.cafe.type.HouseBlend;

public class DemoCafe {
  public static void main(String[] args) {
    Beverage beverage = new Espresso();
    beverage = new SmallSize(beverage);
    System.out.println(beverage.getDescription() + " $" + beverage.cost());

    Beverage beverage2 = new DarkRoast();
    beverage2 = new Mocha(beverage2);
    beverage2 = new Mocha(beverage2);
    beverage2 = new Whip(beverage2);
    beverage2 = new BigSize(beverage2);
    System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    Beverage beverage3 = new HouseBlend();
    beverage3 = new Soy(beverage3);
    beverage3 = new Mocha(beverage3);
    beverage3 = new Whip(beverage3);
    beverage3 = new MiddleSize(beverage3);
    System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
  }
}

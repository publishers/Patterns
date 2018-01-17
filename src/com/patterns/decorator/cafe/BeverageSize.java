package com.patterns.decorator.cafe;

public enum BeverageSize {
  VENTI(20),
  GRANDE(15),
  TALL(5);

  private final double percentageCost;

  BeverageSize(double percentageCost) {
    this.percentageCost = percentageCost;
  }

  public double costFromSize(double cost) {
    return calculateCost(percentageCost, cost);
  }

  private static double calculateCost(double percent, double cost) {
    return cost + cost * percent / 100.0;
  }
}

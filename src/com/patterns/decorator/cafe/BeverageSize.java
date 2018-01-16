package com.patterns.decorator.cafe;

public enum BeverageSize {
  VENTI {
    private static final double PERCENTAGE_COST = 20;

    @Override
    public double costFromSize(double cost) {
      return calculateCost(PERCENTAGE_COST, cost);
    }
  },
  GRANDE {
    private static final double PERCENTAGE_COST = 15;

    @Override
    public double costFromSize(double cost) {
      return calculateCost(PERCENTAGE_COST, cost);
    }
  },
  TALL {
    private static final double PERCENTAGE_COST = 5;

    @Override
    public double costFromSize(double cost) {
      return calculateCost(PERCENTAGE_COST, cost);
    }
  };

  public abstract double costFromSize(double cost);

  private static double calculateCost(double percent, double cost){
    return cost + cost * percent / 100.0;
  }
}

package com.patterns.combining;

import com.patterns.combining.model.Quackable;
import com.patterns.combining.model.duck.DuckCall;
import com.patterns.combining.model.duck.MallardDuck;
import com.patterns.combining.model.duck.RedheadDuck;
import com.patterns.combining.model.duck.RubberDuck;

public class DuckSimulator {
  public static void main(String[] args) {
    new DuckSimulator().simulate();
  }

  void simulate() {
    Quackable mallardDuck = new MallardDuck();
    Quackable redheadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new RubberDuck();

    System.out.println("Duck Simulator");

    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);

  }

  void simulate(Quackable duck){
    duck.quack();
  }
}

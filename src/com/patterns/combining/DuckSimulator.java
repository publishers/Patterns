package com.patterns.combining;

import com.patterns.combining.adapter.GooseAdapter;
import com.patterns.combining.model.Quackable;
import com.patterns.combining.model.duck.DuckCall;
import com.patterns.combining.model.duck.MallardDuck;
import com.patterns.combining.model.duck.RedheadDuck;
import com.patterns.combining.model.duck.RubberDuck;
import com.patterns.combining.model.goose.Goose;

public class DuckSimulator {
  public static void main(String[] args) {
    new DuckSimulator().simulate();
  }

  void simulate() {
    Quackable mallardDuck = new MallardDuck();
    Quackable redheadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new RubberDuck();
    Quackable gooseAdapter = new GooseAdapter(new Goose());

    System.out.println("Duck Simulator");

    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
    simulate(gooseAdapter);

  }

  void simulate(Quackable duck){
    duck.quack();
  }
}

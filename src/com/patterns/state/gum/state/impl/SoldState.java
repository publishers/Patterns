package com.patterns.state.gum.state.impl;

import com.patterns.state.gum.GumballMachine;
import com.patterns.state.gum.state.State;

public class SoldState implements State {
  private GumballMachine gumballMachine;

  public SoldState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Please wait, we're already giving you gumball");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Sorry, you already turned the crank.");
  }

  @Override
  public void turnCrank() {
    System.out.println("Turning twice doesn't get you another gumball!");
  }

  @Override
  public void dispense() {
    gumballMachine.releaseBall();
    if (gumballMachine.getCount() > 0) {
      gumballMachine.setState(gumballMachine.getNoQuarterState());
    } else {
      System.out.println("Oops, out of gumballs!");
      gumballMachine.setState(gumballMachine.getSoldOutState());
    }
  }

  @Override
  public String toString() {
    return "SoldState{}";
  }
}

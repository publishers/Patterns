package com.patterns.state.gum.state.impl;

import com.patterns.state.gum.GumballMachine;
import com.patterns.state.gum.state.State;

public class HasQuarterState implements State {
  private GumballMachine gumballMachine;

  public HasQuarterState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("You can't insert another quarter");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("Quarter returned");
    gumballMachine.setState(gumballMachine.getNoQuarterState());
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned...");
    gumballMachine.setState(gumballMachine.getSoldState());
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  @Override
  public String toString() {
    return "HasQuarterState{}";
  }
}

package com.patterns.state.gum.state.impl;

import com.patterns.state.gum.GumballMachine;
import com.patterns.state.gum.state.State;

public class SoldOutState implements State {
  private GumballMachine gumballMachine;

  public SoldOutState(GumballMachine gumballMachine) {
    this.gumballMachine = gumballMachine;
  }

  @Override
  public void insertQuarter() {
    System.out.println("Gumballs have already sold.");
  }

  @Override
  public void ejectQuarter() {
    System.out.println("You can't eject, you haven't inserted a quarter yet");
  }

  @Override
  public void turnCrank() {
    System.out.println("You turned, but there are no gumballs");
  }

  @Override
  public void dispense() {
    System.out.println("No gumball dispensed");
  }

  @Override
  public String toString() {
    return "Sold Out";
  }
}

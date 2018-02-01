package com.patterns.state.gum;

import com.patterns.state.gum.state.State;
import com.patterns.state.gum.state.impl.HasQuarterState;
import com.patterns.state.gum.state.impl.NoQuarterState;
import com.patterns.state.gum.state.impl.SoldOutState;
import com.patterns.state.gum.state.impl.SoldState;

public class GumballMachine {
  private State soldOutState;
  private State noQuarterState;
  private State hasQuarterState;
  private State soldState;
  private State state;

  private int count;

  public GumballMachine(int numberGumballs) {
    this.count = numberGumballs;
    this.soldOutState = new SoldOutState(this);
    this.noQuarterState = new NoQuarterState(this);
    this.hasQuarterState = new HasQuarterState(this);
    this.soldState = new SoldState(this);
    if (numberGumballs > 0) {
      state = noQuarterState;
    }
  }

  public void insertQuarter() {
    state.insertQuarter();
  }

  public void ejectQuarter() {
    state.ejectQuarter();
  }

  public void turnCrank() {
    state.turnCrank();
    state.dispense();
  }

  public void releaseBall() {
    System.out.println("A gumball comes rolling out the slot...");
    if (count != 0) {
      count--;
    }
  }

  public void setState(State state) {
    this.state = state;
  }

  public State getHasQuarterState() {
    return hasQuarterState;
  }

  public State getSoldOutState() {
    return soldOutState;
  }

  public State getNoQuarterState() {
    return noQuarterState;
  }

  public State getSoldState() {
    return soldState;
  }

  public int getCount() {
    return count;
  }

  @Override
  public String toString() {
    return "GumballMachine{" +
            "state=" + state +
            ", count=" + count +
            '}';
  }
}

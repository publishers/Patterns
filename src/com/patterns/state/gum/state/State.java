package com.patterns.state.gum.state;

public interface State {
  void insertQuarter();

  void ejectQuarter();

  void turnCrank();

  void dispense();
}

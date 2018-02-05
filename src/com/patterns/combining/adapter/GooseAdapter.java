package com.patterns.combining.adapter;

import com.patterns.combining.model.goose.Goose;
import com.patterns.combining.model.Quackable;

public class GooseAdapter implements Quackable {
  private Goose goose;

  public GooseAdapter(Goose goose) {
    this.goose = goose;
  }

  @Override
  public void quack() {
    goose.honk();
  }
}

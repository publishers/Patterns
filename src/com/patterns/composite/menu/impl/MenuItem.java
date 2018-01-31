package com.patterns.composite.menu.impl;

import com.patterns.composite.menu.MenuComponent;

public class MenuItem implements MenuComponent{
  private String name;
  private String description;

  public MenuItem(String name, String description) {
    this.name = name;
    this.description = description;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public void print(int menuNesting) {
    System.out.println(name + " " + description);
  }

}

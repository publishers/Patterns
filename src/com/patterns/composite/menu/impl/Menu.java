package com.patterns.composite.menu.impl;

import com.patterns.composite.menu.MenuComponent;

import java.util.LinkedList;
import java.util.List;

public class Menu implements MenuComponent {
  private String name;
  private String description;
  private List<MenuComponent> components;

  public Menu(String name, String description) {
    this.name = name;
    this.description = description;
    this.components = new LinkedList<>();
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

    components.forEach(menuComponent -> {
      printSpaces(menuNesting);
      menuComponent.print(menuNesting + 1);
    });

  }

  private void printSpaces(int menuNesting) {
    for (int i = 0; i <= menuNesting * 2; i++) {
      System.out.print(" ");
    }
  }

  @Override
  public void add(MenuComponent menuComponent) {
    components.add(menuComponent);
  }

  @Override
  public void remove(MenuComponent menuComponent) {
    components.remove(menuComponent);
  }

  @Override
  public MenuComponent getChild(int childIndex) {
    return components.get(childIndex);
  }
}

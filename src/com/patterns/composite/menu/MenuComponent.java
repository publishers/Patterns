package com.patterns.composite.menu;

public interface MenuComponent{
  String getName();

  String getDescription();

  void print(int menuNesting);

  default void add(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  default void remove(MenuComponent menuComponent) {
    throw new UnsupportedOperationException();
  }

  default MenuComponent getChild(int childIndex) {
    throw new UnsupportedOperationException();
  }
}

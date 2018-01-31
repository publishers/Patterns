package com.patterns.composite;

import com.patterns.composite.menu.MenuComponent;
import com.patterns.composite.menu.impl.Menu;
import com.patterns.composite.menu.impl.MenuItem;

public class DemoRunMenu {
  public static void main(String[] args) throws InterruptedException {
    MenuComponent menu1 = getMenu(1);
    MenuComponent menu2 = getMenu(2);
    MenuComponent menu3 = getMenu(3);
    MenuComponent menu4 = getMenu(4);
    MenuComponent menu5 = getMenuItem(5);
    MenuComponent menu6 = getMenu(6);
    MenuComponent menu7 = getMenuItem(7);
    MenuComponent menu8 = getMenuItem(8);
    MenuComponent menu9 = getMenuItem(9);
    MenuComponent menu10 = getMenuItem(10);
    MenuComponent menu11 = getMenu(11);

    menu1.add(menu2);
    menu1.add(menu3);
    menu1.add(menu4);
    menu1.add(menu11);

    menu4.add(menu5);
    menu4.add(menu6);
    menu4.add(menu10);

    menu6.add(menu7);
    menu6.add(menu8);
    menu6.add(menu9);

    menu1.print(1);

  }

  private static MenuComponent getMenuItem(int index) {
    return new MenuItem("Menu item" + index, "-");
  }

  private static MenuComponent getMenu(int number) {
    return new Menu("Menu" + number, "()");
  }
}

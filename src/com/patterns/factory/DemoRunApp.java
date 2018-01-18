package com.patterns.factory;

import com.patterns.factory.pizza.type.Pizza;
import com.patterns.factory.pizza.store.PizzaStore;
import com.patterns.factory.pizza.store.ChicagoPizzaStore;
import com.patterns.factory.pizza.store.NYPizzaStore;
import com.patterns.factory.pizza.ingredient.factory.impl.ChicagoPizzaIngredientFactory;
import com.patterns.factory.pizza.ingredient.factory.impl.NYPizzaIngredientFactory;

public class DemoRunApp {
  public static void main(String[] args) {
    PizzaStore nyStore = new NYPizzaStore(
            new NYPizzaIngredientFactory());

    PizzaStore chicagoStore = new ChicagoPizzaStore(
            new ChicagoPizzaIngredientFactory());

    Pizza pizza = nyStore.orderPizza("cheese");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("cheese");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("clam");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("clam");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("pepperoni");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("pepperoni");
    System.out.println("Joel ordered a " + pizza + "\n");

    pizza = nyStore.orderPizza("veggie");
    System.out.println("Ethan ordered a " + pizza + "\n");

    pizza = chicagoStore.orderPizza("veggie");
    System.out.println("Joel ordered a " + pizza + "\n");
  }
}

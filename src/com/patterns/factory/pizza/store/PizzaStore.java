package com.patterns.factory.pizza.store;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.type.Pizza;

public abstract class PizzaStore {

  protected final PizzaIngredientFactory ingredientFactory;

  protected PizzaStore(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  protected abstract Pizza createPizza(String item);

  public Pizza orderPizza(String type) {
    Pizza pizza = createPizza(type);
    System.out.println("--- Making a " + pizza.getName() + " ---");
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    return pizza;
  }
}

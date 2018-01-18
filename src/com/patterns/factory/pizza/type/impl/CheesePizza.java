package com.patterns.factory.pizza.type.impl;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.type.Pizza;

public class CheesePizza extends Pizza {

  public CheesePizza(PizzaIngredientFactory ingredientFactory, String name) {
    super(ingredientFactory);
    setName(name + " Style Cheese Pizza");
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
  }
}

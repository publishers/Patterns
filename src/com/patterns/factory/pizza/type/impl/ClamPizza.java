package com.patterns.factory.pizza.type.impl;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.type.Pizza;

public class ClamPizza extends Pizza {

  public ClamPizza(PizzaIngredientFactory ingredientFactory, String name) {
    super(ingredientFactory);
    setName(name + " Style Clam Pizza");
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    clam = ingredientFactory.createClam();
  }
}

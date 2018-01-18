package com.patterns.factory.pizza.type.impl;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.type.Pizza;

public class VeggiePizza extends Pizza {

  public VeggiePizza(PizzaIngredientFactory ingredientFactory, String name) {
    super(ingredientFactory);
    setName(name + " Style Veggie Pizza");
  }

  public void prepare() {
    System.out.println("Preparing " + name);
    dough = ingredientFactory.createDough();
    sauce = ingredientFactory.createSauce();
    cheese = ingredientFactory.createCheese();
    veggies = ingredientFactory.createVeggies();
  }
}

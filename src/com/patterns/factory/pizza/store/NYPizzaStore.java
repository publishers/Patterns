package com.patterns.factory.pizza.store;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class NYPizzaStore extends AbstractPizzaStore {

  public NYPizzaStore(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory, "New York");
  }
}

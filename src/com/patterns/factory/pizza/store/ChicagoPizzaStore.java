package com.patterns.factory.pizza.store;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;

public class ChicagoPizzaStore extends AbstractPizzaStore {

  public ChicagoPizzaStore(PizzaIngredientFactory ingredientFactory) {
    super(ingredientFactory, "Chicago");
  }


}

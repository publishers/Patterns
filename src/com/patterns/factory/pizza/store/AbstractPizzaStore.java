package com.patterns.factory.pizza.store;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.type.Pizza;
import com.patterns.factory.pizza.type.impl.CheesePizza;
import com.patterns.factory.pizza.type.impl.ClamPizza;
import com.patterns.factory.pizza.type.impl.PepperoniPizza;
import com.patterns.factory.pizza.type.impl.VeggiePizza;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractPizzaStore extends PizzaStore {
  private String name;
  private Map<String, Pizza> pizzas;

  public AbstractPizzaStore(PizzaIngredientFactory ingredientFactory, String name) {
    super(ingredientFactory);
    this.name = name;
    initPizzas();
  }

  public void initPizzas() {
    pizzas = new HashMap<>();
    pizzas.put("cheese", new CheesePizza(ingredientFactory, name));
    pizzas.put("veggie", new VeggiePizza(ingredientFactory, name));
    pizzas.put("clam", new ClamPizza(ingredientFactory, name));
    pizzas.put("pepperoni", new PepperoniPizza(ingredientFactory, name));
  }

  @Override
  protected Pizza createPizza(String item) {
    return pizzas.get(item);
  }
}

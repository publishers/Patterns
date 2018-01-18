package com.patterns.factory.pizza.type;

import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.ingredient.Cheese;
import com.patterns.factory.pizza.ingredient.Clams;
import com.patterns.factory.pizza.ingredient.Dough;
import com.patterns.factory.pizza.ingredient.Pepperoni;
import com.patterns.factory.pizza.ingredient.Sauce;
import com.patterns.factory.pizza.ingredient.Veggies;

public abstract class Pizza {
  protected final PizzaIngredientFactory ingredientFactory;

  protected String name;

  protected Dough dough;
  protected Sauce sauce;
  protected Veggies veggies[];
  protected Cheese cheese;
  protected Pepperoni pepperoni;
  protected Clams clam;

  public Pizza(PizzaIngredientFactory ingredientFactory) {
    this.ingredientFactory = ingredientFactory;
  }

  public abstract void prepare();

  public void bake() {
    System.out.println("Bake for 25 minutes at 350");
  }

  public void cut() {
    System.out.println("Cutting the pizza into diagonal slices");
  }

  public void box() {
    System.out.println("Place pizza in official PizzaStore box");
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append("---- " + name + " ----\n");
    if (dough != null) {
      result.append(dough);
      result.append("\n");
    }
    if (sauce != null) {
      result.append(sauce);
      result.append("\n");
    }
    if (cheese != null) {
      result.append(cheese);
      result.append("\n");
    }
    if (veggies != null) {
      for (int i = 0; i < veggies.length; i++) {
        result.append(veggies[i]);
        if (i < veggies.length - 1) {
          result.append(", ");
        }
      }
      result.append("\n");
    }
    if (clam != null) {
      result.append(clam);
      result.append("\n");
    }
    if (pepperoni != null) {
      result.append(pepperoni);
      result.append("\n");
    }
    return result.toString();
  }
}

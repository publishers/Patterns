package com.patterns.factory.pizza.ingredient.factory.impl;

import com.patterns.factory.pizza.ingredient.Cheese;
import com.patterns.factory.pizza.ingredient.Clams;
import com.patterns.factory.pizza.ingredient.Dough;
import com.patterns.factory.pizza.ingredient.Pepperoni;
import com.patterns.factory.pizza.ingredient.Sauce;
import com.patterns.factory.pizza.ingredient.Veggies;
import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.ingredient.impl.SlicedPepperoni;
import com.patterns.factory.pizza.ingredient.impl.cheese.ReggianoCheese;
import com.patterns.factory.pizza.ingredient.impl.clam.FreshClams;
import com.patterns.factory.pizza.ingredient.impl.dough.ThinCrustDough;
import com.patterns.factory.pizza.ingredient.impl.sauce.MarinaraSauce;
import com.patterns.factory.pizza.ingredient.impl.veggie.Garlic;
import com.patterns.factory.pizza.ingredient.impl.veggie.Mushroom;
import com.patterns.factory.pizza.ingredient.impl.veggie.Onion;
import com.patterns.factory.pizza.ingredient.impl.veggie.RedPepper;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }

  public Sauce createSauce() {
    return new MarinaraSauce();
  }

  public Cheese createCheese() {
    return new ReggianoCheese();
  }

  public Veggies[] createVeggies() {
    return new Veggies[]{new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FreshClams();
  }
}

package com.patterns.factory.pizza.ingredient.factory.impl;

import com.patterns.factory.pizza.ingredient.Cheese;
import com.patterns.factory.pizza.ingredient.Clams;
import com.patterns.factory.pizza.ingredient.Dough;
import com.patterns.factory.pizza.ingredient.Pepperoni;
import com.patterns.factory.pizza.ingredient.Sauce;
import com.patterns.factory.pizza.ingredient.Veggies;
import com.patterns.factory.pizza.ingredient.factory.PizzaIngredientFactory;
import com.patterns.factory.pizza.ingredient.impl.SlicedPepperoni;
import com.patterns.factory.pizza.ingredient.impl.cheese.MozzarellaCheese;
import com.patterns.factory.pizza.ingredient.impl.clam.FrozenClams;
import com.patterns.factory.pizza.ingredient.impl.dough.ThickCrustDough;
import com.patterns.factory.pizza.ingredient.impl.sauce.PlumTomatoSauce;
import com.patterns.factory.pizza.ingredient.impl.veggie.BlackOlives;
import com.patterns.factory.pizza.ingredient.impl.veggie.Eggplant;
import com.patterns.factory.pizza.ingredient.impl.veggie.Spinach;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThickCrustDough();
  }

  public Sauce createSauce() {
    return new PlumTomatoSauce();
  }

  public Cheese createCheese() {
    return new MozzarellaCheese();
  }

  public Veggies[] createVeggies() {
    return new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
  }

  public Pepperoni createPepperoni() {
    return new SlicedPepperoni();
  }

  public Clams createClam() {
    return new FrozenClams();
  }
}

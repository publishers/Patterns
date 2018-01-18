package com.patterns.factory.pizza.ingredient.factory;

import com.patterns.factory.pizza.ingredient.Cheese;
import com.patterns.factory.pizza.ingredient.Clams;
import com.patterns.factory.pizza.ingredient.Dough;
import com.patterns.factory.pizza.ingredient.Pepperoni;
import com.patterns.factory.pizza.ingredient.Sauce;
import com.patterns.factory.pizza.ingredient.Veggies;

public interface PizzaIngredientFactory {

  Dough createDough();

  Sauce createSauce();

  Cheese createCheese();

  Veggies[] createVeggies();

  Pepperoni createPepperoni();

  Clams createClam();

}

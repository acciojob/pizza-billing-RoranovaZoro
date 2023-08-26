package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg)
    {
        super(isVeg);
        addExtraCheese(); // Deluxe pizza always has extra cheese
        addExtraToppings(); // Deluxe pizza always has extra toppings
    }
}

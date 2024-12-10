package com.example.dishes;

public class DishFactory {
    public static Dish createDish(String name) {
        // Factory method to create dishes
        return new Dish(name);
    }
}

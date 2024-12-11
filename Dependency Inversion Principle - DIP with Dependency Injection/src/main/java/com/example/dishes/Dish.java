package com.example.dishes;

import java.util.List;

public abstract class Dish {
    private String name;

    public Dish(String name) {
        // Constructor to initialize dish name
        this.name = name;
    }

    public String getName() {
        // Getter for dish name
        return name;
    }

    public abstract List<String> getIngredients(); // Abstract method for ingredients

    public abstract List<String> getSteps(); // Abstract method for steps

    public void displayIngredients() {
        System.out.println("Ingredients for " + name + ":");
        for (String ingredient : getIngredients()) {
            System.out.println("- " + ingredient);
        }
    }

    public void displaySteps() {
        System.out.println("Steps to prepare " + name + ":");
        for (int i = 0; i < getSteps().size(); i++) {
            System.out.println((i + 1) + ". " + getSteps().get(i));
        }
    }
}

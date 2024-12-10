package com.example.cookingMethods;

import org.springframework.stereotype.Component;

@Component
public class TandoorCooking implements Cooking {
    @Override
    public void cookDish(String dishName) {
        // Logic for Tandoor Cooking
        System.out.println("Cooking " + dishName + " in the tandoor for a smoky flavor!");
    }
}

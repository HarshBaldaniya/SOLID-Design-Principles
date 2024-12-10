package com.example.cookingMethods;

import org.springframework.stereotype.Component;

@Component
public class ChulhaCooking implements Cooking {
    @Override
    public void cookDish(String dishName) {
        // Logic for Chulha Cooking
        System.out.println("Cooking " + dishName + " on the chulha for an earthy taste!");
    }
}

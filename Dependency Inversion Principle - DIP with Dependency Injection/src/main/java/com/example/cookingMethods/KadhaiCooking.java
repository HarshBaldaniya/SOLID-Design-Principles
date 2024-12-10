package com.example.cookingMethods;

import org.springframework.stereotype.Component;

@Component
public class KadhaiCooking implements Cooking {
    @Override
    public void cookDish(String dishName) {
        // Logic for Kadhai Cooking
        System.out.println("Cooking " + dishName + " in the kadhai for a rich flavor!");
    }
}

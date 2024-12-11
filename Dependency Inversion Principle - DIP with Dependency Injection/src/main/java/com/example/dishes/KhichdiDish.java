package com.example.dishes;

import java.util.Arrays;
import java.util.List;

// Concrete implementation of Dish for Khichdi
public class KhichdiDish extends Dish {

    public KhichdiDish() {
        super("Khichdi");
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList(
            "Rice: 1 cup (the base of all greatness!)",
            "Yellow lentils (Moong Dal): 1/2 cup (protein boost!)",
            "Ghee: 2 tbsp (for that golden glow!)",
            "Vegetables: Peas, carrots, beans (mom said so!)",
            "Spices: Cumin, turmeric, salt (the essentials!)"
        );
    }

    @Override
    public List<String> getSteps() {
        return Arrays.asList(
            "Wash rice and lentils (clean is cool!).",
            "Heat ghee and fry spices (let it sizzle!).",
            "Add veggies and sauté (feel like a top chef for 2 minutes!).",
            "Add rice, lentils, and water (mix it up!).",
            "Cook until soft and serve hot (easy-peasy!)."
        );
    }
}

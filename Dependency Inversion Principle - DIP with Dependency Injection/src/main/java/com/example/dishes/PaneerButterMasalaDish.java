package com.example.dishes;

import java.util.Arrays;
import java.util.List;

// Concrete implementation of Dish for Paneer Butter Masala
public class PaneerButterMasalaDish extends Dish {

    public PaneerButterMasalaDish() {
        super("Paneer Butter Masala");
    }

    @Override
    public List<String> getIngredients() {
        return Arrays.asList(
            "Paneer: 250g (the hero of the dish!)",
            "Butter: 3 tbsp (because why not!)",
            "Tomatoes: 4 (pureed to perfection!)",
            "Cream: 1/4 cup (make it rich!)",
            "Spices: Garam masala, turmeric, chili powder, salt (flavor bomb!)"
        );
    }

    @Override
    public List<String> getSteps() {
        return Arrays.asList(
            "Heat butter and fry spices (start strong!).",
            "Add tomato puree and simmer (keep it smooth!).",
            "Stir in cream (creamy vibes only!).",
            "Add paneer and cook (don’t overcook the star!).",
            "Garnish and serve (show it off!)."
        );
    }
}

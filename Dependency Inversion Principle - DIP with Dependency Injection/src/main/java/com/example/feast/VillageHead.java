package com.example.feast;

import com.example.cookingMethods.Cooking;
import com.example.dishes.Dish;
import com.example.dishes.DishFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VillageHead {

    private Cooking cooking;

    @Autowired
    public VillageHead(@Qualifier("chulhaCooking") Cooking cooking) {
        // Constructor for injecting a cooking method
        this.cooking = cooking;
    }

    public void prepareDish(String dishName) {
        // Prepare the given dish using the injected cooking method
        System.out.println("Village Head orders the preparation of: " + dishName);

        // Fetch and display the dish recipe
        Dish dish = DishFactory.createDish(dishName);
        System.out.println("\n--- Recipe for " + dish.getName() + " ---");
        dish.displayIngredients();
        dish.displaySteps();

        // Use the selected cooking method to prepare the dish
        cooking.cookDish(dishName);
        System.out.println("Dish preparation completed!\n");
    }

    public void setCookingMethod(Cooking cooking) {
        // Setter for changing the cooking method dynamically
        this.cooking = cooking;
    }
}

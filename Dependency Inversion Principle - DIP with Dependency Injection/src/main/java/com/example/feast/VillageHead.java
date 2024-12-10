package com.example.feast;

import com.example.cookingMethods.Cooking;
import com.example.dishes.Dish;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VillageHead {

    private Cooking cooking;

    @Autowired
    public VillageHead(@Qualifier("tandoorCooking") Cooking cooking) {
        // Constructor for injecting a cooking method
        this.cooking = cooking;
    }

    public void prepareDish(Dish dish) {
        // Prepare the given dish using the injected cooking method
        System.out.println("Village Head orders the preparation of: " + dish.getName());
        cooking.cookDish(dish.getName());
        System.out.println("Dish preparation completed!\n");
    }

    public void setCookingMethod(Cooking cooking) {
        // Setter for changing the cooking method dynamically
        this.cooking = cooking;
    }
}

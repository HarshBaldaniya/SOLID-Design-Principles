package com.example;

import com.example.config.AppConfig;
import com.example.feast.VillageHead;
import com.example.cookingMethods.Cooking;
import com.example.dishes.Dish;
import com.example.dishes.DishFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring application context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the VillageHead bean with TandoorCooking injected
        VillageHead villageHead = context.getBean(VillageHead.class);

        // Create and prepare a dish using TandoorCooking
        Dish butterNaan = DishFactory.createDish("Butter Naan");
        villageHead.prepareDish(butterNaan);

        // Dynamically switch to ChulhaCooking for another dish
        Cooking chulhaCooking = context.getBean("chulhaCooking", Cooking.class);
        villageHead.setCookingMethod(chulhaCooking);
        Dish khichdi = DishFactory.createDish("Khichdi");
        villageHead.prepareDish(khichdi);

        // Dynamically switch to KadhaiCooking for yet another dish
        Cooking kadhaiCooking = context.getBean("kadhaiCooking", Cooking.class);
        villageHead.setCookingMethod(kadhaiCooking);
        Dish paneerMasala = DishFactory.createDish("Paneer Butter Masala");
        villageHead.prepareDish(paneerMasala);

        // Close the application context
        context.close();
    }
}

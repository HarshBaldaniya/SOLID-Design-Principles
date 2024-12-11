package com.example;

import com.example.config.AppConfig;
import com.example.feast.VillageHead;
import com.example.cookingMethods.Cooking;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Initialize Spring application context
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Get the VillageHead bean with ChulhaCooking injected
        VillageHead villageHead = context.getBean(VillageHead.class);

        // Create and prepare a dish using ChulhaCooking
        villageHead.prepareDish("Khichdi");

        // Dynamically switch to KadhaiCooking for yet another dish
        Cooking kadhaiCooking = context.getBean("kadhaiCooking", Cooking.class);
        villageHead.setCookingMethod(kadhaiCooking);
        villageHead.prepareDish("Paneer Butter Masala");

        // Close the application context
        context.close();
    }
}

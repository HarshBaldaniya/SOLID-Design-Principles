package com.example;

import com.example.config.AppConfig;
import com.example.store.PizzaStore;
import com.example.deliveryMethods.Delivery;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the PizzaStore bean with a specific Delivery method injected via @Qualifier in PizzaStore.
        PizzaStore bikeDelivery = context.getBean(PizzaStore.class);
        bikeDelivery.deliverPizzaToCustomer("123 Main St"); 

        // You can manually inject a different Delivery method
        PizzaStore carDeliveryStore = new PizzaStore(context.getBean("carDelivery", Delivery.class));
        carDeliveryStore.deliverPizzaToCustomer("134 Laxmi Park Soc.");  

        PizzaStore robotDeliveryStore = new PizzaStore(context.getBean("robotDelivery", Delivery.class));
        robotDeliveryStore.deliverPizzaToCustomer("Yash PG");  

        context.close();
    }
}

package com.example.store;

import com.example.deliveryMethods.Delivery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaStore {

    private Delivery delivery;

    @Autowired
    public PizzaStore(@Qualifier("bikeDelivery") Delivery delivery) {
        this.delivery = delivery;
    }

    public void deliverPizzaToCustomer(String address) {
        delivery.deliverPizza(address); 
    }
}

// PizzaStore is the main class where the pizza delivery operation is executed.
// The class depends on a Delivery method, which is injected by Spring using Dependency Injection.
// The @Autowired annotation tells Spring to inject a bean into this class.
// The @Qualifier annotation specifies which bean to inject when multiple beans are available.
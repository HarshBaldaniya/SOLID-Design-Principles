package com.example.deliveryMethods;

import org.springframework.stereotype.Component;

@Component
public class BikeDelivery implements Delivery {

    @Override
    public void deliverPizza(String address) {
        System.out.println("Delivering pizza to " + address + " using a bike!");  
    }
}

// BikeDelivery is a concrete implementation of the Delivery interface.
// This class is marked with @Component so that Spring can detect and manage it as a bean.

package com.example.deliveryMethods;

import org.springframework.stereotype.Component;

@Component
public class CarDelivery implements Delivery {

    @Override
    public void deliverPizza(String address) {
        System.out.println("Delivering pizza to " + address + " using a car!"); 
    }
}

// CarDelivery is another concrete implementation of the Delivery interface.
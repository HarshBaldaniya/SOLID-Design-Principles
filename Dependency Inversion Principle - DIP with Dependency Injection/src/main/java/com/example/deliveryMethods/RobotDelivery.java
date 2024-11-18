package com.example.deliveryMethods;

import org.springframework.stereotype.Component;

@Component
public class RobotDelivery implements Delivery {

    @Override
    public void deliverPizza(String address) {
        System.out.println("Delivering pizza to " + address + " using a robot!");  
    }
}

// RobotDelivery is a concrete implementation of the Delivery interface.
// This class simulates pizza delivery using robots.
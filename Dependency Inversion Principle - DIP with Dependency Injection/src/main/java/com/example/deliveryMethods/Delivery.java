package com.example.deliveryMethods;

public interface Delivery {
    void deliverPizza(String address);  
}

// Delivery is the abstraction (interface) that different delivery methods will implement.
// It contains a single method deliverPizza, which will be implemented by the delivery method classes.

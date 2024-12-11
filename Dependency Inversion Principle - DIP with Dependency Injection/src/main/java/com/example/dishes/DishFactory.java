package com.example.dishes;

public class DishFactory {

    public static Dish createDish(String dishName) {
        switch (dishName.toLowerCase()) {
            case "khichdi":
                return new KhichdiDish();
            case "paneer butter masala":
                return new PaneerButterMasalaDish();
            default:
                throw new IllegalArgumentException("No dish found for " + dishName);
        }
    }
}

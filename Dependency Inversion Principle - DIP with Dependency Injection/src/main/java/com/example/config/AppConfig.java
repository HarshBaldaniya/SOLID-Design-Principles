package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.cookingMethods", "com.example.feast", "com.example.dishes"})
public class AppConfig {
    // Spring configuration class that scans the specified packages for components
}

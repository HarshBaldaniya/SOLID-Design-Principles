package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.deliveryMethods", "com.example.store"})
public class AppConfig {
}

// AppConfig is the configuration class for the Spring application.
// It specifies which packages should be scanned for Spring components.


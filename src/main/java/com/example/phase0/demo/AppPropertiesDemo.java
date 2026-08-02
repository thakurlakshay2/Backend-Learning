package com.example.phase0.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppPropertiesDemo {

    @Value("${app.description:Phase0 Spring demo}")
    private String description;

    public String getDescription() {
        return description;
    }
}

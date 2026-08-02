package com.example.phase0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Phase0Application {
    public static void main(String[] args) {
        SpringApplication.run(Phase0Application.class, args);
    }
}

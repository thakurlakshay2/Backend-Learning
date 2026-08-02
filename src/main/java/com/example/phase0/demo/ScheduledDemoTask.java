package com.example.phase0.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledDemoTask {

    @Scheduled(fixedRate = 60000, initialDelay = 5000)
    public void printScheduledMessage() {
        System.out.println("[ScheduledDemoTask] Running scheduled demo task every 60 seconds.");
    }
}

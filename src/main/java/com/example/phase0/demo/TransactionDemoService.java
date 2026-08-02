package com.example.phase0.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionDemoService {

    @Transactional
    public void processTransaction() {
        System.out.println("[TransactionDemoService] Starting a transactional operation.");
        // In a real app, updates to multiple repositories would occur here.
    }
}

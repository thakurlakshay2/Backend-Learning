package com.example.phase0.demo;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public String findDemoData() {
        return "Demo data from repository";
    }
}

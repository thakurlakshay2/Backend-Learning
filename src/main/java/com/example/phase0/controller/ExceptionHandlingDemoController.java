package com.example.phase0.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionHandlingDemoController {

    @GetMapping("/demo/error")
    public String throwError() {
        throw new DemoNotFoundException("Demo resource was not found");
    }

    @ExceptionHandler(DemoNotFoundException.class)
    public ResponseEntity<String> handleDemoNotFound(DemoNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Handled error: " + ex.getMessage());
    }
}

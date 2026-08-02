package com.example.phase0.controller;

import com.example.phase0.dto.CreateUserRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestBodyDemoController {

    @PostMapping("/demo/request-body")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest request) {
        return ResponseEntity.ok("Received user: " + request.getName() + " with email " + request.getEmail());
    }
}

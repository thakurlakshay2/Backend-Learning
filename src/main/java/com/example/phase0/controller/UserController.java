package com.example.phase0.controller;

import com.example.phase0.dto.CreateUserRequest;
import com.example.phase0.dto.UserResponseDto;
import com.example.phase0.model.UserEntity;
import com.example.phase0.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/bad/{id}")
    public UserEntity getBadUser(@PathVariable Long id) {
        return userService.getUnsafeUser(id);
    }

    @GetMapping("/good/{id}")
    public UserResponseDto getGoodUser(@PathVariable Long id) {
        return userService.getSafeUser(id);
    }

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestParam String password) {
        String result = userService.registerUser(password);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String password, @RequestParam String storedHash) {
        boolean ok = userService.checkPassword(password, storedHash);
        return ok ? ResponseEntity.ok("Login success") : ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Long id, @RequestBody CreateUserRequest request) {
        boolean updated = userService.updateUser(id, request.getName(), request.getEmail());
        return updated ? ResponseEntity.ok("Updated user " + id) : ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        boolean deleted = userService.deleteUser(id);
        return deleted ? ResponseEntity.ok("Deleted user " + id) : ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
    }

    @PostMapping("/bad-status")
    public ResponseEntity<String> badStatus() {
        return ResponseEntity.ok("This endpoint returns 200 for everything, even on bad cases.");
    }

    @PostMapping("/good-status")
    public ResponseEntity<String> goodStatus() {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("This endpoint uses 400 for invalid input.");
    }
}

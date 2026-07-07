package com.example.phase0.service;

import com.example.phase0.dto.UserResponseDto;
import com.example.phase0.model.UserEntity;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class UserService {
    private final Map<Long, UserEntity> users = new ConcurrentHashMap<>();

    public UserService() {
        users.put(1L, new UserEntity(1L, "Ava", "ava@example.com", BCrypt.hashpw("secret123", BCrypt.gensalt()), "USER", "2024-01-01", "ABCDE1234F", "1234-5678-9012"));
    }

    public UserResponseDto getSafeUser(Long id) {
        UserEntity user = users.get(id);
        if (user == null) {
            return null;
        }
        return new UserResponseDto(user.getId(), user.getName(), user.getEmail());
    }

    public UserEntity getUnsafeUser(Long id) {
        return users.get(id);
    }

    public String registerUser(String rawPassword) {
        String hashedPassword = BCrypt.hashpw(rawPassword, BCrypt.gensalt());
        return "Stored password hash: " + hashedPassword;
    }

    public boolean checkPassword(String rawPassword, String storedHash) {
        return BCrypt.checkpw(rawPassword, storedHash);
    }
}

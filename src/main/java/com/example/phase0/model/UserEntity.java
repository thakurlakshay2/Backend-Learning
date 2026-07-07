package com.example.phase0.model;

public class UserEntity {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String createdAt;
    private String panCard;
    private String aadhaarCard;

    public UserEntity(Long id, String name, String email, String password, String role, String createdAt, String panCard, String aadhaarCard) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.createdAt = createdAt;
        this.panCard = panCard;
        this.aadhaarCard = aadhaarCard;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    public String getRole() { return role; }
    public String getCreatedAt() { return createdAt; }
    public String getPanCard() { return panCard; }
    public String getAadhaarCard() { return aadhaarCard; }
}

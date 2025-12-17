package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String name;
    private String email;
    private String phone;
    private String tier;

    // No-args constructor
    public CustomerProfile() {}

    // Parameterized constructor
    public CustomerProfile(String customerId, String name, String email,
                           String phone, String tier) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tier = tier;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }

    // No-args constructor (required by JPA)
    public CustomerProfile() {
    }

    // Parameterized constructor
    public CustomerProfile(String customerId, String name, String email,
                           String phone, String tier) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.tier = tier;
    }

}
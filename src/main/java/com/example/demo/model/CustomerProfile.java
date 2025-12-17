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

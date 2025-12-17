package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class VisitRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String channel;   // IN_STORE / DIGITAL

    // getters & setters
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
 
    public String getChannel() {
        return channel;
    }
 
    public void setChannel(String channel) {
        this.channel = channel;
    }
}

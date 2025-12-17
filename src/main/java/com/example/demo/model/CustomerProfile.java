package com.example.demo.model;

import jakarta.persistence.*;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPhone() {
        return phone;
    }
 
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }
    public Customer (Long id,String deviceCode,String deviceType,String model,Integer maxAllowedPerEmployee,Boolean active){
        this.id = id;
        this.deviceCode = deviceCode;
        this.deviceType = deviceType;
        this.model = model;
        this.maxAllowedPerEmployee = maxAllowedPerEmployee;
    }
    public DeviceCatalogItem(){
        
    }
}

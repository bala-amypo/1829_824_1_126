package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class PurchaseRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String productName;
    private Double amount;
    private String transactionId;

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
 
    public String getProductName() {
        return productName;
    }
 
    public void setProductName(String productName) {
        this.productName = productName;
    }
 
    public Double getAmount() {
        return amount;
    }
 
    public void setAmount(Double amount) {
        this.amount = amount;
    }
 
    public String getTransactionId() {
        return transactionId;
    }
 
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}

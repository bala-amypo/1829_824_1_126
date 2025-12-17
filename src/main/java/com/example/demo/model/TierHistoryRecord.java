package com.example.demo.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TierHistoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerId;
    private String oldTier;
    private String newTier;
    private String reason;
    private LocalDateTime upgradedAt;

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
 
    public String getOldTier() {
        return oldTier;
    }
 
    public void setOldTier(String oldTier) {
        this.oldTier = oldTier;
    }
 
    public String getNewTier() {
        return newTier;
    }
 
    public void setNewTier(String newTier) {
        this.newTier = newTier;
    }
 
    public String getReason() {
        return reason;
    }
 
    public void setReason(String reason) {
        this.reason = reason;
    }
 
    public LocalDateTime getUpgradedAt() {
        return upgradedAt;
    }
 
    public void setUpgradedAt(LocalDateTime upgradedAt) {
        this.upgradedAt = upgradedAt;
    }
}

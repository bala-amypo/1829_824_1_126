package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "tier_history")
public class TierHistoryRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private String oldTier;
    private String newTier;
    private String reason;
    private LocalDateTime changedAt;

    // Constructors
    public TierHistoryRecord() {
    }

    public TierHistoryRecord(Long customerId, String oldTier,
                             String newTier, String reason) {
        this.customerId = customerId;
        this.oldTier = oldTier;
        this.newTier = newTier;
        this.reason = reason;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
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

    public LocalDateTime getChangedAt() {
        return changedAt;
    }

    // Lifecycle
    @PrePersist
    public void onChange() {
        this.changedAt = LocalDateTime.now();
    }
}

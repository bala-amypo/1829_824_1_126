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

    // No-args constructor
    public TierHistoryRecord() {
    }

    // Parameterized constructor
    public TierHistoryRecord(String customerId, String oldTier,
                             String newTier, String reason,
                             LocalDateTime upgradedAt) {
        this.customerId = customerId;
        this.oldTier = oldTier;
        this.newTier = newTier;
        this.reason = reason;
        this.upgradedAt = upgradedAt;
    }
}

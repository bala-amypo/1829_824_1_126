package com.example.demo.model;

import java.time.LocalDateTime;

public class TierHistoryRecord {

    private Long id;
    private Long customerId;
    private String oldTier;
    private String newTier;
    private String reason;
    private LocalDateTime changedAt;

    public TierHistoryRecord() {}

    public TierHistoryRecord(Long customerId, String oldTier, String newTier, String reason) {
        this.customerId = customerId;
        this.oldTier = oldTier;
        this.newTier = newTier;
        this.reason = reason;
        this.changedAt = LocalDateTime.now();
    }

    // getters/setters omitted for brevity but OK if added
}

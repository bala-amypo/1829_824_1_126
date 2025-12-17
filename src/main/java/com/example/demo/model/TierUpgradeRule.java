package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class TierUpgradeRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fromTier;
    private String toTier;
    private Double minSpend;
    private Integer minVisits;

    // No-args constructor
    public TierUpgradeRule() {
    }

    // Parameterized constructor
    public TierUpgradeRule(String fromTier, String toTier,
                           Double minSpend, Integer minVisits) {
        this.fromTier = fromTier;
        this.toTier = toTier;
        this.minSpend = minSpend;
        this.minVisits = minVisits;
    }
}

package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "visit_records")
public class VisitRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long customerId;
    private LocalDate visitDate;
    private String channel;

    // Getters & Setters
    public Long getId() {
        return id;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    // Constructors (LAST)
    public VisitRecord() {
    }

    public VisitRecord(Long customerId,
                       LocalDate visitDate,
                       String channel) {
        this.customerId = customerId;
        this.visitDate = visitDate;
        this.channel = channel;
    }

    // Lifecycle
    @PrePersist
    public void validate() {
        if (visitDate == null) visitDate = LocalDate.now();
        if (!channel.equals("STORE") &&
            !channel.equals("APP") &&
            !channel.equals("WEB")) {
            throw new IllegalArgumentException("Invalid visit channel");
        }
    }
}

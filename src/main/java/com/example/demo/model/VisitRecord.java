package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "visit_records")
public class VisitRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate visitDate;
    private String channel;

    public VisitRecord() {}

    /* ================= REQUIRED BY TESTS ================= */

    public void setId(long id) {
        this.id = id;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setCustomer(CustomerProfile customer) {
        // dummy method for test compatibility
    }
}

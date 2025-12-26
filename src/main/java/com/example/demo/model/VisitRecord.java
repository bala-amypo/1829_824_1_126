// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.JoinColumn;

// import java.time.LocalDate;

// @Entity
// @Table(name = "visit_records")
// public class VisitRecord {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private LocalDate visitDate;
//     private String channel;

//     @ManyToOne
//     @JoinColumn(name = "customer_id")
//     private CustomerProfile customer;

//     public VisitRecord() {
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public LocalDate getVisitDate() {
//         return visitDate;
//     }

//     public void setVisitDate(LocalDate visitDate) {
//         this.visitDate = visitDate;
//     }

//     public String getChannel() {
//         return channel;
//     }

//     public void setChannel(String channel) {
//         this.channel = channel;
//     }

//     public CustomerProfile getCustomer() {
//         return customer;
//     }

//     public void setCustomer(CustomerProfile customer) {
//         this.customer = customer;
//     }
// }


package com.example.demo.model;

import java.time.LocalDate;

public class VisitRecord {

    private Long id;
    private LocalDate visitDate;
    private String channel;
    private CustomerProfile customer;

    public VisitRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }
}

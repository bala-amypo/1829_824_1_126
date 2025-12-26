//  package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.Table;
// import jakarta.persistence.Id;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.JoinColumn;

// import java.time.LocalDate;

// @Entity
// @Table(name = "purchase_records")
// public class PurchaseRecord {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private Double amount;
//     private LocalDate purchaseDate;
//     private String storeLocation;

//     @ManyToOne
//     @JoinColumn(name = "customer_id")
//     private CustomerProfile customer;

//     public PurchaseRecord() {
//     }

//     public Long getId() {
//         return id;
//     }

//     public void setId(Long id) {
//         this.id = id;
//     }

//     public Double getAmount() {
//         return amount;
//     }

//     public void setAmount(Double amount) {
//         this.amount = amount;
//     }

//     public LocalDate getPurchaseDate() {
//         return purchaseDate;
//     }

//     public void setPurchaseDate(LocalDate purchaseDate) {
//         this.purchaseDate = purchaseDate;
//     }

//     public String getStoreLocation() {
//         return storeLocation;
//     }

//     public void setStoreLocation(String storeLocation) {
//         this.storeLocation = storeLocation;
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

public class PurchaseRecord {

    private Long id;
    private Double amount;
    private LocalDate purchaseDate;
    private String storeLocation;
    private CustomerProfile customer;

    public PurchaseRecord() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public CustomerProfile getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerProfile customer) {
        this.customer = customer;
    }
}

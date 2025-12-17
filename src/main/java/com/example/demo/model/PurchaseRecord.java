// package com.example.demo.model;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;


// @Entity
// public class PurchaseRecord {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long id;

//     private String customerId;
//     private String productName;
//     private Double amount;
//     private String transactionId;

//     // No-args constructor
//     public PurchaseRecord() {
//     }

//     // Parameterized constructor
//     public PurchaseRecord(String customerId, String productName,
//                           Double amount, String transactionId) {
//         this.customerId = customerId;
//         this.productName = productName;
//         this.amount = amount;
//         this.transactionId = transactionId;
//     }
// }

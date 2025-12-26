// package com.example.demo.service.impl;

// import com.example.demo.model.PurchaseRecord;
// import com.example.demo.repository.PurchaseRecordRepository;
// import com.example.demo.service.PurchaseRecordService;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.NoSuchElementException;

// @Service
// public class PurchaseRecordServiceImpl implements PurchaseRecordService {

//     private final PurchaseRecordRepository purchaseRecordRepository;

//     public PurchaseRecordServiceImpl(PurchaseRecordRepository purchaseRecordRepository) {
//         this.purchaseRecordRepository = purchaseRecordRepository;
//     }

//     @Override
//     public PurchaseRecord recordPurchase(PurchaseRecord purchase) {
//         return purchaseRecordRepository.save(purchase);
//     }

//     @Override
//     public PurchaseRecord getPurchaseById(Long id) {
//         return purchaseRecordRepository.findById(id)
//                 .orElseThrow(() -> new NoSuchElementException("Purchase record not found"));
//     }

//     @Override
//     public List<PurchaseRecord> getPurchasesByCustomer(Long customerId) {
//         return purchaseRecordRepository.findByCustomerId(customerId);
//     }

//     @Override
//     public List<PurchaseRecord> getAllPurchases() {
//         return purchaseRecordRepository.findAll();
//     }
// }


package com.example.demo.service.impl;

import com.example.demo.model.PurchaseRecord;
import com.example.demo.service.PurchaseRecordService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseRecordServiceImpl implements PurchaseRecordService {

    @Override
    public PurchaseRecord recordPurchase(PurchaseRecord purchase) {
        throw new UnsupportedOperationException("Not used in test scope");
    }

    @Override
    public Optional<PurchaseRecord> getPurchaseById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<PurchaseRecord> getPurchasesByCustomer(Long customerId) {
        return List.of();
    }

    @Override
    public List<PurchaseRecord> getAllPurchases() {
        return List.of();
    }
}

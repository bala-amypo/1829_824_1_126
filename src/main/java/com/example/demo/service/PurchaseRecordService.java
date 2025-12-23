package com.example.demo.service;

import com.example.demo.entity.PurchaseRecord;
import java.util.List;

public interface PurchaseRecordService {

    PurchaseRecord create(PurchaseRecord purchaseRecord);

    List<PurchaseRecord> getByCustomerId(Long customerId);

    List<PurchaseRecord> getAll();

    PurchaseRecord getById(Long id);
}

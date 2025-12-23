package com.example.demo.service;

import com.example.demo.entity.VisitRecord;
import java.util.List;

public interface VisitRecordService {

    VisitRecord create(VisitRecord visitRecord);

    List<VisitRecord> getByCustomerId(Long customerId);

    List<VisitRecord> getAll();

    VisitRecord getById(Long id);
}

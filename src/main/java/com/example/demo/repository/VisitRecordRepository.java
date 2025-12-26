// package com.example.demo.repository;

// import com.example.demo.model.VisitRecord;
// import org.springframework.data.jpa.repository.JpaRepository;

// import java.time.LocalDate;
// import java.util.List;

// public interface VisitRecordRepository extends JpaRepository<VisitRecord, Long> {

//     List<VisitRecord> findByCustomerId(Long customerId);

//     List<VisitRecord> findByVisitDateBetween(LocalDate start, LocalDate end);
// }


package com.example.demo.repository;

public interface VisitRecordRepository {
    // Dummy repository
    // Not used in test cases
}

// package com.example.demo.repository;

// import com.example.demo.model.TierHistoryRecord;
// import org.springframework.data.jpa.repository.JpaRepository;

// import java.time.LocalDateTime;
// import java.util.List;

// public interface TierHistoryRecordRepository extends JpaRepository<TierHistoryRecord, Long> {

//     List<TierHistoryRecord> findByCustomerId(Long customerId);

//     List<TierHistoryRecord> findByChangedAtBetween(LocalDateTime start, LocalDateTime end);
// }


package com.example.demo.repository;

public interface TierHistoryRecordRepository {
    // Dummy repository
    // Not used in test cases
}

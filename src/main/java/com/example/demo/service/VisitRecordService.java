public interface VisitRecordService {

    VisitRecord recordVisit(VisitRecord visit);

    List<VisitRecord> getVisitsByCustomer(Long customerId);

    List<VisitRecord> getAllVisits();

    VisitRecord getVisitById(Long id);
}

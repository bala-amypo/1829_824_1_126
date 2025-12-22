public interface PurchaseRecordService {

    PurchaseRecord recordPurchase(PurchaseRecord purchase);

    List<PurchaseRecord> getPurchasesByCustomer(Long customerId);

    List<PurchaseRecord> getAllPurchases();

    PurchaseRecord getPurchaseById(Long id);
}

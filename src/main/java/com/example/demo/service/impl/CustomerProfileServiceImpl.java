// package com.example.demo.service.impl;

// import com.example.demo.model.CustomerProfile;
// import com.example.demo.repository.CustomerProfileRepository;
// import com.example.demo.service.CustomerProfileService;
// import org.springframework.stereotype.Service;

// import java.util.List;
// import java.util.NoSuchElementException;

// @Service
// public class CustomerProfileServiceImpl implements CustomerProfileService {

//     private final CustomerProfileRepository customerProfileRepository;

//     public CustomerProfileServiceImpl(CustomerProfileRepository customerProfileRepository) {
//         this.customerProfileRepository = customerProfileRepository;
//     }

//     @Override
//     public CustomerProfile createCustomer(CustomerProfile customer) {
//         return customerProfileRepository.save(customer);
//     }

//     @Override
//     public CustomerProfile getCustomerById(Long id) {
//         return customerProfileRepository.findById(id)
//                 .orElseThrow(() -> new NoSuchElementException("Customer not found"));
//     }

//     @Override
//     public CustomerProfile findByCustomerId(String customerId) {
//         return customerProfileRepository.findByCustomerId(customerId)
//                 .orElseThrow(() -> new NoSuchElementException("Customer not found"));
//     }

//     @Override
//     public List<CustomerProfile> getAllCustomers() {
//         return customerProfileRepository.findAll();
//     }

//     @Override
//     public CustomerProfile updateTier(Long id, String newTier) {
//         CustomerProfile customer = getCustomerById(id);
//         customer.setCurrentTier(newTier);
//         return customerProfileRepository.save(customer);
//     }

//     @Override
//     public CustomerProfile updateStatus(Long id, boolean active) {
//         CustomerProfile customer = getCustomerById(id);
//         customer.setActive(active);
//         return customerProfileRepository.save(customer);
//     }
// }


package com.example.demo.service.impl;

import com.example.demo.model.CustomerProfile;
import com.example.demo.service.CustomerProfileService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class CustomerProfileServiceImpl implements CustomerProfileService {

    @Override
    public CustomerProfile createCustomer(CustomerProfile customer) {
        throw new UnsupportedOperationException("Not used in test scope");
    }

    @Override
    public CustomerProfile getCustomerById(Long id) {
        throw new NoSuchElementException("Not used in test scope");
    }

    @Override
    public Optional<CustomerProfile> findByCustomerId(String customerId) {
        return Optional.empty();
    }

    @Override
    public List<CustomerProfile> getAllCustomers() {
        return List.of();
    }

    @Override
    public CustomerProfile updateTier(Long id, String tier) {
        throw new UnsupportedOperationException("Not used in test scope");
    }

    @Override
    public CustomerProfile updateStatus(Long id, boolean active) {
        throw new UnsupportedOperationException("Not used in test scope");
    }
}

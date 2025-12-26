// package com.example.demo.controller;

// import com.example.demo.model.CustomerProfile;
// import com.example.demo.service.CustomerProfileService;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;

// @RestController
// @RequestMapping("/api/customers")
// public class CustomerProfileController {

//     private final CustomerProfileService customerProfileService;

//     public CustomerProfileController(CustomerProfileService customerProfileService) {
//         this.customerProfileService = customerProfileService;
//     }

//     @PostMapping
//     public CustomerProfile createCustomer(@RequestBody CustomerProfile customer) {
//         return customerProfileService.createCustomer(customer);
//     }

//     @GetMapping("/{id}")
//     public CustomerProfile getCustomerById(@PathVariable Long id) {
//         return customerProfileService.getCustomerById(id);
//     }

//     @GetMapping("/lookup/{customerId}")
//     public CustomerProfile getCustomerByCustomerId(@PathVariable String customerId) {
//         return customerProfileService.findByCustomerId(customerId);
//     }

//     @GetMapping
//     public List<CustomerProfile> getAllCustomers() {
//         return customerProfileService.getAllCustomers();
//     }

//     @PutMapping("/{id}/tier")
//     public CustomerProfile updateTier(
//             @PathVariable Long id,
//             @RequestParam String newTier) {

//         return customerProfileService.updateTier(id, newTier);
//     }

//     @PutMapping("/{id}/status")
//     public CustomerProfile updateStatus(
//             @PathVariable Long id,
//             @RequestParam boolean active) {

//         return customerProfileService.updateStatus(id, active);
//     }
// }



package com.example.demo.controller;

import com.example.demo.model.CustomerProfile;
import com.example.demo.service.CustomerProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/customers")
public class CustomerProfileController {

    private final CustomerProfileService customerProfileService;

    public CustomerProfileController(CustomerProfileService customerProfileService) {
        this.customerProfileService = customerProfileService;
    }

    @PostMapping
    public CustomerProfile createCustomer(@RequestBody CustomerProfile customer) {
        return customerProfileService.createCustomer(customer);
    }

    @GetMapping("/{id}")
    public CustomerProfile getCustomerById(@PathVariable Long id) {
        return customerProfileService.getCustomerById(id);
    }

    @GetMapping("/lookup/{customerId}")
    public CustomerProfile getCustomerByCustomerId(@PathVariable String customerId) {
        return customerProfileService.findByCustomerId(customerId)
                .orElseThrow(NoSuchElementException::new);
    }

    @GetMapping
    public List<CustomerProfile> getAllCustomers() {
        return customerProfileService.getAllCustomers();
    }

    @PutMapping("/{id}/tier")
    public CustomerProfile updateTier(
            @PathVariable Long id,
            @RequestParam String newTier) {

        return customerProfileService.updateTier(id, newTier);
    }

    @PutMapping("/{id}/status")
    public CustomerProfile updateStatus(
            @PathVariable Long id,
            @RequestParam boolean active) {

        return customerProfileService.updateStatus(id, active);
    }
}

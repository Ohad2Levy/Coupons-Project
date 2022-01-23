package com.projects.coupons.security.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void registerCustomer(Customer customer){
        customerRepository.save(customer);
        log.debug("saved new customer {} with id {} in database", customer.getEmail(), customer.getId());
    }
}

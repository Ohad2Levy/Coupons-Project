package com.projects.coupons.security.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping
    public void registerCustomer(@RequestBody Customer customer){
        log.info("hit on registerCustomer");
        customerService.registerCustomer(customer);
        log.info("new customer registration {}", customer);
    }

    @GetMapping
    public void ping(){
        log.info("we have been pinged --> so here is your pong");
    }
}

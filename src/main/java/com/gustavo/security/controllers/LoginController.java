package com.gustavo.security.controllers;


import com.gustavo.security.entities.Customer;
import com.gustavo.security.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    public CustomerRepository customerRepository;

    @PostMapping("/register")
    public ResponseEntity<Customer> insert(@RequestBody Customer customer) {

        try{
            Customer customerObj = customerRepository.save(customer);
            return ResponseEntity.ok().body(customerObj);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }

    }

}

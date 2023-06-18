package com.gustavo.security.controllers;


import com.gustavo.security.entities.Customer;
import com.gustavo.security.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<Customer> insert(@RequestBody Customer customer) {

        try{
            String hashPasswordEncoder = passwordEncoder.encode(customer.getPassword());
            customer.setPassword(hashPasswordEncoder);
            Customer customerObj = customerRepository.save(customer);
            return ResponseEntity.ok().body(customerObj);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        }

    }

}

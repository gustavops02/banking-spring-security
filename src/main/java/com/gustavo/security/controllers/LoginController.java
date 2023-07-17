package com.gustavo.security.controllers;


import com.gustavo.security.entities.Customer;
import com.gustavo.security.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class LoginController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody Customer customer) {
        ResponseEntity responseStatus = null;
        try{
            String hashPassword = passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashPassword);
            Customer customerObj = customerRepository.save(customer);

            if(customerObj.getId() > 0) {
                responseStatus =  ResponseEntity.status(HttpStatus.CREATED).body("Id " + customerObj.getId() + " registered.");
            }


        } catch (Exception e) {
            responseStatus = ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error:" + e.getMessage());
        }
        return responseStatus;
    }

    @RequestMapping("/user")
    public Customer getUserDetailsAfterLogin(Authentication authentication) {
        List<Customer> customers = customerRepository.findByEmail(authentication.getName());

        if(customers.size() > 0) return customers.get(0);
        else return null;
    }

}

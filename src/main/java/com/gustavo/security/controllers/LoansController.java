package com.gustavo.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/loans")
public class LoansController {

    @GetMapping
    public String getLoanDetails() {
        return "Loans details";
    }
}

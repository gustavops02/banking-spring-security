package com.gustavo.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/balance")
public class BalanceController {

    @GetMapping
    public String getBalanceDetails() {
        return "Balance details";
    }
}

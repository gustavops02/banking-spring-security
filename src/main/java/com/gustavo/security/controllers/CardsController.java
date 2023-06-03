package com.gustavo.security.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/cards")
public class CardsController {

    @GetMapping
    public String getCardDetails() {
        return "cards details.";
    }
}

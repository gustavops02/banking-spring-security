package com.gustavo.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/contacts")
public class ContactController {

    @GetMapping
    public String saveContactDetails() {
        return "Contacts are saved to the DB";
    }
}

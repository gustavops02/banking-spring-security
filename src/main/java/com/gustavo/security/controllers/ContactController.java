package com.gustavo.security.controllers;

import com.gustavo.security.entities.Contact;
import com.gustavo.security.repositories.ContactRepository;
import com.gustavo.security.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping(value = "/api/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @Autowired
    private ContactService contactService;

    @PostMapping
    public Contact saveContactDetails(@RequestBody Contact contact) {
        contact.setContactId(contactService.getReqNumber());
        contact.setCreatedAt(new Date(System.currentTimeMillis()));
        return contactRepository.save(contact);
    }
}

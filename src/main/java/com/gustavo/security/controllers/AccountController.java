package com.gustavo.security.controllers;


import com.gustavo.security.entities.Accounts;
import com.gustavo.security.repositories.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/account")
public class AccountController {

    @Autowired
    public AccountsRepository accountsRepository;

    @GetMapping("/myAccount")
    public Accounts getAccountDetails(@RequestParam int id) {
        Accounts account = accountsRepository.findByCustomerId(id);

        if(account != null) {
            return account;
        } else {
            return null;
        }
    }

}

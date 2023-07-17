package com.gustavo.security.controllers;

import com.gustavo.security.entities.Transactions;
import com.gustavo.security.repositories.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/balance")
public class BalanceController {

    @Autowired
    private TransactionsRepository transactionsRepository;

    @GetMapping
    public List<Transactions> getBalanceDetails(@RequestParam int id) {

        List<Transactions> transactions = transactionsRepository.findByCustomerIdOrderByTransactionDateDesc(id);

        if (transactions != null) {
            return transactions;
        }
        else return null;
    }
}

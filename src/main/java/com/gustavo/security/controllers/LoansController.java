package com.gustavo.security.controllers;

import com.gustavo.security.entities.Loans;
import com.gustavo.security.repositories.LoansRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/loans")
public class LoansController {

    @Autowired
    private LoansRepository loansRepository;

    @GetMapping("/myLoans")
    public List<Loans> getLoanDetails(@RequestParam int id) {

        List<Loans> loans = loansRepository.findByCustomerIdOrderByStartedAtDesc(id);

        if (loans == null) return null;
        return loans;

    }
}

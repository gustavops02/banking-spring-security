package com.gustavo.security.repositories;

import com.gustavo.security.entities.Accounts;
import com.gustavo.security.entities.Cards;
import com.gustavo.security.entities.Customer;
import com.gustavo.security.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountsRepository extends JpaRepository<Accounts, Long> {

    Accounts findByCustomerId(int customerId);

}

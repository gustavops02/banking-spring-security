package com.gustavo.security.repositories;

import com.gustavo.security.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepository extends JpaRepository<Transactions, String> {

    List<Transactions> findByCustomerIdOrderByTransactionDateDesc(int customerId);
}

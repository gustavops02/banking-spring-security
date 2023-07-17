package com.gustavo.security.repositories;

import com.gustavo.security.entities.Loans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoansRepository extends JpaRepository<Loans, Integer> {

    List<Loans> findByCustomerIdOrderByStartedAtDesc(int customerId);

}

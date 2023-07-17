package com.gustavo.security.repositories;

import com.gustavo.security.entities.Cards;
import com.gustavo.security.entities.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CardsRepository extends JpaRepository<Cards, Integer> {

    List<Cards> findByCustomerId(int customerId);
}

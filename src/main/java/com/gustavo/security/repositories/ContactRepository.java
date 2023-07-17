package com.gustavo.security.repositories;

import com.gustavo.security.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ContactRepository extends JpaRepository<Contact, String> {

}

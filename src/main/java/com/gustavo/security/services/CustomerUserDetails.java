package com.gustavo.security.services;

import com.gustavo.security.entities.Customer;
import com.gustavo.security.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String userName = null;
        String password = null;
        List<GrantedAuthority> authorities = new ArrayList<>();
        Customer customerObj = customerRepository.findByEmail(username);

        if(customerObj == null) {
            throw new UsernameNotFoundException("User details not found for the user " + username);
        } else {
            userName = customerObj.getEmail();
            password = customerObj.getPassword();
            authorities.add(new SimpleGrantedAuthority(customerObj.getRole()));
        }
        return new User(username, password, authorities);
    }
}

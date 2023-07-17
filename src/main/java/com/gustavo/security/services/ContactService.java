package com.gustavo.security.services;


import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ContactService {

    public String getReqNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(999999999 - 9999) + 9999;
        return "SR" + randomNumber;
    }
}

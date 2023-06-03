package com.gustavo.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/notices")
public class NoticesController {

    @GetMapping
    public String getNotices() {
        return "notices from DB";
    }

}

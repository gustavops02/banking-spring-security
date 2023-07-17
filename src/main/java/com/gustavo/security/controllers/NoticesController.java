package com.gustavo.security.controllers;

import com.gustavo.security.entities.Notice;
import com.gustavo.security.repositories.NoticeRepository;
import org.hibernate.Cache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/api/notices")
public class NoticesController {

    @Autowired
    private NoticeRepository noticeRepository;

    @GetMapping
    public ResponseEntity<List<Notice>> getNotices() {

        List<Notice> notices = noticeRepository.findAllActiveNotices();
        if (notices != null) {
            return ResponseEntity.ok().cacheControl(CacheControl.maxAge(60, TimeUnit.SECONDS)).body(notices);
        } else return null;
    }


}



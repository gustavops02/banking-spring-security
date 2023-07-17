package com.gustavo.security.repositories;

import com.gustavo.security.entities.Notice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeRepository extends JpaRepository<Notice, Integer> {

    @Query(value = "FROM notice_details n WHERE CURDATE() BETWEEN noticeBeginAt AND noticeEndAt")
    List<Notice> findAllActiveNotices();

}

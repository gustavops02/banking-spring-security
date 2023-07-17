package com.gustavo.security.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity(name = "notice_details")
public class Notice {

    @Id
    private int noticeId;
    private String noticeSummary;
    private String noticeDetails;
    private Date noticeBeginAt;
    private Date noticeEndAt;
    private Date createdAt;
    private Date updatedAt;

    public Notice() {
    }

    public Notice(int noticeId, String noticeSummary, String noticeDetails, Date noticeBeginAt, Date noticeEndAt, Date createdAt, Date updatedAt) {
        this.noticeId = noticeId;
        this.noticeSummary = noticeSummary;
        this.noticeDetails = noticeDetails;
        this.noticeBeginAt = noticeBeginAt;
        this.noticeEndAt = noticeEndAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeSummary() {
        return noticeSummary;
    }

    public void setNoticeSummary(String noticeSummary) {
        this.noticeSummary = noticeSummary;
    }

    public String getNoticeDetails() {
        return noticeDetails;
    }

    public void setNoticeDetails(String noticeDetails) {
        this.noticeDetails = noticeDetails;
    }

    public Date getNoticeBeginAt() {
        return noticeBeginAt;
    }

    public void setNoticeBeginAt(Date noticeBeginAt) {
        this.noticeBeginAt = noticeBeginAt;
    }

    public Date getNoticeEndAt() {
        return noticeEndAt;
    }

    public void setNoticeEndAt(Date noticeEndAt) {
        this.noticeEndAt = noticeEndAt;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notice notice = (Notice) o;
        return noticeId == notice.noticeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(noticeId);
    }
}

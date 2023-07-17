package com.gustavo.security.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Date;
import java.util.Objects;

@Entity
public class Loans {

    @Column(name = "loan_number")
    private int loanId;

    private int customerId;
    private Date startedAt;
    private String loanType;
    private int totalLoan;
    private int amountPaid;
    private int outstandingAmount;
    private Date createdAt;

    public Loans() {
    }

    public Loans(int loanId, int customerId, Date startedAt, String loanType,
                 int totalLoan, int amountPaid, int outstandingAmount, Date createdAt) {
        this.loanId = loanId;
        this.customerId = customerId;
        this.startedAt = startedAt;
        this.loanType = loanType;
        this.totalLoan = totalLoan;
        this.amountPaid = amountPaid;
        this.outstandingAmount = outstandingAmount;
        this.createdAt = createdAt;
    }

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public int getTotalLoan() {
        return totalLoan;
    }

    public void setTotalLoan(int totalLoan) {
        this.totalLoan = totalLoan;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(int amountPaid) {
        this.amountPaid = amountPaid;
    }

    public int getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(int outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loans loans = (Loans) o;
        return loanId == loans.loanId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanId);
    }
}

package com.gustavo.security.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;

@Entity
public class Cards {

    @Id
    @Column(name = "card_id")
    private int cardId;

    @Column(name = "card_number")
    private String cardNumber;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "card_type")
    private String cardType;

    @Column(name="total_limit")
    private int totalLimit;

    @Column(name ="amount_used")
    private int amountUsed;

    @Column(name = "available_amount")
    private int availableAmount;

    @Column(name = "created_at")
    private Date createdAt;

    public Cards() {
    }

    public Cards(int cardId, String cardNumber, int customerId, String cardType,
                 int totalLimit, int amountUsed, int availableAmount, Date createdAt) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.customerId = customerId;
        this.cardType = cardType;
        this.totalLimit = totalLimit;
        this.amountUsed = amountUsed;
        this.availableAmount = availableAmount;
        this.createdAt = createdAt;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public int getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(int totalLimit) {
        this.totalLimit = totalLimit;
    }

    public int getAmountUsed() {
        return amountUsed;
    }

    public void setAmountUsed(int amountUsed) {
        this.amountUsed = amountUsed;
    }

    public int getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(int availableAmount) {
        this.availableAmount = availableAmount;
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
        Cards cards = (Cards) o;
        return cardId == cards.cardId && Objects.equals(cardNumber, cards.cardNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardNumber);
    }
}
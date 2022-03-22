package se.andreas.accountservice.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;

@JsonSerialize(using = BalanceInformationSerializer.class)
public class BalanceInformation extends BusinessObject {

    private final BigDecimal balance;
    private final String currency;
    private final BigDecimal interest;

    public BalanceInformation(BigDecimal balance, String currency, BigDecimal interest) {
        this.balance = balance;
        this.currency = currency;
        this.interest = interest;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getInterest() {
        return interest;
    }
}

package com.jarus.demo.dto;

import java.math.BigDecimal;

public class PremiumDTO {
    private final String type;
    private final BigDecimal amount;

    public PremiumDTO(String type, BigDecimal amount) {

        this.type = type;
        this.amount = amount;
    }

    public String getType() {

        return type;
    }

    public BigDecimal getAmount() {

        return amount;
    }
}

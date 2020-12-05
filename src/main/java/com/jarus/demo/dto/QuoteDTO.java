package com.jarus.demo.dto;

import java.time.LocalDate;
import java.util.List;

public class QuoteDTO {

    private final Long id;

    private final String number;

    private final String status;

    private final String applicant;

    private final LocalDate quoteDate;

    private final LocalDate effectiveDate;

    private final List<PremiumDTO> premiumOptions;

    public QuoteDTO(Long id, String number, String status, String applicant, LocalDate quoteDate, LocalDate effectiveDate,
                    List<PremiumDTO> premiumOptions) {

        this.id = id;
        this.number = number;
        this.status = status;
        this.applicant = applicant;
        this.quoteDate = quoteDate;
        this.effectiveDate = effectiveDate;
        this.premiumOptions = premiumOptions;
    }

    public String getNumber() {

        return number;
    }

    public String getStatus() {

        return status;
    }

    public String getApplicant() {

        return applicant;
    }

    public LocalDate getQuoteDate() {

        return quoteDate;
    }

    public LocalDate getEffectiveDate() {

        return effectiveDate;
    }

    public List<PremiumDTO> getPremiumOptions() {

        return premiumOptions;
    }

    public Long getId() {

        return id;
    }
}

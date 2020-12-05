package com.jarus.demo.dto;

public class AdditionalInsuredDTO {
    private final Long id;
    private final Long personId;
    private final Long quoteId;
    private final String coverage;

    public AdditionalInsuredDTO(Long id, Long personId, Long quoteId,String coverage) {

        this.id = id;
        this.personId = personId;
        this.quoteId = quoteId;
        this.coverage= coverage;
    }

    public Long getId() {

        return id;
    }

    public Long getPersonId() {

        return personId;
    }

    public Long getQuoteId() {

        return quoteId;
    }

    public String getCoverage() {

        return coverage;
    }
}

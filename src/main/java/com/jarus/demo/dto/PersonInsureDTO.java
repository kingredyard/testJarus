package com.jarus.demo.dto;

import java.time.LocalDate;

public class PersonInsureDTO {
    private final String name;
    private final LocalDate dateOfbirth;
    private final String coverage;

    public PersonInsureDTO(String name, LocalDate dateOfbirth, String coverage) {

        this.name = name;
        this.dateOfbirth = dateOfbirth;
        this.coverage = coverage;
    }

    public String getName() {

        return name;
    }

    public LocalDate getDateOfbirth() {

        return dateOfbirth;
    }

    public String getCoverage() {

        return coverage;
    }
}

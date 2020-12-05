package com.jarus.demo.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

public class PersonDTO {

    final private Long id;

    private final String name;

    @JsonIgnore
    final private String firstName;

    @JsonIgnore
    final private String lastName;

    final LocalDate dateOfBirth;

    public PersonDTO(Long id, String firstName, String lastName, LocalDate dateOfBirth) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.name = String.join(" ",firstName, lastName);
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public LocalDate getDateOfBirth() {

        return dateOfBirth;
    }

    public Long getId() {

        return id;
    }

    public String getName() {

        return name;
    }
}

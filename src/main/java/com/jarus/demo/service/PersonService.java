package com.jarus.demo.service;

import com.jarus.demo.dto.PersonDTO;
import com.jarus.demo.dto.PersonInsureDTO;

import java.util.List;

public interface PersonService {

    List<PersonDTO> getAllPersons(String firstName, String lastName);

    PersonInsureDTO getPersonInsuranceDTO(Long id);
}

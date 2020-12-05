package com.jarus.demo.service;

import com.jarus.demo.dto.AdditionalInsuredDTO;
import com.jarus.demo.dto.PersonDTO;
import com.jarus.demo.dto.PersonInsureDTO;
import com.jarus.demo.util.DataUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class PersonServiceImpl implements PersonService {

    @Override
    public List<PersonDTO> getAllPersons(String firstName, String lastName) {
          if(isNotEmpty(firstName) || isNotEmpty(lastName)){
              return DataUtil.getPersonData().stream()
                                             .filter(filterbyName(firstName,lastName))
                                             .collect(Collectors.toList());
          }
        return DataUtil.getPersonData();
    }

    @Override
    public PersonInsureDTO getPersonInsuranceDTO(Long personId) {

        if (personId != null){
           PersonDTO personDTO = DataUtil.getPersonData().stream()
                                                         .filter(person -> personId.equals(person.getId()))
                                                         .findFirst().get();
            AdditionalInsuredDTO additionalInsuredDTO = DataUtil.getAdditionalInsuredData().stream().filter(insurance -> personId.equals(insurance.getPersonId())).findFirst().get();
            return new PersonInsureDTO(personDTO.getName(),personDTO.getDateOfBirth(),additionalInsuredDTO.getCoverage());
        }
        return null;
    }

    private Predicate<PersonDTO> filterbyName(String firstName, String lastName) {

        return personDTO -> (personDTO.getFirstName().equalsIgnoreCase(firstName) || personDTO.getLastName().equalsIgnoreCase(lastName));
    }

    private boolean isNotEmpty(String value) {

        return value != null && !value.isEmpty();
    }
}

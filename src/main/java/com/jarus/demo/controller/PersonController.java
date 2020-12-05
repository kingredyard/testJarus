package com.jarus.demo.controller;

import com.jarus.demo.dto.PersonDTO;
import com.jarus.demo.dto.PersonInsureDTO;
import com.jarus.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("person")
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(final PersonService personService){
        Assert.notNull(personService, "The PersonService may not be null.");
        this.personService = personService;
    }



    @GetMapping()
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<List<PersonDTO>> getPersonsBySearch(@RequestParam(value = "firstName",required = false) String firstName, @RequestParam(value = "lastName",required = false) String lastName,
                                                              final HttpServletRequest request)  {

        return  ResponseEntity.ok(this.personService.getAllPersons(firstName,lastName));
    }

    @GetMapping("/additionalInsured/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public ResponseEntity<PersonInsureDTO> getAdditionalInsuredByPersonId(@PathVariable("id" ) Long id)  {

        return  ResponseEntity.ok(this.personService.getPersonInsuranceDTO(id));
    }


}

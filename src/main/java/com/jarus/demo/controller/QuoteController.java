package com.jarus.demo.controller;

import com.jarus.demo.dto.QuoteDTO;
import com.jarus.demo.service.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("quote")
public class QuoteController {

    private final QuoteService quoteService;

    @Autowired
    public QuoteController(final QuoteService quoteService){
        Assert.notNull(quoteService, "The quoteService may not be null.");
        this.quoteService = quoteService;
    }


    @GetMapping()
    public ResponseEntity<List<QuoteDTO>> getPersonsBySearch()  {

        return  ResponseEntity.ok(this.quoteService.getAllQuotes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<QuoteDTO> getPersonsBySearch(@PathVariable("id") Long id)  {

        return  ResponseEntity.ok(this.quoteService.getQuoteById(id));
    }


}

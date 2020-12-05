package com.jarus.demo.service;

import com.jarus.demo.dto.QuoteDTO;

import java.util.List;

public interface QuoteService {

    List<QuoteDTO> getAllQuotes();

    QuoteDTO getQuoteById(Long id);
}

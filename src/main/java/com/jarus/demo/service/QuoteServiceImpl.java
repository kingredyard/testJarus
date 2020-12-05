package com.jarus.demo.service;

import com.jarus.demo.dto.QuoteDTO;
import com.jarus.demo.util.DataUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Override
    public List<QuoteDTO> getAllQuotes() {

        return DataUtil.getQuotesData();
    }

    @Override
    public QuoteDTO getQuoteById(Long id) {

        if(id != null){
            Map<Long,QuoteDTO> quoteDTOMap = DataUtil.getQuotesData().stream().collect(Collectors.toMap(QuoteDTO::getId, Function.identity()));
            return quoteDTOMap.get(id);
        }

        return null;
    }
}

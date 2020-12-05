package com.jarus.demo.util;

import com.jarus.demo.dto.AdditionalInsuredDTO;
import com.jarus.demo.dto.PersonDTO;
import com.jarus.demo.dto.PremiumDTO;
import com.jarus.demo.dto.QuoteDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

final public class DataUtil {
    private DataUtil() throws IllegalAccessException {
        throw new IllegalAccessException("Utility class");
    }


    public static List<PersonDTO> getPersonData(){
        List<PersonDTO> personDTOS = new ArrayList<>();
        personDTOS.add(new PersonDTO(1L,"Rahul","Dravid",LocalDate.parse("1978-01-01")));
        personDTOS.add(new PersonDTO(2L,"Sachin","Tendulkar",LocalDate.parse("1975-06-12")));
        personDTOS.add(new PersonDTO(3L,"Surav","Ganguly",LocalDate.parse("1972-09-05")));
        return personDTOS;
    }

    public static List<QuoteDTO> getQuotesData(){
        List<QuoteDTO>  quoteDTOS = new ArrayList<>();
        List<PremiumDTO> premiumDTOS = new ArrayList<>();
        premiumDTOS.add(new PremiumDTO("Basic",BigDecimal.valueOf(680.00)));
        premiumDTOS.add(new PremiumDTO("Preferred",BigDecimal.valueOf(850.00)));
        premiumDTOS.add(new PremiumDTO("Premier",BigDecimal.valueOf(1200.00)));
        quoteDTOS.add(new QuoteDTO(1L,"Q92348","Pending","Sachin",LocalDate.parse("2012-12-12"),LocalDate.parse("2012-12-12"),premiumDTOS));
        premiumDTOS = new ArrayList<>();
        premiumDTOS.add(new PremiumDTO("Basic",BigDecimal.valueOf(600.00)));
        premiumDTOS.add(new PremiumDTO("Preferred",BigDecimal.valueOf(750.00)));
        premiumDTOS.add(new PremiumDTO("Premier",BigDecimal.valueOf(1100.00)));
        quoteDTOS.add(new QuoteDTO(2L,"Q92349","Issued","Rahul",LocalDate.parse("2011-10-12"),LocalDate.parse("2011-10-12"),premiumDTOS));
        premiumDTOS = new ArrayList<>();
        premiumDTOS.add(new PremiumDTO("Basic",BigDecimal.valueOf(500.00)));
        premiumDTOS.add(new PremiumDTO("Preferred",BigDecimal.valueOf(650.00)));
        premiumDTOS.add(new PremiumDTO("Premier",BigDecimal.valueOf(1000.00)));
        quoteDTOS.add(new QuoteDTO(3L,"Q92350","Pending","Ganguly",LocalDate.parse("2010-09-08"),LocalDate.parse("2010-09-08"),premiumDTOS));
        return quoteDTOS;
    }

    public static List<AdditionalInsuredDTO> getAdditionalInsuredData(){
        List<AdditionalInsuredDTO> additionalInsuredDTOS = new ArrayList<>();
        additionalInsuredDTOS.add(new AdditionalInsuredDTO(1L,1L,1L,"70%"));
        additionalInsuredDTOS.add(new AdditionalInsuredDTO(2L,2L,2L,"80%"));
        additionalInsuredDTOS.add(new AdditionalInsuredDTO(3L,3L,3L,"90%"));
        return additionalInsuredDTOS;
    }
}

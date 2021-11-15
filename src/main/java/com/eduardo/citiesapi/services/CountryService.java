package com.eduardo.citiesapi.services;

import com.eduardo.citiesapi.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CountryService {

    private CountryRepository countryRepository;

    public List<?> getCountries() {
        return countryRepository.findAll();
    }
}

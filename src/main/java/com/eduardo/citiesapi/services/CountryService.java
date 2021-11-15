package com.eduardo.citiesapi.services;

import com.eduardo.citiesapi.entity.Country;
import com.eduardo.citiesapi.repository.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class CountryService {

    private CountryRepository countryRepository;

    public Page<Country> getCountries(Pageable page) {
        return countryRepository.findAll(page);
    }

    public Country getCountryById(Long countryId) {
        return countryRepository.findById(countryId)
                .orElseThrow(NoSuchElementException::new);
    }
}

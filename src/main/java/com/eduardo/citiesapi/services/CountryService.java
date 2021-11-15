package com.eduardo.citiesapi.services;

import com.eduardo.citiesapi.models.entities.Country;
import com.eduardo.citiesapi.repositories.CountryRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public Page<Country> getCountries(final Pageable page) {
        return countryRepository.findAll(page);
    }

    public Country getCountryById(final Long countryId) {
        return countryRepository.findById(countryId)
                .orElseThrow(NoSuchElementException::new);
    }
}

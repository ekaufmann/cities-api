package com.eduardo.citiesapi.services;

import com.eduardo.citiesapi.models.entities.City;
import com.eduardo.citiesapi.repositories.CityRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class CityService {

    private final CityRepository cityRepository;

    public Page<City> getCities(final Pageable page) {
        return cityRepository.findAll(page);
    }

    public City getCityById(final Long cityId) {
        return cityRepository.findById(cityId)
                .orElseThrow(NoSuchElementException::new);
    }
}

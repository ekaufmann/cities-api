package com.eduardo.citiesapi.controllers;

import com.eduardo.citiesapi.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @GetMapping
    public ResponseEntity<Page<?>> getCountries(final Pageable page) {
        return ResponseEntity.ok(countryService.getCountries(page));
    }

    @GetMapping("/{countryId}")
    public ResponseEntity<?> getCountryById(@PathVariable final Long countryId) {
        return ResponseEntity.ok(countryService.getCountryById(countryId));
    }
}

package com.eduardo.citiesapi.controller;

import com.eduardo.citiesapi.services.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
@AllArgsConstructor
public class CountryController {

    private CountryService countryService;

    @GetMapping
    public ResponseEntity getCountries() {
        return ResponseEntity.ok(countryService.getCountries());
    }
}

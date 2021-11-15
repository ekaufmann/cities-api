package com.eduardo.citiesapi.controllers;

import com.eduardo.citiesapi.services.CityService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cities")
@AllArgsConstructor
public class CityController {

    private CityService cityService;

    @GetMapping
    public ResponseEntity<Page<?>> getCities(final Pageable page) {
        return ResponseEntity.ok(cityService.getCities(page));
    }

    @GetMapping("/{cityId}")
    public ResponseEntity<?> getCityById(@PathVariable final Long stateId) {
        return ResponseEntity.ok(cityService.getCityById(stateId));
    }
}

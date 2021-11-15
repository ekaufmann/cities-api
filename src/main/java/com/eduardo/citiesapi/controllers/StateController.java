package com.eduardo.citiesapi.controllers;

import com.eduardo.citiesapi.services.StateService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/states")
@AllArgsConstructor
public class StateController {

    private StateService stateService;

    @GetMapping
    public ResponseEntity<Page<?>> getStates(final Pageable page) {
        return ResponseEntity.ok(stateService.getStates(page));
    }

    @GetMapping("/{stateId}")
    public ResponseEntity<?> getStateById(@PathVariable final Long stateId) {
        return ResponseEntity.ok(stateService.getStateById(stateId));
    }
}

package com.eduardo.citiesapi.services;

import com.eduardo.citiesapi.models.entities.State;
import com.eduardo.citiesapi.repositories.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class StateService {

    private final StateRepository stateRepository;

    public Page<State> getStates(final Pageable page) {
        return stateRepository.findAll(page);
    }

    public State getStateById(final Long stateId) {
        return stateRepository.findById(stateId).orElseThrow(NoSuchElementException::new);
    }
}

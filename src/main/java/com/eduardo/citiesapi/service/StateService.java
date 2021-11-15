package com.eduardo.citiesapi.service;

import com.eduardo.citiesapi.entity.State;
import com.eduardo.citiesapi.repository.StateRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@AllArgsConstructor
public class StateService {

    private StateRepository stateRepository;

    public Page<State> getStates(Pageable page) {
        return stateRepository.findAll(page);
    }

    public State getStateById(Long stateId) {
        return stateRepository.findById(stateId).orElseThrow(NoSuchElementException::new);
    }
}

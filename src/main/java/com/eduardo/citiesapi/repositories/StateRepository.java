package com.eduardo.citiesapi.repositories;

import com.eduardo.citiesapi.models.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}

package com.eduardo.citiesapi.controllers;

import com.eduardo.citiesapi.models.EarthRadius;
import com.eduardo.citiesapi.services.DistanceService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
@AllArgsConstructor
@Log4j2
public class DistanceController {

    private final DistanceService service;

    @GetMapping("/by-points")
    public ResponseEntity<?> calculateByPoints(@RequestParam(name = "from") final Long city1,
                                            @RequestParam(name = "to") final Long city2) {
        log.info("byPoints");
        return ResponseEntity.ok(service.distanceByPointsInMiles(city1, city2));
    }

    @GetMapping("/by-cube")
    public ResponseEntity<?> calculateByCube(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2) {
        log.info("byCube");
        return ResponseEntity.ok(service.distanceByCubeInMeters(city1, city2));
    }

    @GetMapping("/by-math")
    public ResponseEntity<?> calculateByMath(@RequestParam(name = "from") final Long city1,
                         @RequestParam(name = "to") final Long city2,
                         @RequestParam final EarthRadius unit) {
        log.info("byMath");
        return ResponseEntity.ok(service.distanceUsingMath(city1, city2, unit));
    }
}

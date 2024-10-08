package com.foogaro.panel.controller;

import com.foogaro.panel.model.Beer;
import com.foogaro.panel.service.BeersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/beers")
public class BeersController {

    @Autowired
    private BeersService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable("id") String id) {
        Optional<Beer> beer = service.findById(id);
        if (beer.isPresent()) {
            return ResponseEntity.ok(service.findById(id).get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/by-name/{name}")
    public ResponseEntity findByName(@PathVariable("name") String name) {
        List<Beer> beers = service.searchBeerByName(name);
        if (beers != null && !beers.isEmpty()) {
            return ResponseEntity.ok(beers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/by-abv/{abv}")
    public ResponseEntity publishJSON(@PathVariable("abv") String abv) {
        Iterable<Beer> beers = service.findByAbv(abv);
        if (beers != null) {
            return ResponseEntity.ok(beers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/by-abv/{abvGT}/{abvLT}")
    public ResponseEntity findByAbvBetween(@PathVariable("abvGT") String abvGT, @PathVariable("abvLT") String abvLT) {
        Iterable<Beer> beers = service.findByAbvBetween(abvGT, abvLT);
        if (beers != null) {
            return ResponseEntity.ok(beers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/by-ibu/{ibu}")
    public ResponseEntity findByIbu(@PathVariable("ibu") String ibu) {
        Iterable<Beer> beers = service.findByIbu(ibu);
        if (beers != null) {
            return ResponseEntity.ok(beers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/by-ibu/{ibuGT}/{ibuLT}")
    public ResponseEntity findByIbuBetween(@PathVariable("ibuGT") String ibuGT, @PathVariable("ibuLT") String ibuLT) {
        Iterable<Beer> beers = service.findByIbuBetween(ibuGT, ibuLT);
        if (beers != null) {
            return ResponseEntity.ok(beers);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

package com.foogaro.panel.service;

import com.foogaro.panel.model.Beer;
import com.foogaro.panel.repository.BeersRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BeersService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BeersRepository repository;

    public Optional<Beer> findById(String id) {
        return repository.findById(id);
    }

    public List<Beer> searchBeerByName(String name) {
        return repository.searchBeerByName(name);
    }

    public Iterable<Beer> findByAbv(String abv) {
        return repository.findByAbv(abv);
    }

    public Iterable<Beer> findByAbvGreaterThanEqual(String abvGTE) {
        return repository.findByAbvGreaterThanEqual(abvGTE);
    }

    public Iterable<Beer> findByAbvLessThanEqual(String abvLTE) {
        return repository.findByAbvLessThanEqual(abvLTE);
    }

    public Iterable<Beer> findByAbvBetween(String abvGT, String abvLT) {
        return repository.findByAbvBetween(abvGT, abvLT);
    }

    public Iterable<Beer> findByIbu(String ibu) {
        return repository.findByIbu(ibu);
    }

    public Iterable<Beer> findByIbuGreaterThanEqual(String ibuGTE) {
        return repository.findByIbuGreaterThanEqual(ibuGTE);
    }

    public Iterable<Beer> findByIbuLessThanEqual(String ibuLTE) {
        return repository.findByIbuLessThanEqual(ibuLTE);
    }

    public Iterable<Beer> findByIbuBetween(String ibuGT, String ibuLT) {
        return repository.findByIbuBetween(ibuGT, ibuLT);
    }


}

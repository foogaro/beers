package com.foogaro.panel.repository;

import com.foogaro.panel.model.Beer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BeersRepository extends CrudRepository<Beer, String> {

    List<Beer> searchBeerByName(String name);
    Iterable<Beer> findByAbv(String abv);
    Iterable<Beer> findByAbvGreaterThanEqual(String abvGTE);
    Iterable<Beer> findByAbvLessThanEqual(String abvLTE);
    Iterable<Beer> findByAbvBetween(String abvGT, String abvLT);
    Iterable<Beer> findByIbu(String ibu);
    Iterable<Beer> findByIbuGreaterThanEqual(String ibuGTE);
    Iterable<Beer> findByIbuLessThanEqual(String ibuLTE);
    Iterable<Beer> findByIbuBetween(String ibuGT, String ibuLT);

}

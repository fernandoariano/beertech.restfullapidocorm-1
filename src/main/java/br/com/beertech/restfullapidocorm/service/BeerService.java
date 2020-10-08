package br.com.beertech.restfullapidocorm.service;

import br.com.beertech.restfullapidocorm.domain.Beer;

import java.util.List;

public interface BeerService {

    Beer save(Beer beer);

    Beer update(Long idBeer, Beer beer);

    void delete(Long idBeer);

    List<Beer> listAll();

    Beer findBeerByName(String nameBeer);

}

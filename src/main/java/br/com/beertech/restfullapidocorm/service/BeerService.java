package br.com.beertech.restfullapidocorm.service;

import br.com.beertech.restfullapidocorm.domain.Beer;

import java.util.List;

public interface BeerService {

    Beer saveOrUpdate(Beer beer);

    void delete(Long idBeer);

    List<Beer> listAll();


}

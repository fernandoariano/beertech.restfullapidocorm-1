package br.com.beertech.restfullapidocorm.service.impl;

import br.com.beertech.restfullapidocorm.domain.Beer;
import br.com.beertech.restfullapidocorm.repository.BeerRepository;
import br.com.beertech.restfullapidocorm.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService {

    private BeerRepository beerRepository;

    @Autowired
    public BeerServiceImpl(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public Beer saveOrUpdate(Beer beer) {
        return beerRepository.save(beer);
    }

    @Override
    public void delete(Long idBeer) {
        beerRepository.delete(getBeerById(idBeer));
    }

    @Override
    public List<Beer> listAll() {
        return beerRepository.findAll();
    }

    private Beer getBeerById(Long idBeer) {
        return beerRepository.getOne(idBeer);
    }

}

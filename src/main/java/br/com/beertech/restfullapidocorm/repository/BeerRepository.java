package br.com.beertech.restfullapidocorm.repository;

import br.com.beertech.restfullapidocorm.domain.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Beer findByName(String nameBeer);

}

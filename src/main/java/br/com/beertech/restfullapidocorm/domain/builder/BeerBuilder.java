package br.com.beertech.restfullapidocorm.domain.builder;

import br.com.beertech.restfullapidocorm.domain.Beer;

import java.math.BigDecimal;

public final class BeerBuilder implements Builder<Beer> {

  private Beer beer;

    private BeerBuilder() {
    }

    public static BeerBuilder aBeer() {
        return new BeerBuilder();
    }

    public BeerBuilder withIdBeer(Long idBeer) {
        this.beer.setIdBeer(idBeer);
        return this;
    }

    public BeerBuilder withName(String name) {
        this.beer.setName(name);
        return this;
    }

    public BeerBuilder withPrice(BigDecimal price) {
        this.beer.setPrice(price);
        return this;
    }

    @Override
    public Beer builder() {
        return null;
    }

}

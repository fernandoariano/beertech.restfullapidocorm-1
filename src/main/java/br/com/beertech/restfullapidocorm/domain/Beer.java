package br.com.beertech.restfullapidocorm.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Beer implements Serializable {

    private Long idBeer;
    private String name;
    private BigDecimal price;

    public Beer(Long idBeer, String name, BigDecimal price) {
        this.idBeer = idBeer;
        this.name = name;
        this.price = price;
    }

    public Long getIdBeer() {
        return idBeer;
    }

    public void setIdBeer(Long idBeer) {
        this.idBeer = idBeer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return Objects.equals(idBeer, beer.idBeer) &&
                Objects.equals(name, beer.name) &&
                Objects.equals(price, beer.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBeer, name, price);
    }

}

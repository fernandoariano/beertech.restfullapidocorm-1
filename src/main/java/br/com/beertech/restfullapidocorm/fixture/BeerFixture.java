package br.com.beertech.restfullapidocorm.fixture;

import br.com.beertech.restfullapidocorm.domain.Beer;

import static br.com.beertech.restfullapidocorm.constantes.Constantes.Prices.NOVE_REAIS_E_CINQUENTA_CENTAVOS;
import static br.com.beertech.restfullapidocorm.constantes.Constantes.Prices.OITO_REAIS_E_CINQUENTA_CENTAVOS;
import static br.com.beertech.restfullapidocorm.constantes.Constantes.Products.*;
import static br.com.beertech.restfullapidocorm.domain.builder.BeerBuilder.aBeer;

public class BeerFixture {

    public static Beer aBeerAntarticaSubZero() {
        return aBeer()
               .withName(ANTARTICA_SUZ_ZERO)
               .withPrice(OITO_REAIS_E_CINQUENTA_CENTAVOS)
               .builder();
    }

    public static Beer aBeerCaracu() {
        return aBeer()
                .withName(CARACU)
                .withPrice(NOVE_REAIS_E_CINQUENTA_CENTAVOS)
                .builder();
    }

    public static Beer aBeerBrahma() {
        return aBeer()
                .withName(BRAHMA)
                .withPrice(NOVE_REAIS_E_CINQUENTA_CENTAVOS)
                .builder();
    }

}

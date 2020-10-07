package br.com.beertech.restfullapidocorm;

import br.com.beertech.restfullapidocorm.repository.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static br.com.beertech.restfullapidocorm.fixture.BeerFixture.*;

@Configuration
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(BeerRepository repository) {
        return args -> {
            repository.save(aBeerAntarticaSubZero());
            repository.save(aBeerCaracu());
            repository.save(aBeerBrahma());
        };
    }

}

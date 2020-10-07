package br.com.beertech.restfullapidocorm;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beertech.restfullapidocorm.domain.Beer;
import br.com.beertech.restfullapidocorm.repository.BeerRepository;

@Configuration
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(BeerRepository repository) {
	  // name / price
    return args -> {
    	repository.save(new Beer("Antarctica Sub-Zero", 7.5));
        repository.save(new Beer("Original", 8.5));
        repository.save(new Beer("Caracu", 9.5));
        repository.save(new Beer("Brahma", 5.5));
    };
  }
}

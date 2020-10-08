package br.com.beertech.restfullapidocorm.web.rest;

import br.com.beertech.restfullapidocorm.domain.Beer;
import br.com.beertech.restfullapidocorm.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/beer")
public class BeerResource {

    @Autowired
    private BeerService beerService;

    @GetMapping(value = "/listAll")
    public List<Beer> listAllBeer() {
        return beerService.listAll();
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Beer> saveBeer(@RequestBody Beer beer) {
        return new ResponseEntity<>(beerService.save(beer), CREATED);
    }

    @GetMapping(value = "{name}")
    public ResponseEntity<Beer> getBeerByName(@PathVariable(value = "name") String name) {
        return ok(beerService.findBeerByName(name));
    }

    @DeleteMapping("{id}")
    public void deleteBeer(@PathVariable Long id) {
        beerService.delete(id);
    }

}

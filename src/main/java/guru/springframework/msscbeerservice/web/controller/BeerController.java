package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId){
        //todo imple
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);

    }

    @PostMapping //POST create a new beer
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){

        //todo imple
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping({"/{beerId}"}) //PUT modify beet
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){
        //todo imple
        return new ResponseEntity(HttpStatus.NO_CONTENT);

    }


}
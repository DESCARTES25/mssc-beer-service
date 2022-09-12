package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
@Component
public class BeerLoader  implements CommandLineRunner {
    private final BeerRepository beerRepository;
    public BeerLoader(BeerRepository beerRepository){
        this.beerRepository = beerRepository;

    }
    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0){
            beerRepository.save(Beer.builder()
                    .beerName("ambar")
                    .beerStyle("TRIGO")
                    .quantityToBrew(200)
                    .upc(337010000001L)
                    .price(new BigDecimal("12.95")).build());
            beerRepository.save(Beer.builder()
                    .beerName("cruzcampo")
                    .beerStyle("ASCO")
                    .quantityToBrew(100)
                    .upc(337010000002L).price(new BigDecimal("-2.95")).build());

        }

        //System.out.println("Loaded " + beerRepository.count() + " beers ");


    }
}

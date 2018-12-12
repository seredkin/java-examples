package garden;

import garden.plants.Plant;
import garden.plants.fruit.Apple;
import garden.plants.fruit.Citrus;
import garden.plants.fruit.Lemon;
import garden.plants.fruit.Orange;
import garden.plants.vegetable.GreenTomato;
import garden.plants.vegetable.RedTomato;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class CommonTests {

    @Test
    public void testCollection() {

        final Set<Plant> myGarden = new LinkedHashSet<>();

        myGarden.add(new RedTomato(1.5));
        myGarden.add(new GreenTomato(1.01));
        myGarden.add(new Apple(1.3));

        final Set<Citrus> citruses = new LinkedHashSet<>();

        citruses.add(new Lemon(2.2));
        citruses.add(new Orange(1.4));

        myGarden.addAll(citruses);

        for (Plant plant : myGarden) {
            System.out.println(plant);
        }
    }
}

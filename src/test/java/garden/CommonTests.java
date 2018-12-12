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

    /** We make sure that Generic types work */
    @Test
    public void testCollection() {

        final Set<Plant> myGarden = new LinkedHashSet<>();

        // All vegetables are Plants, including all Tomatoes
        myGarden.add(new RedTomato(1.5));
        myGarden.add(new GreenTomato(1.01));
        myGarden.add(new Apple(1.3));

        final Set<Citrus> citruses = new LinkedHashSet<>();

        citruses.add(new Lemon(2.2));
        citruses.add(new Orange(1.4));

        // This is Ok because Citrus extends AbstractFruit and AbstractFruit implements Plant
        myGarden.addAll(citruses);

        //This shouldn't compile
        //citruses.addAll(myGarden);

        for (Plant plant : myGarden) {
            System.out.println(plant);
        }
    }
}

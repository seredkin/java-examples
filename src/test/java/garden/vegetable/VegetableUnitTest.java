package garden.vegetable;

import garden.plants.vegetable.GreenTomato;
import garden.plants.vegetable.RedTomato;
import org.junit.Test;

public class VegetableUnitTest {
    @Test public void toStringFields() {

        RedTomato redTomato = new RedTomato(1.0);
        GreenTomato greenTomato = new GreenTomato(0.8);

        System.out.println("redTomato = " + redTomato);
        System.out.println("greenTomato = " + greenTomato);

    }
}

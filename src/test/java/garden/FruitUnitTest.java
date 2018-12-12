package garden;

import garden.plants.fruit.Apple;
import garden.plants.fruit.Lemon;
import garden.plants.fruit.Orange;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FruitUnitTest {

    /** This method demonstrates late binding with */
    @Test
    public void toStringWithActualName() {

        Orange orange = new Orange(1.5);
        System.out.println("Orange: "  + orange);
        //TODO Explain why returned String starts with 'Orange'
        assertThat(orange.toString(), startsWith("Orange"));
        assertThat(orange.toString(), endsWith(orange.getPrice().toString()));
        assertThat(orange.toString(), containsString(orange.getColor()));

        System.out.println("Apple: "  + new Apple(2.5));
        System.out.println("Lemon: "  + new Lemon(4.5));
    }
}

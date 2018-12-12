package garden.fruit;

import garden.plants.Plant;
import garden.plants.fruit.Apple;
import garden.plants.fruit.Lemon;
import garden.plants.fruit.Orange;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class FruitUnitTest {

    /** This method demonstrates late binding with */
    @Test
    public void toStringWithActualName() {

        Orange orange = new Orange(1.5);
        System.out.println("Orange: "  + orange);
        //TODO Explain why returned String starts with 'Orange'
        assertThat(orange.toString(), startsWith(orange.getName()));
        assertThat(orange.toString(), containsString(orange.getColor()));
        assertThat(orange.toString(), endsWith(orange.getPrice().toString()));

        System.out.println("Apple: "  + new Apple(2.5));
        System.out.println("Lemon: "  + new Lemon(4.5));
    }

    //TODO make this work
    @Test
    public void testEquals() {
        Apple apple1 = new Apple(1.0);
        Apple apple2 = new Apple(1.0);

        assertTrue(apple1.equals(apple2));
    }

    //TODO make this work
    @Test public void testHashCode(){
        Set<Plant> plants = new HashSet<>();
        plants.add(new Lemon(2.0));
        assertTrue(plants.contains(new Lemon(2.0)));
    }
}

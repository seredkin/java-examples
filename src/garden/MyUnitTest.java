package garden;

import org.junit.Test;

public class MyUnitTest {
    @Test
    public void testStatic() {
        //System.out.println("Apple.getCategory() = " + Apple.getCategory());
        //System.out.println("Lemon.getCategory() = " + Citrus.getCategory());

        System.out.println("Orange:"  + new Orange(1.5));
        System.out.println("Apple:"  + new Apple(2.5));
        System.out.println("Lemon:"  + new Lemon(4.5));
    }
}

package garden.plants.fruit;

public class Apple extends AbstractFruit {

    public Apple(Double price) {
        super(price);
    }

    public static String getCategory() {
        return "Sweet fruit";
    }

    @Override
    public String getColor() {
        return "unknown";
    }

    @Override
    public Double getPrice() {
        return (double) super.price - (0.2 * (double) super.price);
    }
}

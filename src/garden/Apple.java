package garden;

public class Apple extends Fruit {

    protected Apple(Number price) {
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
    public Number getPrice() {
        return (double) super.price - (0.2 * (double) super.price);
    }
}

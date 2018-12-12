package garden;

public abstract class Fruit extends Object {

    protected final Number price;

    protected Fruit(Number price) {
        this.price = price;
    }

    public static String getCategory() {
        return "fruit";
    }

    public Number getPrice() {
        return price;
    }

    public abstract String getColor();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " is " + getColor() + " and costs " + getPrice();
    }
}

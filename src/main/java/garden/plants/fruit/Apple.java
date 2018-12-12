package garden.plants.fruit;

public class Apple extends AbstractFruit {

    public Apple(Double price) {
        super(price);
    }

    @Override
    public String getColor() {
        return "unknown";
    }

    @Override
    public Double getPrice() {
        return super.price - (0.2 * super.price);
    }
}

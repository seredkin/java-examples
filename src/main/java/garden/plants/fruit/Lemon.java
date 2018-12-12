package garden.plants.fruit;

public class Lemon extends Citrus{
    public Lemon(Double price) {
        super(price);
    }

    @Override
    public String getColor() {
        return super.getColor() + " and yellow";
    }
}

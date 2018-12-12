package garden.plants.fruit;

public class Orange extends Citrus {
    public Orange(Double price) {
        super(price);
    }

    @Override
    public String getColor() {
        return super.getColor() + " and orange";
    }
}

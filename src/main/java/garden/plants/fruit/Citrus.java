package garden.plants.fruit;

public abstract class Citrus extends AbstractFruit {

    protected Citrus(Double price) {
        super(price);
    }

    @Override
    public String getColor() {
        return "bright";
    }

}

package garden;

public abstract class Citrus extends Fruit {

    protected Citrus(Number price) {
        super(price);
    }

    @Override
    public String getColor() {
        return "bright";
    }

}

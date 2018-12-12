package garden;

public class Orange extends Citrus {
    protected Orange(Number price) {
        super(price);
    }

    @Override
    public String getColor() {
        return super.getColor() + " and orange";
    }
}

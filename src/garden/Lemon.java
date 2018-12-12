package garden;

public class Lemon extends Citrus{
    protected Lemon(Number price) {
        super(price);
    }

    @Override
    public String getColor() {
        return super.getColor() + " and yellow";
    }
}

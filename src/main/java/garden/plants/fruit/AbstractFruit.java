package garden.plants.fruit;

import garden.plants.Plant;

//TODO explain why uncommenting 'extends Object' this makes no sense:
public abstract class AbstractFruit  /*extends Object*/ implements Plant {

    protected final Double price;

    protected AbstractFruit(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public abstract String getColor();

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getName() + " is " + getColor() + " and costs " + getPrice();
    }
}

package garden.plants.fruit;

import garden.plants.Plant;

import java.util.Objects;

//TODO explain why uncommenting 'extends Object' this makes no sense:
public abstract class AbstractFruit  /*extends Object*/ implements Plant {

    protected final Double price;

    protected AbstractFruit(Double price) {
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return getName() + " is " + getColor() + " and costs " + getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (!(o instanceof AbstractFruit)) {
            return false;
        } else {
            AbstractFruit that = (AbstractFruit) o;
            return getPrice().equals(that.getPrice()) &&
                    getName().equals(that.getName()) &&
                    getColor().equals(that.getColor());
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getName(), getColor());
    }
}

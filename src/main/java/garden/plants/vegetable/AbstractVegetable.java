package garden.plants.vegetable;

import garden.plants.Plant;
import org.apache.commons.lang3.builder.ToStringBuilder;

/** @see Plant*/
public abstract class AbstractVegetable implements Plant {

    private final Double price;
    private final String color;

    /** Default constructor with immutable values */
    AbstractVegetable(Double price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}

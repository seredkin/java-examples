package garden.plants;

/** Common interface for all kinds of vegetation */
public interface Plant {
    Double getPrice();

    String getColor();

    /** Returns specific name of the type */
    String getName();
}

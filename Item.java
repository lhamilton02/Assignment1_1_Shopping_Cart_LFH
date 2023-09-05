/**
 * Represents an item that can be added to a shopping cart
 *
 * @author lhamilton2
 */
public class Item {
    private String name;
    private double price;

    /**
     * Constructs an Item with a given name and price.
     *
     * @param name  The name of the item.
     * @param price The price of the item.
     */
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the item.
     *
     * @return The name of the item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the item.
     *
     * @param name The new name to set for the item.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the price of the item.
     *
     * @return The price of the item.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the price of the item.
     *
     * @param price The new price to set for the item.
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns a string representation of the item.
     *
     * @return A string containing the name and price of the item.
     */
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

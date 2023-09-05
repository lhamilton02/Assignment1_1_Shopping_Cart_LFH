import java.util.Arrays;

/**
 * Represents a shopping cart.
 *
 * @param <T> The type of items that the shopping cart can hold, extending the Item class.
 * @author lhamilton02
 */
public class ShoppingCart<T extends Item> {
    private ResizableArrayBag<T> cart;

    /**
     * Constructs an empty shopping cart.
     */
    public ShoppingCart() {
        cart = new ResizableArrayBag<>();
    }

    /**
     * Adds an item to the shopping cart.
     *
     * @param item The item to be added.
     * @return True if the addition was successful, false otherwise.
     */
    public boolean addItem(T item) {
        return cart.add(item);
    }

    /**
     * Removes an item from the shopping cart.
     *
     * @param item The item to be removed.
     * @return True if the removal was successful, false otherwise.
     */
    public boolean removeItem(T item) {
        return cart.remove(item);
    }

    /**
     * Gets the current number of items in the shopping cart.
     *
     * @return The current size of the cart.
     */
    public int getItemCount() {
        return cart.getCurrentSize();
    }

    /**
     * Calculates the total price of all items in the shopping cart.
     *
     * @return The total price of all items in the cart.
     */
    public double getTotalPrice() {
        double totalPrice = 0.0;
        Object[] items = cart.toArray();

        for (Object item : items) {
            if (item instanceof Item) {
                Item castedItem = (Item) item;
                totalPrice += castedItem.getPrice();
            }
        }

        return totalPrice;
    }

    /**
     * Displays the items in the shopping cart.
     */
    public void displayCart() {
        Object[] items = cart.toArray();

        System.out.println("Items in the shopping cart:");
        for (Object item : items) {
            if (item instanceof Item) {
                System.out.println((Item) item);
            }
        }
    }

    /**
     * Checks whether the shopping cart is empty.
     *
     * @return True if the cart is empty, false otherwise.
     */
    public boolean isEmpty() {
        return cart.isEmpty();
    }

    /**
     * Clears all items from the shopping cart.
     */
    public void clear() {
        cart.clear();
    }

    /**
     * Returns the frequency of a specified item in the shopping cart.
     *
     * @param anEntry The item to check the frequency of.
     * @return The number of occurrences of the item.
     */
    public int getFrequencyOf(T anEntry) {
        return cart.getFrequencyOf(anEntry);
    }

    /**
     * Checks whether a specified item is present in the shopping cart.
     *
     * @param anEntry The item to be checked.
     * @return True if the item is in the cart, false otherwise.
     */
    public boolean contains(T anEntry) {
        return cart.contains(anEntry);
    }
}

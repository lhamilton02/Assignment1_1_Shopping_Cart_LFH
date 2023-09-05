public class Application {
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart<Item> shoppingCart = new ShoppingCart<>();

        // Add items to the cart
        Item item1 = new Item("Product 1", 10.99);
        Item item2 = new Item("Product 2", 5.99);

        System.out.println("Adding items to the cart...");
        boolean addItem1 = shoppingCart.addItem(item1);
        boolean addItem2 = shoppingCart.addItem(item2);

        // Display the current size of the cart
        int cartSize = shoppingCart.getItemCount();
        System.out.println("Current Cart Size: " + cartSize);

        // Check if the cart is empty
        boolean isEmpty = shoppingCart.isEmpty();
        System.out.println("Is Cart Empty? " + isEmpty);

        // Display the items in the cart
        System.out.println("Items in the shopping cart:");
        shoppingCart.displayCart();

        // Remove an item from the cart
        System.out.println("Removing item1 from the cart...");
        boolean removeItem1 = shoppingCart.removeItem(item1);

        // Display the updated cart
        System.out.println("Updated Cart:");
        shoppingCart.displayCart();

        // Check the frequency of an item
        int frequency = shoppingCart.getFrequencyOf(item2);
        System.out.println("Frequency of item2: " + frequency);

        // Check if an item is in the cart
        boolean containsItem2 = shoppingCart.contains(item2);
        System.out.println("Does cart contain item2? " + containsItem2);

        // Calculate and display the total price
        double totalPrice = shoppingCart.getTotalPrice();
        System.out.println("Total Price: $" + totalPrice);

        // Clear the cart
        System.out.println("Clearing the cart...");
        shoppingCart.clear();

        // Display the current size of the cart after clearing
        cartSize = shoppingCart.getItemCount();
        System.out.println("Current Cart Size (after clearing): " + cartSize);

        // Check if the cart is empty after clearing
        isEmpty = shoppingCart.isEmpty();
        System.out.println("Is Cart Empty (after clearing)? " + isEmpty);
    }
}

import java.util.ArrayList;
import java.util.List;

// Custom Exception 1
class EmptyCartException extends Exception {

    public EmptyCartException(String message) {
        super(message);
    }
}


// Custom Exception 2
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}


// Item class
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotal() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }
}


// Cart class
class Cart {

    private List<Item> items = new ArrayList<>();
    private double balance;

    public Cart(double balance) {
        this.balance = balance;
    }

    // Add item to cart
    public void addItem(Item item) {
        items.add(item);
    }

    // Calculate total cost
    public double getTotalCost() {
        double total = 0;

        for (Item item : items) {
            total += item.getTotal();
        }

        return total;
    }

    // Checkout method
    public void checkout()
            throws EmptyCartException, InsufficientBalanceException {

        // Check empty cart
        if (items.isEmpty()) {
            throw new EmptyCartException(
                "Cart is empty!"
            );
        }

        double total = getTotalCost();

        // Check balance
        if (total > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance! Required: "
                + total + ", Available: " + balance
            );
        }

        System.out.println("Checkout successful!");
        System.out.println("Total cost: " + total);
        System.out.println("Remaining balance: " + (balance - total));
    }
}


// Main class
public class Main {

    public static void main(String[] args) {

        // User has 1000 balance
        Cart cart = new Cart(1000);

        // Add items
        cart.addItem(new Item("Laptop", 700, 1));
        cart.addItem(new Item("Mouse", 100, 2));

        try {

            cart.checkout();

        } catch (EmptyCartException e) {

            System.out.println("EmptyCartException: "
                    + e.getMessage());

        } catch (InsufficientBalanceException e) {

            System.out.println("InsufficientBalanceException: "
                    + e.getMessage());
        }
    }
}

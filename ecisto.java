class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    void purchase(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException(
                name + " is out of stock! Available: " + stock + ", Requested: " + quantity
            );
        }
        stock -= quantity;
        System.out.println("Purchase successful! " + quantity + " " + name);
        System.out.println("Remaining stock: " + stock);
    }
}

// ✔ Valid class name
public class ecisto {

    public static void main(String[] args) {

        Product laptop = new Product("Laptop", 2);

        System.out.println("Product: " + laptop.name + ", Stock: " + laptop.stock);

        try {
            laptop.purchase(5);
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        }

        try {
            laptop.purchase(1);
        } catch (OutOfStockException e) {
            System.out.println("Order failed: " + e.getMessage());
        }
    }
}
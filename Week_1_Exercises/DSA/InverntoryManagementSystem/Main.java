// Main.java
public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Add products
        Product p1 = new Product("P001", "Laptop", 10, 999.99);
        Product p2 = new Product("P002", "Smartphone", 20, 599.99);
        Product p3 = new Product("P003", "Headphones", 50, 29.99);

        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // Display products
        System.out.println("All Products:");
        inventory.displayProducts();

        // Update product
        p1.setPrice(899.99);
        inventory.updateProduct(p1);

        // Delete product
        inventory.deleteProduct("P002");

        // Display products after update and delete
        System.out.println("All Products After Update and Delete:");
        inventory.displayProducts();
    }
}

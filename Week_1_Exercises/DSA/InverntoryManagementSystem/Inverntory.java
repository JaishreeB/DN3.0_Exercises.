
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private HashMap<String, Product> productMap;

    public Inventory() {
        productMap = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        productMap.put(product.getProductId(), product);
        System.out.println("Product added: " + product);
    }

    // Update an existing product
    public void updateProduct(Product product) {
        if (productMap.containsKey(product.getProductId())) {
            productMap.put(product.getProductId(), product);
            System.out.println("Product updated: " + product);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (productMap.containsKey(productId)) {
            Product removedProduct = productMap.remove(productId);
            System.out.println("Product deleted: " + removedProduct);
        } else {
            System.out.println("Product not found.");
        }
    }

    // Display all products
    public void displayProducts() {
        if (productMap.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            for (Map.Entry<String, Product> entry : productMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shirt", "Clothing"),
            new Product(3, "Phone", "Electronics"),
            new Product(4, "Shoes", "Footwear"),
            new Product(5, "Watch", "Accessories")
        };

        // Linear Search
        Product resultLinear = LinearSearch.linearSearch(products, "Phone");
        if (resultLinear != null) {
            System.out.println("Linear Search Found: " + resultLinear);
        } else {
            System.out.println("Product not found in Linear Search");
        }

        // Binary Search
        Product resultBinary = BinarySearch.binarySearch(products, "Phone");
        if (resultBinary != null) {
            System.out.println("Binary Search Found: " + resultBinary);
        } else {
            System.out.println("Product not found in Binary Search");
        }
    }
}

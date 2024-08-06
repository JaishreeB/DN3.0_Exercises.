public class Main {
    public static void main(String(String[] args) {
        Library library = new Library(10);

        // Add books
        library.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));

        // Traverse books
        System.out.println("Books in library:");
        library.traverseBooks();

        // Linear search for a book by title
        String searchTitle = "1984";
        Book book = library.linearSearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("Found (Linear Search): " + book);
        } else {
            System.out.println("Book not found (Linear Search).");
        }

        // Binary search for a book by title
        book = library.binarySearchByTitle(searchTitle);
        if (book != null) {
            System.out.println("Found (Binary Search): " + book);
        } else {
            System.out.println("Book not found (Binary Search).");
        }
    }
}

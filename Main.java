public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("Fahrenheit 451", "Ray Bradbury", 1953);
        Book book3 = new Book("Brave New World", "Aldous Huxley", 1932);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Available books before checkout:");
        library.displayAvailableBooks();
        System.out.println();

        // Check out book by title
        library.checkOutBook("1984");

        // Display available books after checkout
        System.out.println("Available books after checkout:");
        library.displayAvailableBooks();
        System.out.println();

        // Return book
        library.returnBook("1984");

        // Display available books after return
        System.out.println("Available books after return:");
        library.displayAvailableBooks();
    }
}

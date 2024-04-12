import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display available books
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                book.displayInfo();
            }
        }
    }

    // Check out book
    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.checkOutBook();
                System.out.println("You have checked out: " + title);
                return;
            }
        }
        System.out.println("The book '" + title + "' was not found.");
    }

    // Return book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                book.returnBook();
                System.out.println("You have returned: " + title);
                return;
            }
        }
        System.out.println("The book '" + title + "' was not found.");
    }
}


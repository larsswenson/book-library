public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isCheckedOut;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isCheckedOut = false; 
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void checkOutBook() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year published: " + yearPublished);
        System.out.println("Checked out: " + (isCheckedOut ? "Yes" : "No"));
        System.out.println();
    }
}



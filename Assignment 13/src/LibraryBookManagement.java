import java.util.ArrayList;
import java.util.Scanner;

// Book class
class Book {
    String title;
    String author;
    String isbn;
    boolean availabilityStatus;

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availabilityStatus = true; // Default to available
    }

    // Display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}

// Library class
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully!");
    }

    // Check out a book
    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (book.availabilityStatus) {
                    book.availabilityStatus = false;
                    System.out.println("You have checked out the book: " + title);
                } else {
                    System.out.println("The book is already checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return a book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title)) {
                if (!book.availabilityStatus) {
                    book.availabilityStatus = true;
                    System.out.println("You have returned the book: " + title);
                } else {
                    System.out.println("The book was not checked out.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Library Books:");
            for (Book book : books) {
                book.displayDetails();
            }
        }
    }
}

// Main class
public class LibraryBookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add a Book");
            System.out.println("2. Check Out a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter the title of the book to check out: ");
                    String checkOutTitle = scanner.nextLine();
                    library.checkOutBook(checkOutTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    library.displayBooks();
                    break;
                case 5:
                    System.out.println("Exiting the library system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class
class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    public void removeBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Book removed: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        System.out.println("Books in the library:");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}

// Main class to run the system
public class LMS {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book\n2. Remove Book\n3. View Books\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter ISBN: ");
                    String isbn = sc.nextLine();
                    Book newBook = new Book(title, author, isbn);
                    library.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter ISBN to remove: ");
                    String removeIsbn = sc.nextLine();
                    library.removeBook(removeIsbn);
                    break;
                case 3:
                    library.displayBooks();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

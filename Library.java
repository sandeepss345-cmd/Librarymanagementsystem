
import java.util.*;

public class Library {
    private List<Book> books;
    private Scanner scanner;

    public Library() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("The Hobbit", "J.R.R. Tolkien"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
    }

    public void addBook() {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        books.add(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    public void viewBooks() {
        showBooks();
    }

    public void showBooks() {
        System.out.println("\nAvailable Books:");
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < books.size(); i++) {
            System.out.println(i + ". " + books.get(i));
        }
    }

    public void issueBook() {
        showBooks();
        System.out.print("\nEnter book number to issue: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (!book.isIssued()) {
                book.issue();
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book is already issued.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }

    public void returnBook() {
        showBooks();
        System.out.print("\nEnter book number to return: ");
        int index = scanner.nextInt();
        scanner.nextLine();
        if (index >= 0 && index < books.size()) {
            Book book = books.get(index);
            if (book.isIssued()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Invalid book number.");
        }
    }
}

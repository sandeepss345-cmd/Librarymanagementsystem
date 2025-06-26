
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n📚 LIBRARY MENU");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int ch = sc.nextInt();
            sc.nextLine(); // clear newline

            switch (ch) {
                case 1 -> lib.addBook();
                case 2 -> lib.viewBooks();
                case 3 -> lib.issueBook();
                case 4 -> lib.returnBook();
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}

package esercizi_compito.week5.pp_dc_rs;

import esercizi_compito.week5.pp_dc_rs.exceptions.UserNotExistsException;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {

    public static Library buildAndPopulateLibraryWithBooksAndUsers() {
        ArrayList<LibraryBook> elencoLibri = new ArrayList<>();
        elencoLibri.add(new LibraryBook("Java Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("Python Essentials", "John Doe", "987-654-321"));
        elencoLibri.add(new LibraryBook("Data Structures in Java", "Alice Brown", "567-890-123"));
        elencoLibri.add(new LibraryBook("C++ Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("JavaScript Essentials", "Jane Smith", "987-654-321"));
        elencoLibri.add(new LibraryBook("Algorithms in Java", "Alice Brown", "567-890-123"));
        elencoLibri.add(new LibraryBook("C# Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("HTML Essentials", "Jane Smith", "987-654-321"));

        ArrayList<User> elencoUtenti = new ArrayList<>();
        elencoUtenti.add(new User("Alice"));
        elencoUtenti.add(new User("Bob"));
        elencoUtenti.add(new User("Charlie"));
        elencoUtenti.add(new User("Mario"));
        elencoUtenti.add(new User("Luigi"));

        Library libreria = new Library();
        libreria.addBooks(elencoLibri);
        libreria.addUsers(elencoUtenti);

        return libreria;
    }

    public static void main(String[] args) throws UserNotExistsException {
        Library libreria = buildAndPopulateLibraryWithBooksAndUsers();
        libreria.simulateBooksBorrowed(15, 3);

        // write a menu to ask user what to do
        // 1. display all books
        // 2. display all users
        // 3. display all books borrowed by a user
        // 4. display all books borrowed
        // 5. display all books available
        // 6. borrow a book
        // 7. return a book
        // 8. search a book by title
        // 9. search a book by author
        // 0. exit

        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. display all books");
            System.out.println("2. display all users");
            System.out.println("3. display all books borrowed by a user");
            System.out.println("4. display all books borrowed");
            System.out.println("5. display all books available");
            System.out.println("6. borrow a book");
            System.out.println("7. return a book");
            System.out.println("8. search a book by title");
            System.out.println("9. search list of books by author");
            System.out.println("0. exit");

            choice = scanner.nextInt();
            scanner.nextLine();
            String userName = "";
            User user = null;
            String bookTitle = "";
            LibraryBook book = null;
            switch (choice) {
                case 1:
                    libreria.displayBooks();
                    break;
                case 2:
                    libreria.displayUsers();
                    break;
                case 3:
                    System.out.println("Enter the user name");
                    userName = scanner.nextLine();
                    libreria.displayBooksBorrowedByUser(userName);
                    break;
                case 4:
                    libreria.displayAllBooksBorrowed();
                    break;
                case 5:
                    libreria.displayAllBooksAvailable();
                    break;
                case 6:
                    System.out.println("Enter the user name");
                    userName = scanner.nextLine();
                    try {
                        user = libreria.getUser(userName);
                    } catch (UserNotExistsException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    System.out.println("Enter the book title");
                    bookTitle = scanner.nextLine();
                    book = libreria.getBookByTitle(bookTitle, true);
                    if  (book == null) {
                        System.out.println("Book not found");
                        break;
                    }
                    libreria.borrowBook(user, book);
                    System.out.println("Book " + book.getTitle() + " successfully borrowed by " + user.getName());
                    break;
                case 7:
                    System.out.println("Enter the user name");
                    userName = scanner.nextLine();
                    user = libreria.getUser(userName);
                    System.out.println("Enter the book title");
                    bookTitle = scanner.nextLine();
                    book = libreria.getBookByTitle(bookTitle, false);
                    libreria.returnBook(user, book);
                    System.out.println("Book " + book.getTitle() + " successfully returned by " + user.getName());
                    break;
                case 8:
                    System.out.println("Enter the book title");
                    bookTitle = scanner.nextLine();
                    book = libreria.getBookByTitle(bookTitle);
                    book.displayDetails();
                    break;
                case 9:
                    System.out.println("Enter the book author");
                    String bookAuthor = scanner.nextLine();
                    ArrayList<LibraryBook> books = libreria.getBookByAuthor(bookTitle);
                    System.out.println("Books by author " + bookAuthor + ":");
                    for (LibraryBook b : books) {
                        b.displayDetails();
                    }
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

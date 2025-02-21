package esercizi_compito.week5.pp_dc_rs;

import esercizi_compito.week5.pp_dc_rs.exceptions.BookNotBorrowedByUserException;
import esercizi_compito.week5.pp_dc_rs.exceptions.BookNotExistsException;
import esercizi_compito.week5.pp_dc_rs.exceptions.UserNotExistsException;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Library {
    private ArrayList<LibraryBook> books;
    private ArrayList<User> users;

    public Library(ArrayList books) {
        this.books = books;
    }

    public Library() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public Library(ArrayList books, ArrayList users) {
        this.books = books;
        this.users = users;
    }

    public ArrayList<LibraryBook> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<LibraryBook> books) {
        this.books = books;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public void addBook(LibraryBook book) {
        for (LibraryBook libro : books) {
            if (libro.getIsbn().equals(book.getIsbn())) {
                System.out.println("Book " + book.getTitle() + " with same ISBN already exists in Library");
                return;
            }
        }
        books.add(book);
    }

    public void removeBook(LibraryBook book) {
        books.remove(book);
    }

    public void addBooks(ArrayList<LibraryBook> books) {
        for (LibraryBook book : books) {
            addBook(book);
        }
    }

    public void removeBooks(ArrayList<LibraryBook> books) {
        this.books.removeAll(books);
    }

    public void addUsers(ArrayList<User> users) {
        this.users.addAll(users);
    }

    public void removeUsers(ArrayList<User> users) {
        this.users.removeAll(users);
    }

    public User getUser(String name) throws UserNotExistsException {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        throw new UserNotExistsException();
    }

    public LibraryBook getBookByTitle(String title) {
        for (LibraryBook libro : books) {
            if (libro.getTitle().equals(title)) {
                return libro;
            }
        }
        return null;
    }

    public LibraryBook getBookByTitle(String title, boolean isAvailable) {
        for (LibraryBook libro : books) {
            if (libro.getTitle().equals(title) && libro.getIsAvailable() == isAvailable) {
                return libro;
            }
        }
        return null;
    }



    public ArrayList<LibraryBook> getBookByAuthor(String authorName) {
        ArrayList<LibraryBook> ricerca = new ArrayList<>();
        for (LibraryBook libro : books) {
            if (libro.getAuthor().equals(authorName) && libro.getIsAvailable()) {
                ricerca.add(libro);
            }
        }
        return ricerca;
    }

    public boolean checkUser (User user) throws UserNotExistsException {
        if(!users.contains(user)){
            throw new UserNotExistsException();
        }

        return true;
    }

    public boolean checkBook (LibraryBook libro) throws BookNotExistsException {
        if(!books.contains(libro)){
            throw new BookNotExistsException();
        }
        return true;
    }

    public void borrowBook(User user, LibraryBook libro) {
        /* try catch controlla se il libro esiste ed è disponibile e l'utente esiste, altrimenti stampa un messaggio significativo*/
        try {
            if (checkBook(libro) && libro.getIsAvailable() && checkUser(user)) {
                user.borrowBook(libro);
                LibraryBookBorrowHistoryEntry entry = new LibraryBookBorrowHistoryEntry(user, libro, new Date());
                LibraryBookBorrowHistory.getInstance().addBorrowEntry(entry);
                libro.setIsAvailable(false);
            }
        } catch (BookNotExistsException | UserNotExistsException e) {
            System.err.println("Errore: impossibile dare in prestito il libro " + libro + " all'utente " + user.getName() + " perchè: " + e.getMessage()) ;
        }
    }

    public void returnBook(User user, LibraryBook libro) {
        try {
            if (checkBook(libro) && !libro.getIsAvailable() && checkUser(user) && user.hasBorrowedBook(libro)) {
                LibraryBookBorrowHistory storico = LibraryBookBorrowHistory.getInstance();
                ArrayList<LibraryBookBorrowHistoryEntry> storicoDiQuelLibroPerQuellUtente = storico.getBorrowHistoryEntry(user, libro, false);
                LibraryBookBorrowHistoryEntry entry = storicoDiQuelLibroPerQuellUtente.get(0);
                entry.setReturnDate(new Date());
                user.returnBook(libro);
                libro.setIsAvailable(true);
            }
        } catch (
            BookNotExistsException
            | UserNotExistsException
            | BookNotBorrowedByUserException e
        ) {
            System.err.println("Errore: impossibile restituire il libro " + libro + " dall'utente " + user.getName()+ " perchè: " + e.getMessage());
        }
    }



    public ArrayList<LibraryBook> listAuthorBooks(String author) {
        ArrayList<LibraryBook> ricerca = new ArrayList<>();
        for (LibraryBook libro : books) {
            if (libro.getAuthor().equals(author)) {
                ricerca.add(libro);
            }
        }
        return ricerca;
    }

    public void addUser(User user) {
        if (users.contains(user)) {
            System.out.println("Errore: utente già esistente");
            return;
        }
        users.add(user);
    }
    public void removeUser(User user) {
        //controlla se l'utente esiste già
        if (!users.contains(user)) {
            System.out.println("Errore: utente non esistente");
            return;
        }
        users.remove(user);
    }

    public ArrayList<LibraryBook> listUserBooks(User user) {
        if (!users.contains(user)) {
            System.out.println("Errore: utente non esistente");
            return null;
        }
        return user.getBorrowedBooks();
    }

    public void displayDetails() {
        System.out.println("Dettagli della libreria:");
        for (LibraryBook libro : books) {
            libro.displayDetails();
        }
        System.out.println("Dettagli degli utenti:");
        for (User user : users) {
            System.out.println("Nome: " + user.getName());
            System.out.println("Libri presi in prestito:");
            for (LibraryBook libro : user.getBorrowedBooks()) {
                libro.displayDetails();
            }
        }
    }

    public void displayBooks() {
        System.out.println("Tutti i libri:");
        for (LibraryBook libro : books) {
            libro.displayDetails();
        }
    }

    public void displayUsers() {
        System.out.println("Tutti gli utenti:");
        for (User user : users) {
            System.out.println("Nome: " + user.getName());
        }
    }

    public void displayBooksBorrowedByUser(String user) {
        for (User u : users) {
            if (u.getName().equals(user)) {
                System.out.println("Libri presi in prestito da " + user + ":");
                for (LibraryBook libro : u.getBorrowedBooks()) {
                    libro.displayDetails();
                }
            }
        }
    }

    public void displayAllBooksBorrowed() {
        for (User user : users) {
            System.out.println("Libri presi in prestito da " + user.getName() + ":");
            for (LibraryBook libro : user.getBorrowedBooks()) {
                libro.displayDetails();
            }
            System.out.println();
        }
    }

    public void displayAllBooksAvailable() {
        System.out.println("Tutti i libri disponibili:");
        for (LibraryBook libro : books) {
                if (!libro.getIsAvailable()) {
                    continue;
                }
                libro.displayDetails();
        }
    }

    public void simulateBooksBorrowed(int howMany, int leaveAvailable) {
        for (int i=0; i < howMany; i++) {
            this.borrowBook(
                users.get(new Random().nextInt(users.size())),
                books.get(new Random().nextInt(books.size() - 3))
            );
        }
    }

}

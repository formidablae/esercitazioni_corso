package esercizi_compito.week5.pp_dc_rs;

import esercizi_compito.week5.pp_dc_rs.exceptions.BookNotAvailableException;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryBook> books;
    ArrayList<User> users;

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

    public LibraryBook searchBook(String title) {
        for (LibraryBook libro : books) {
            if (libro.getTitle().equals(title) && libro.isAvailable()) {
                return libro;

            }

        }
        return null;
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
            if (checkBook(libro) && libro.isAvailable() && checkUser(user)) {
                user.borrowBook(libro);
                libro.setAvailable(false);
            }
        } catch (BookNotExistsException | UserNotExistsException e) {
            System.err.println("Errore: impossibile dare in prestito il libro " +libro.formattedTitle() + " all'utente " + user.getName() + " perchè " + e.getMessage()) ;
        }

    }



    public void returnBook(User user, LibraryBook libro) {
        try {
            if (checkBook(libro) && !libro.isAvailable() && checkUser(user) && user.hasBorrowedBook(libro)) {
                user.returnBook(libro);
                libro.setAvailable(true);
            }
        } catch (BookNotExistsException | UserNotExistsException | BookNotAvailableException e) {
            System.err.println("Errore: impossibile restituire il libro " + libro.formattedTitle() + " dall'utente " + user.getName()+ " perchè " + e.getMessage());
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

    // - addUser(User) che aggiunge un utente
// - removeUser(User) che rimuove un utente
// - listUserBooks(User) che restituisce un array di LibraryBook presi in prestito da un utente
// - displayDetails() che stampa i dettagli della libreria e degli utenti

    public void addUser(User user) {
        //controlla se l'utente esiste già
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



}

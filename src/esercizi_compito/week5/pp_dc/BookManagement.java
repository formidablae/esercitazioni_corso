package esercizi_compito.week5.pp_dc;

import java.util.ArrayList;

public class BookManagement {
    public static void main(String[] args) {
        // scrivere qui la soluzione per il main
        ArrayList<LibraryBook> elencoLibri = new ArrayList<>();
        elencoLibri.add(new LibraryBook("Java Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("Python Essentials", "John Doe", "987-654-321"));
        elencoLibri.add(new LibraryBook("Data Structures in Java", "Alice Brown", "567-890-123"));
        elencoLibri.add(new LibraryBook("C++ Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("JavaScript Essentials", "Jane Smith", "987-654-321"));
        elencoLibri.add(new LibraryBook("Algorithms in Java", "Alice Brown", "567-890-123"));
        elencoLibri.add(new LibraryBook("C# Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("HTML Essentials", "Jane Smith", "987-654-321"));

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alice"));
        users.add(new User("Bob"));
        users.add(new User("Charlie"));

        Library libreria = new Library(elencoLibri, users);

        libreria.borrowBook(users.get(0), elencoLibri.get(2));
        libreria.borrowBook(users.get(0), elencoLibri.get(2));
        libreria.borrowBook(users.get(1), elencoLibri.get(1));
        libreria.borrowBook(users.get(1), elencoLibri.get(4));
        libreria.borrowBook(users.get(0), elencoLibri.get(1));

        try {
            LibraryBook libroTrovato1 = libreria.searchBook("Java Programming");
            LibraryBook libroTrovato2 = libreria.searchBook("C++ Programming");
            libroTrovato1.displayDetails();
            libroTrovato2.displayDetails();
        } catch (Exception e) {
            System.err.println("Errore: libro non trovato");
        }

        for (int i=0; i < libreria.books.size(); i++) {
            if (libreria.books.get(i).isAvailable()) {
                System.out.println("Il libro " + libreria.books.get(i).formattedTitle() + " è disponibile.");
            } else {
                System.out.println("Il libro " + libreria.books.get(i).formattedTitle() + " non è disponibile.");
            }
        }

        libreria.displayDetails();
    }
}

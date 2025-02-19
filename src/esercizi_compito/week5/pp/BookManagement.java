package esercizi_compito.week5.pp;

// 1. scrivere un'interfaccia IBookOperations con i seguenti metodi:
// - displayDetails() che stampa i dettagli del libro
// 2. scrivere una classe Book che ha i seguenti campi:
// - title (String)
// - author (String)
// e i seguenti metodi:
// - formattedTitle() che restituisce il titolo come "Titolo - Autore" in formato String
// 3. scrivere una classe LibraryBook che estende Book e implementa IBookOperations
// - aggiungere un campo String isbn
// - implementare il metodo displayDetails() che stampa i dettagli del libro in formato "Titolo - Autore | ISBN"
// 4. scrivere una classe Library che ha i seguenti campi:
// - books, un array di LibraryBook
// e i seguenti metodi:
// - searchBook che restituisce il libro con il titolo passato come parametro
// - listAuthorBooks che restituisce un array di LibraryBook con i libri scritti dall'autore passato come parametro
// - eventualmente scrivere metodi aggiuntivi d'aiuto
// 5. in main di BookManagement creare un array con 3 LibraryBook
// - "Java Programming", "John Doe", "123-456-789"
// - "Python Essentials", "Jane Smith", "987-654-321"
// - "Data Structures in Java", "Alice Brown", "567-890-123"
// creare un'istanza di Library con tale array
// 6. cercare un libro in tale Library e gestire eventuali errori con un try-catch

import java.util.ArrayList;

public class BookManagement {
    public static void main(String[] args) {
        // scrivere qui la soluzione per il main
        ArrayList<LibraryBook> elencoLibri = new ArrayList<>();
        elencoLibri.add(new LibraryBook("Java Programming", "John Doe", "123-456-789"));
        elencoLibri.add(new LibraryBook("Python Essentials", "John Doe", "987-654-321"));
        elencoLibri.add(new LibraryBook("Data Structures in Java", "Alice Brown", "567-890-123"));

        Library libreria = new Library(elencoLibri);

        try {
            LibraryBook libroTrovato1 = libreria.searchBook("Java Programming");
            LibraryBook libroTrovato2 = libreria.searchBook("C++ Programming");
            libroTrovato1.displayDetails();
            libroTrovato2.displayDetails();
        } catch (Exception e) {
            System.out.println("Errore: libro non trovato");
        }
    }
}

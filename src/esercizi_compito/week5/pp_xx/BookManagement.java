package esercizi_compito.week5.pp_xx;

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

// requisiti aggiuntivi:
// 7. scrivere una classe User con i seguenti campi:
// - name (String)
// - borrowedBooks (ArrayList<LibraryBook>)
// 8. aggiungere un campo isAvailable (boolean) in LibraryBook che di default prende valore true
// 9. aggiungere nell'interfaccia IBookOperations i metodi:
// - borrowBook() che assegna un libro ad un utente (lo aggiunge nell'ArrayList borrowedBooks)
//   e imposta il isAvailable del libro a false
// - returnBook() che rimuove un libro da un utente (lo rimuove dall'ArrayList borrowedBooks)
//   e imposta il isAvailable del libro a true
// 10. modificare il metodo searchBook in Library in modo che restituisca il libro solo se isAvailable è true
// 11. modificare il metodo borrowBook in modo che restituisca un errore se il libro non è disponibile
// 12. modificare il metodo returnBook in modo che restituisca un errore se il libro è già disponibile
// 13. displayDetails() deve stampare anche se il libro è disponibile o meno
// 14. aggiungere in Libreria un campo users (ArrayList<User>) inizializato a array vuoto e i metodi:
// - addUser(User) che aggiunge un utente
// - removeUser(User) che rimuove un utente
// - listUserBooks(User) che restituisce un array di LibraryBook presi in prestito da un utente
// - displayDetails() che stampa i dettagli della libreria e degli utenti
// 15. Deve essere possibile creare una Libreria sia fornendo un elenco libri e utenti che solo elenco libri
// 16. nel main di BookManagement aggiungere in libreria altri 5 LibraryBook
// - "C++ Programming", "John Doe", "123-456-789"
// - "JavaScript Essentials", "Jane Smith", "987-654-321"
// - "Algorithms in Java", "Alice Brown", "567-890-123"
// - "C# Programming", "John Doe", "123-456-789"
// - "HTML Essentials", "Jane Smith", "987-654-321"
// 17. nel main di BookManagement creare 3 Users
// - "Alice"
// - "Bob"
// - "Charlie
// 18. aggiungere gli utenti alla libreria
// 19. dare alcuni libri in prestito agli utenti
// 20. controllare se i libri sono disponibili o meno
// 21. stampare i dettagli della libreria e degli utenti

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

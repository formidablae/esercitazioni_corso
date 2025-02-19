package esercizi_compito.week5.pp_xx;

import java.util.ArrayList;

public class Library {
    ArrayList<LibraryBook> books;

    public Library(ArrayList books) {
        this.books = books;
    }

    public LibraryBook searchBook(String title) {
        for (LibraryBook libro : books) {
            if (libro.getTitle().equals(title)) {
                return libro;
            }
        }
        return null;
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
}

package esercizi_compito.week5.pp_dc_rs;

import esercizi_compito.week5.pp_dc_rs.exceptions.BookNotBorrowedByUserException;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<LibraryBook> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public User(String name, ArrayList<LibraryBook> borrowedBooks) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(LibraryBook book) {
        borrowedBooks.add(book);
    }

    public void returnBook(LibraryBook book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBorrowedBook(LibraryBook book) throws BookNotBorrowedByUserException {
        if (!borrowedBooks.contains(book)) {
            throw new BookNotBorrowedByUserException();
        }
        return true;
    }

    public ArrayList<LibraryBook> getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getName() {
        return name;
    }
}

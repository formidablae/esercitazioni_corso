package esercizi_compito.week5.pp_dc_rs;

import java.util.ArrayList;

public class LibraryBook extends Book implements IBookOperations{
    private String isbn;
    private boolean isAvailable;

    public LibraryBook(String title, String author,String isbn) {
        super(title, author);
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return getTitle() + " - " + getAuthor() + " | " + isbn + " (" + (isAvailable ? "available" : "not available") + ")";
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    public String getIsbn() {
        return isbn;
    }

    public ArrayList<LibraryBookBorrowHistoryEntry> getBorrowHistory() {
        return LibraryBookBorrowHistory.getInstance().getBookHistory(isbn);
    }
}

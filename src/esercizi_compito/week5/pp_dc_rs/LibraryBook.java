package esercizi_compito.week5.pp_dc_rs;

import esercizi_compito.week5.pp_dc_rs.exceptions.BookNotAvailableException;

public class LibraryBook extends Book implements IBookOperations{
    private String isbn;
    private boolean isAvailable;

    public LibraryBook(String title, String author,String isbn) {
        super(title, author);
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean isAvailable() throws BookNotAvailableException {
        if(!isAvailable){
            throw new BookNotAvailableException();
        }

        return true;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String formattedTitle() {
        return getTitle() + " - " + getAuthor() + " | " + isbn;
    }

    @Override
    public void displayDetails() {
        System.out.println(formattedTitle());
    }
}

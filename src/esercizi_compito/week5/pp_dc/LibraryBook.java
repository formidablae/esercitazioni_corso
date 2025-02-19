package esercizi_compito.week5.pp_dc;

public class LibraryBook extends Book implements IBookOperations{
    private String isbn;
    private boolean isAvailable;

    public LibraryBook(String title, String author,String isbn) {
        super(title, author);
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
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

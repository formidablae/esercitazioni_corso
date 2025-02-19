package esercizi_compito.week5.pp;

public class LibraryBook extends Book implements IBookOperations{
    private String isbn;

    public LibraryBook(String title, String author,String isbn) {
        super(title, author);
        this.isbn = isbn;
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

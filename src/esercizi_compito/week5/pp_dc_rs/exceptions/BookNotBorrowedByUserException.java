package esercizi_compito.week5.pp_dc_rs.exceptions;

public class BookNotBorrowedByUserException extends Exception {
    public BookNotBorrowedByUserException() {
        super("This books was not borrowed by this user");
    }
}

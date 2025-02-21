package esercizi_compito.week5.pp_dc_rs.exceptions;

public class BookNotBorrowedByUserException extends Exception {
    public BookNotBorrowedByUserException() {
        super("Il libro non è stato preso in prestito da questo utente");
    }
}

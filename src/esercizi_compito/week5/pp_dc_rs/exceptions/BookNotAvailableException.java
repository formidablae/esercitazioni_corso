package esercizi_compito.week5.pp_dc_rs.exceptions;

public class BookNotAvailableException extends Exception {

    public BookNotAvailableException() {

        super("Il libro non è disponibile");
    }
}

package esercizi_compito.week5.pp_dc_rs.exceptions;

public class UserNotExistsException extends Exception {

    public UserNotExistsException() {

        super("L'utente non esiste");
    }
}

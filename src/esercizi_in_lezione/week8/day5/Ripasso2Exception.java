package esercizi_in_lezione.week8.day5;

public class Ripasso2Exception {
    public static void main(String[] args) throws MyException {
        // TODO: fai una divisione per zero
        // cattura l'eccezione e lancia manualmente una nuova eccezione MyException
        // stampa il messaggio d'errore
        try {
           int x = 10/0;
        }
        catch (Exception e){
            throw new MyException("Divisione per 0");
        }
    }
}

// TODO: definire un'eccezione personalizzata
class MyException extends Exception {
    // TODO:
    public MyException (String message){
        super (message);
    }
}

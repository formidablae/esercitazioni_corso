package esercizi_in_lezione.week5.day2.exception_handling;

class IlMioErroreException extends Exception {
    public IlMioErroreException(String message) {
        super(message);
    }
}

class IlMioSecondoErroreException extends IlMioErroreException {
    private String unMioCampo;

    public IlMioSecondoErroreException(String message, String unMioCampoParam) {
        super(message);
        this.unMioCampo = unMioCampoParam;
    }

    public String getUnMioCampo() {
        return unMioCampo;
    }
}

class ExceptionPropagation {
    static void metodo1() throws IlMioSecondoErroreException {
        metodo2();
    }

    static void metodo2() throws IlMioSecondoErroreException {
        metodo3();
    }

    static void metodo3() throws IlMioSecondoErroreException {
        try {
            int risultato = 10 / 0; // Genera ArithmeticException
        } catch (ArithmeticException e) {
            throw new IlMioSecondoErroreException("Errore personalizzato", "Divisone per 0");
        }
    }

    public static void main(String[] args) {
        try {
            metodo1();
            System.out.println("Codice runnato con successo");
        } catch (IlMioSecondoErroreException e) {
            System.out.println("Errore: Divisione per zero intercettata!");
            System.out.println("unMioCampo dell'errore:   9" + e.getUnMioCampo());
            // e.printStackTrace();
        }
    }
}

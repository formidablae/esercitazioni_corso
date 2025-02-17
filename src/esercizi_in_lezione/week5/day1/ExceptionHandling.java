package esercizi_in_lezione.week5.day1;

public class ExceptionHandling {
    public static void main(String[] args) {
        int indice = 5;
        String[] ilMioArray = {"Elemento 1", "Elemento 2", "Elemento 3"};
        try {
            String elemento = ilMioArray[indice];
            System.out.println("Elemento selezionato: " + elemento);
            System.out.println("Esecuzione conclusa con successo!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice non valido!");
            // e.printStackTrace();
            System.out.println("Ok, allora prendo l'ultimo elemento: " + ilMioArray[ilMioArray.length - 1]);
        }
    }
}

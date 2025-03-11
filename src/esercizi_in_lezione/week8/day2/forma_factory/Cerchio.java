package esercizi_in_lezione.week8.day2.forma_factory;

public class Cerchio implements Forma {
    @Override
    public void disegna() {
        System.out.println("Stai disegnando un cerchio");
    }

    public int getRaggio() {
        return 0;
    }
}

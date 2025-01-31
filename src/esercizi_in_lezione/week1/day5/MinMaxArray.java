package esercizi_in_lezione.week1.day5;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] numeri = {15, 3, 9, 20, 7, 12};

        int minimo = numeri[0];
        int massimo = numeri[0];

        System.out.println("Entro nel ciclo for");

        for (int i = 1; i < numeri.length; i++) {
            System.out.println(
                "Minimo prima era: " + minimo + "\nMassimo prima era: " + massimo
            );
            System.out.println(
                "Sto consideranto l'elemento in pos " + i + " che è: " + numeri[i]
            );
            if (minimo > numeri[i]) {
                minimo = numeri[i];
            }
            if (massimo < numeri[i]) {
                massimo = numeri[i];
            }

            System.out.println(
                "Nuovo minimo è: " + minimo + "\nNuovo massimo è: " + massimo + "\n\n"
            );
        }

        System.out.println("Esco dal ciclo for");
        System.out.println(
            "Risultato: Minimo = " + minimo + "\nMassimo = " + massimo
        );
    }
}

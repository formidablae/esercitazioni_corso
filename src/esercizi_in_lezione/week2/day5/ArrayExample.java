package esercizi_in_lezione.week2.day5;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numeri = {1, 3, 7, 2, 8};

        int primoElemento = numeri[0];
        int secondoElemento = numeri[1];

        System.out.println("Elemento dell'array in posizione 0 è: " + primoElemento);
        System.out.println("Entro nel ciclo for");

        int sommaElementi = 0;

        // stampare gli elementi dell'array
        for (int i = 0; i < numeri.length; i++) {
            sommaElementi += numeri[i];
            System.out.println(
                "Elemento dell'array in posizione " + i + " è: " + numeri[i]
            );
        }

        System.out.println("Esco dal ciclo for");
        System.out.println("sommaElementi = " + sommaElementi);
    }
}

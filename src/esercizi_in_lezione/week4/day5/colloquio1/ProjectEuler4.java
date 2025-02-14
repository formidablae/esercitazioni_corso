package esercizi_in_lezione.week4.day5.colloquio1;

/*
https://projecteuler.net/problem=4

Problema: Palindromo più grande da due numeri a 3 cifre
Un numero palindromo è un numero che si legge uguale sia da sinistra a destra che da destra a sinistra.

Il palindromo più grande ottenuto dal prodotto di due numeri a 2 cifre è 9009 = 91 × 99.

Trovare il più grande numero palindromo ottenuto dal prodotto di due numeri a 3 cifre.
 */
public class ProjectEuler4 {
    public static void main(String[] args) {
        // scrivere qui la soluzione

        int palindromoMax=0;


        for(int i=100; i<1000; i++){

            for(int j=100; j<1000; j++){

                int prodotto = i*j;

                if(prodotto>palindromoMax && isPalindromo(prodotto)) {
                    palindromoMax=prodotto;
                }

            }

        }

        System.out.println(palindromoMax);

    }


    public static boolean isPalindromo(int numero){

        String numeroStr = ""+numero;
        String numeroContr = conversione(numeroStr);

        if (numeroStr.equals(numeroContr)) {

            return true;
        }
        else {

            return false;

        }

    }

    public static String conversione(String imput){

         String risultato = "";
         for(int i=imput.length()-1; i>=0; i--){

             risultato=risultato+imput.charAt(i);

         }
            return risultato;


    }
}

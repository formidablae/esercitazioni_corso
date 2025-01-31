package esercizi_in_lezione.week1.day2;

public class OperatoriAssegnazione {
    public static void main(String[] args) {
        int numero = 10;
        // numero è pari a 10
        numero = 5;
        // numero è pari a 5

        numero = numero + 2;
        // numero è pari a 7
        numero += 2;
        // numero è pari a 9

        numero = numero - 2;
        // numero è pari a 7
        numero -= 2;
        // numero è pari a 5

        numero = numero * 2;
        // numero è pari a 10
        numero *= 2;
        // numero è pari a 20

        numero = numero + 1;
        // numero è pari a 21
        numero += 1;
        // numero è pari a 22
        numero++;
        // numero è pari a 23
        ++numero;
        // numero è pari a 24

        int numeroA = 5;
        int numeroB = 7;
        int numeroC = numeroA + numeroB;
        numeroC = numeroB - 2;

    }
}

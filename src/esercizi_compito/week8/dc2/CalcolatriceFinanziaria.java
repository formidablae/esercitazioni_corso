package esercizi_compito.week8.dc2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/*
1. scrivere una funzione static calcolaInteresse(...) che:
- prende in input un BigInteger capitale,
- prende in input un BigDecimal tasso,
- prende in input un int anni
- la formula per il calcolo dell'interesse è:
    totaleInteresse = capitale * ((1 + tasso) ^ anni)
- restituire il valore dell'interesse come BigDecimal

2. scrivere una funzione static sommaBigIntegers(...) che:
- prende in input due BigInteger
- restituire la somma dei due BigInteger

3. scrivere una funzione static sommaBigIntegers(...) che:
- prende in input un array di BigInteger
- restituire la somma dei BigInteger nell'array
- se l'array è vuoto, restituire 0

4. scrivere una funzione fa la divisione di BigDecimal in modo sicuro:
- nome funzione static divisioneSicuraBigDecimal(...)
- prende in input un BigDecimal dividendo
- prende in input un BigDecimal divisore
- se il divisore è 0, lanciare un'eccezione
- restituire il risultato della divisione

5. scrivere una funzione che calcola la rata mensile di un mutuo
dato importo capitale del mutuo, tasso di interesse e numero di anni:
- nome funzione static calcolaRataMutuo(...)
- prende in input un BigDecimal capitale
- prende in input un BigDecimal tasso di interesse
- prende in input un int anni
- restituire il valore della rata mensile come BigDecimal
- la formula per il calcolo della rata mensile è:
    rataMensile = (capitale * tasso) / (1 - ((1 + tasso) ^ (-anni)))

6. nel main, chiamare la funzione calcolaInteresse(...) con i seguenti valori:
- capitale = 200000
- tasso = 2.7% (0.027)
- anni = 20
- stampare il risultato della funzione calcolaInteresse(...)

7. nel main, chiamare la funzione calcolaRataMutuo(...) con i seguenti valori:
- capitale = 200000
- tasso = 2.7% (0.027)
- anni = 20
- stampare il risultato della funzione calcolaRataMutuo(...)

8. nel main, chiamare la funzione sommaBigIntegers(...) con i seguenti valori:
- 100000000000
- 200000000000
- stampare il risultato della funzione sommaBigIntegers(...)

9. nel main, chiamare la funzione divisioneSicuraBigDecimal(...) con i seguenti valori:
- dividendo = 1000000000000.1
- divisore = 2.99999999999
- stampare il risultato della funzione divisioneSicuraBigDecimal(...)
 */
public class CalcolatriceFinanziaria {
    // implementare qui le funzionalità richieste
    public static void main(String[] args) {
        BigDecimal bigDec = calcolaInteresse(new BigInteger("200000"), new BigDecimal("0.027"), 20);
        System.out.println("Interesse: " + bigDec);

        BigDecimal bigDec2 = calcolaRataMutuo(new BigDecimal("200000"), new BigDecimal("0.027"), 20);
        System.out.println("Rata: " + bigDec2);

        BigInteger sommaBigInt = sommaBigIntegers(new BigInteger("100000000000"), new BigInteger("200000000000"));
        System.out.println("Somma: " + sommaBigInt);

        BigDecimal divBigDec = divisioneSicuraBigDecimal(new BigDecimal("1000000000000.1"), new BigDecimal("2.99999999999"));
        System.out.println("Divisione: " + divBigDec);


    }

    public static BigDecimal calcolaInteresse(BigInteger capitale, BigDecimal tasso, int anni) {
        return tasso.add(BigDecimal.valueOf(1)).pow(anni).multiply(new BigDecimal(capitale)).subtract(new BigDecimal(capitale));
    }


    public static BigInteger sommaBigIntegers(BigInteger bigInt1, BigInteger bigInt2) {
        return bigInt1.add(bigInt2);
    }

    public static BigInteger sommaBigIntegers(BigInteger[] arrayBigInt) {
        BigInteger somma = new BigInteger("0");

        for (BigInteger numero : arrayBigInt) {
            somma = somma.add(numero);
        }
        return somma;
    }

    public static BigDecimal divisioneSicuraBigDecimal(BigDecimal bigDec1, BigDecimal bigDec2) {
        if (bigDec2.equals(new BigDecimal(0))) {
            throw new ArithmeticException();
        }
        return bigDec1.divide(bigDec2, 10, RoundingMode.HALF_UP);
    }

    public static BigDecimal calcolaRataMutuo(BigDecimal capitale, BigDecimal tassoDiInteresse, int anni) {
        BigDecimal capitalePerTasso = capitale.multiply(tassoDiInteresse);
        BigDecimal tassoPiu1 = tassoDiInteresse.add(BigDecimal.valueOf(1));
        BigDecimal potenza = tassoPiu1.pow(anni);
        BigDecimal unoSuPotenza = BigDecimal.valueOf(1).divide(potenza, 10, RoundingMode.HALF_UP);
        BigDecimal unoMenoPotenza = BigDecimal.valueOf(1).subtract(unoSuPotenza);
        BigDecimal rataAnnuale = capitalePerTasso.divide(unoMenoPotenza, 10, RoundingMode.HALF_UP);

        return rataAnnuale.divide(BigDecimal.valueOf(12), 10, RoundingMode.HALF_UP);
    }
}

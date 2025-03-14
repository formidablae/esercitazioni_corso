package esercizi_in_lezione.week8.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ripasso2Interface {
    public static void main(String[] args) {
        // TODO: Usare il metodo sort
        OrdinamentoArray ordinaArray = new OrdinamentoArray();

        ArrayList<String> array = new ArrayList<>();
        array.add("1");
        array.add("2");
        array.add("3");

        ArrayList<String> arrayOrdinato = ordinaArray.sort(array);
        System.out.println(arrayOrdinato);
    }
}

// TODO: scrivere un'interfaccia che definisce un metodo che prende in input un array di stringhe e ritorna un array di stringhe ordinato
interface OrdinaArray {
    ArrayList<String> sort(ArrayList<String> array);
}

// TODO: scrivere una classe che implementa l'interfaccia e definisce il metodo

class OrdinamentoArray implements OrdinaArray {
    @Override
    public ArrayList<String> sort(ArrayList<String> array) {
        Collections.sort(array);
        return array;
    }
}

// TODO: scrivere un test sul metodo sort
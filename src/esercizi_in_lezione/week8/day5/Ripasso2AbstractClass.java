package esercizi_in_lezione.week8.day5;

public class Ripasso2AbstractClass {
    public static void main(String[] args) {
        // TODO: Usare il metodo sort
        Sorter sorter = new Sorter1();
        String[] array = {"ciao", "come", "stai", "bene", "tutto", "bene"};
        String[] sorted = sorter.sort(array);
        for (String s : sorted) {
            System.out.println(s);
        }

    }
}

// TODO: scrivere una classe astratta che dichiara un metodo che prende in input un array di stringhe e ritorna un array di stringhe ordinato
abstract class Sorter {
    abstract String[] sort(String[] array);
}
// TODO: scrivere una classe che eredita dalla classe astratta e definisce il metodo
class Sorter1 extends Sorter {
    @Override
    String[] sort(String[] array) {
        String[] sorted = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            sorted[i] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (sorted[j].compareTo(sorted[j + 1]) > 0) {
                    String temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        return sorted;
    }
}
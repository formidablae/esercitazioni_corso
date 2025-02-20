package esercizi_in_lezione.week5.day4.autoboxing_unboxing;

import java.util.ArrayList;

public class DataTypeConversion {
    public static void main(String[] args) {
        int num = 10;
        double decimal = 5.5;
        boolean flag = true;

        Integer numObj = num;
        Double decimalObj = decimal;
        Boolean flagObj = flag;

        // Confronto tra primitivi e oggetti wrapper
        System.out.println("num == numObj? " + (num == numObj));  // True
        System.out.println("decimal == decimalObj? " + (decimal == decimalObj));  // True
        System.out.println("flag == flagObj? " + (flag == flagObj));  // True

        ArrayList<Integer> elencoInteri = new ArrayList<Integer>();
        // Autoboxing: il passaggio da oggetti primitivi a wrapper
        // quindi da int -> Integer
        elencoInteri.add(5);
        elencoInteri.add(2);
        elencoInteri.add(4);

        // Unboxing: il passaggio da oggetti wrapper a primitivi
        // quindi da Integer -> int
        int somma = elencoInteri.get(0) + elencoInteri.get(1) + elencoInteri.get(2);
        System.out.println("\nLa somma degli elementi è: " + somma);

        Integer x = 7;  // autoboxing: primitivo -> nonprimitivo
        Integer xQuadrato = quadrato(x);  // nonprimitivo -> nonprimitivo
        System.out.println("\nIl quadrato di " + x + " è: " + xQuadrato);

        Double numDec = 9.75; // Autoboxing
        int intValue = numDec.intValue(); // Unboxing + casting

        Integer intObj = intValue;  // Autoboxing

        System.out.println("\nValore Double: " + numDec);
        System.out.println("Dopo cast a int: " + intValue);
        System.out.println("Autoboxing in Integer: " + intObj);
    }

    public static Integer quadrato(Integer x) {
        return x * x;
    }
}

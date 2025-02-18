package esercizi_in_lezione.week5.day2.null_nullability;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NullValues {
    public static void main(String[] args) {
        boolean mattina = true;
        String saluto = mattina ? "Buongiorno" : "Buonasera";
        System.out.println("saluto: " + saluto);
        /*
        String saluto;
        if (mattina == true) {
            saluto = "Buongiorno";
        } else {
            saluto = "Buonasera";
        }
        */
        int[] arrayOfInts = new int[5];  // primitives
        System.out.println(Arrays.toString(arrayOfInts));

        boolean[] arrayOfBooleans = new boolean[5];  // primitives
        System.out.println(Arrays.toString(arrayOfBooleans));

        String[] arrayOfStrings = new String[5];  // non primitives
        System.out.println(Arrays.toString(arrayOfStrings));

        // int x = null;
        String str1 = null;
        System.out.println("str1: " + str1);
        String str2 = "";
        System.out.println("str2: " + str2);

        if (str1 == null) {
            System.out.println("str1 è null");
        } else {
            System.out.println("str1 non è null");
        }

        String str3 = (String) ritornaNull();
        System.out.println("str3: " + str3);

        String str4 = ritornaStringa();
        System.out.println("str4: " + str4);

        String str5 = null;

        if (str4 instanceof String) {
            str5 = str4.substring(0, 2);
        } else {
            System.out.println("str4 non è una stringa");
        }

        System.out.println("str5: " + str5);

        if (str4 != null) {
            if (str4 instanceof String) {
                if (str4.length() >= 2) {
                    str5 = str4.substring(0, 2);
                } else {
                    System.out.println("str4 è una stringa ma è troppo corta");
                }
            } else {
                System.out.println("str4 non è una stringa");
            }
        } else {
            System.out.println("secondo if, str4 è null");
        }

        System.out.println("secondo if, str5: " + str5);

        // String name = "Mario";
        String name = null;
        try {
            name = Objects.requireNonNull(name, "Il nome non può essere null");
            System.out.println("name: " + name);
        } catch (NullPointerException e) {
            System.out.println("Errore: " + e.getMessage());
        }

        /*
        Scanner lettore = (Scanner) null;
        int x = lettore.nextInt();
        System.out.println("x: " + x);
         */

        /*
        String y = null;
        y.length();
        */

        String[] arrStr = {"M", null, "C"};
        for (String str : arrStr) {
            if (str != null) {
                System.out.println(str);
            }
        }
    }

    public static Object ritornaNull() {
        System.out.println("Sono dentro il metodo");
        return null;
    }

    public static String ritornaStringa() {
        String risultato = null;
        // return "dgdfhsd";
        return risultato;
    }

    public static String ritornaStringa2(boolean param) {
        return param ? "Buongiorno" : "Buonasera";
    }

    public static String ritornaStringa3(String param) {
        return param == null ? "Buongiorno" : "Buonasera";
    }

    public static String ritornaStringa4(boolean param) {
        return param ? null : "Parola";
    }
}

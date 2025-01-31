package esercizi_in_lezione.week1.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class StringsArray {
    public static void main(String[] args) {
        String[] ilMioArrayDiStringhe = {"libro", "sedia", "mouse", "schermo", "foglio"};

        // String elementoInPosMeno1 = ilMioArrayDiStringhe[-1];
        // String elementoInPos5 = ilMioArrayDiStringhe[5];

        // System.out.println("elementoInPosMeno1: " + elementoInPosMeno1);
        // System.out.println("elementoInPos5: " + elementoInPos5);

        System.out.println("prima ilMioArrayDiStringhe: " + Arrays.toString(ilMioArrayDiStringhe));
        ilMioArrayDiStringhe[2] = "telefono";
        System.out.println("dopo ilMioArrayDiStringhe: " + Arrays.toString(ilMioArrayDiStringhe));

        String[] arrayDiStringhe = {null, null};
        System.out.println("arrayDiStringhe: " + Arrays.toString(arrayDiStringhe));

        String[] ilMioArrayClonato = Arrays.copyOf(ilMioArrayDiStringhe, ilMioArrayDiStringhe.length * 2);
        System.out.println("ilMioArrayClonato: " + Arrays.toString(ilMioArrayClonato));

        ArrayList<Integer> arrayMigliore = new ArrayList<>();
        System.out.println("prima arrayMigliore: " + arrayMigliore.toString());
        arrayMigliore.add(5);
        arrayMigliore.add(2);
        arrayMigliore.add(-9);
        System.out.println("dopo arrayMigliore: " + arrayMigliore.toString());

    }
}

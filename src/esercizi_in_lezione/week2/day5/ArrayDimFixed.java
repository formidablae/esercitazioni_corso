package esercizi_in_lezione.week2.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayDimFixed {
    public static void main(String[] args) {
        int[] numbers = new int[7];
        System.out.println("numbers: " + Arrays.toString(numbers));

        String[] arrStr = new String[7];
        System.out.println("arrStr: " + Arrays.toString(arrStr));

        ArrayList<Integer> arrListInt = new ArrayList<>(7);
        System.out.println("arrListInt: " + arrListInt.toString());

        ArrayList<String> arrListStr = new ArrayList<>(8);
        System.out.println("arrListStr: " + arrListStr.toString());
    }
}

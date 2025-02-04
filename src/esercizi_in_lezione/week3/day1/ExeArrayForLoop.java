package esercizi_in_lezione.week3.day1;

import java.util.Arrays;

public class ExeArrayForLoop {
    public static void main(String[] args) {
        int[] elencoNumeri = {1, 1, 3, 3, 5, 5};
        int[] risultato = removeDuplicates(elencoNumeri);
        System.out.println("elencoNumeri: " + Arrays.toString(elencoNumeri));
        System.out.println("removeDuplicates        : " + Arrays.toString(risultato));
        System.out.println("removeDuplicatesMod     : " + Arrays.toString(removeDuplicatesMod(elencoNumeri)));
        System.out.println("removeDuplicatesModWhile: " + Arrays.toString(removeDuplicatesModWhile(elencoNumeri)));

        int[] elencoNumeri2 = {1, 1, 3, 3, 3, 5, 5, 3};
        int[] risultato2 = removeDuplicates(elencoNumeri2);
        System.out.println("\nelencoNumeri2: " + Arrays.toString(elencoNumeri2));
        System.out.println("removeDuplicates2        : " + Arrays.toString(risultato2));
        System.out.println("removeDuplicates2Mod     : " + Arrays.toString(removeDuplicatesMod(elencoNumeri2)));
        System.out.println("removeDuplicates2ModWhile: " + Arrays.toString(removeDuplicatesModWhile(elencoNumeri2)));

        int[] elencoNumeri3 = {-1, 1, 3, 3, 3, 5, 5, 3};
        int[] risultato3 = removeDuplicates(elencoNumeri3);
        System.out.println("\nelencoNumeri3: " + Arrays.toString(elencoNumeri3));
        System.out.println("removeDuplicates3        : " + Arrays.toString(risultato3));
        System.out.println("removeDuplicates3Mod     : " + Arrays.toString(removeDuplicatesMod(elencoNumeri3)));
        System.out.println("removeDuplicates3ModWhile: " + Arrays.toString(removeDuplicatesModWhile(elencoNumeri3)));

        int[] elencoNumeri4 = {1, 1, -1, 3, 3, 5, 5, 3};
        int[] risultato4 = removeDuplicates(elencoNumeri4);
        System.out.println("\nelencoNumeri4: " + Arrays.toString(elencoNumeri4));
        System.out.println("removeDuplicates4        : " + Arrays.toString(risultato4));
        System.out.println("removeDuplicates4Mod     : " + Arrays.toString(removeDuplicatesMod(elencoNumeri4)));
        System.out.println("removeDuplicates4ModWhile: " + Arrays.toString(removeDuplicatesModWhile(elencoNumeri4)));
    }

    // sostituisce con -1 il primo elemento tra due duplicati successivi
    public static int[] removeDuplicates(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;

        // [1, 2, 3, 3, 5, 5]
        //  ^  ^
        //  |  |
        //  i i+1

        // prima iterazione, i = 0, j = 0
        // [0, 0, 0, 0, 0, 0]
        //  ^  ^
        //  |  |
        //  i i+1
        //  j

        // seconda iterazione, i = 1, j = 1
        // [1, 0, 0, 0, 0, 0] temp
        // [1, 2, 3, 3, 5, 5] array
        //     ^  ^
        //     |  |
        //     i i+1
        //     j

        // terza iterazione, i = 2, j = 2
        // [1, 2, 0, 0, 0, 0] temp
        // [1, 2, 3, 3, 5, 5] array
        //        ^  ^
        //        |  |
        //        i i+1
        //        j

        // quarta iterazione, i = 3, j = 3
        // [1, 2, -1, 0, 0, 0] temp
        // [1, 2,  3, 3, 5, 5] array
        //            ^  ^
        //            |  |
        //            i i+1
        //            j

        // quinta iterazione, i = 4, j = 4
        // [1, 2, -1, 3, 0, 0] temp
        // [1, 2,  3, 3, 5, 5] array
        //               ^  ^
        //               |  |
        //               i i+1
        //               j

        // i = 5, j = 5
        // [1, 2, -1, 3, -1, 0] temp
        // usciamo dal for loop
        // [1, 2, -1, 3, -1, 5] temp
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i+1]) {
                temp[j] = array[i];
                j++;
            } else {
                temp[j] = -1;
                j++;
            }
        }
        temp[j] = array[array.length - 1];
        return temp;
    }

    public static int[] removeDuplicatesMod(int[] array) {
        int[] temp = array.clone();
        for (int i = 1; i < array.length; i++) {
            if (array[i-1] == array[i]) {
                temp[i-1] = -1;
            }
        }
        return temp;
    }

    public static int[] removeDuplicatesModWhile(int[] array) {
        int[] temp = array.clone();
        int i = 0;
        while (++i < array.length) {
            if (array[i-1] == array[i]) {
                temp[i-1] = -1;
            }
        }
        return temp;
    }
}

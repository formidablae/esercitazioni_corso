package esercizi_in_lezione.week2.day5;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // [
        //   [1, 3, 6, 7],
        //   [2, 4, 4, 6],
        //   [7, 3, 6, 9],
        // ]
        int[][] matrice = {
            {1, 3, 6, 7},
            {2, 4, 4, 6},
            {7, 3, 6, 9},
        };
        // stampaMatrice(matrice);

        System.out.println("La mia matrice: " + convertiMatriceInStringa(matrice));

        int[] elementoPos1 = matrice[1];
        System.out.println("elementoPos1: " + Arrays.toString(elementoPos1));

        int elementoPos2e3 = matrice[2][3];
        System.out.println("elementoPos2e3: " + elementoPos2e3);
    }

    public static void stampaMatrice(int[][] arrayBiDim) {
        System.out.print("[");
        for (int i = 0; i < arrayBiDim.length; i++){
            System.out.print(Arrays.toString(arrayBiDim[i])+ ", ");
        }
        System.out.print("]");
    }

    public static String convertiMatriceInStringa(int[][] arrayBiDim) {
        String risp = "[";
        for (int i = 0; i < arrayBiDim.length; i++){
            risp += Arrays.toString(arrayBiDim[i]) + ", ";
        }
        return risp + "]";
    }
}

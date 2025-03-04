package esercizi_compito.week7.colloquio2.dc;

/*
A school is trying to take an annual photo of all the students.
The students are asked to stand in a single file line in non-decreasing order by height.
Let this ordering be represented by the integer array expected where expected[i] is the expected height of the ith student in line.

You are given an integer array heights representing the current order that the students are standing in.
Each heights[i] is the height of the ith student in line (0-indexed).

Return the number of indices where heights[i] != expected[i].
 */

import java.util.Arrays;

public class HeightChecker1051LeetCode {
    public static void main(String[] args) {
        int[] heights1 = {1,1,4,2,1,3};
        int[] heights2 = {5,1,2,3,4};
        int[] heights3 = {1,2,3,4,5};

        System.out.println("h1: " + Arrays.toString(heights1) + "; Risultato: " + solve(heights1));
        System.out.println("h2: " + Arrays.toString(heights2) + "; Risultato: " + solve(heights2));
        System.out.println("h3: " + Arrays.toString(heights3) + "; Risultato: " + solve(heights3));
    }

    public static int solve(int[] heights){
        // todo
        return 0;
    }

}

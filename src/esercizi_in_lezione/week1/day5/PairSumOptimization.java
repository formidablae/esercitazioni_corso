package esercizi_in_lezione.week1.day5;

import java.util.*;

public class PairSumOptimization {
    public static void main(String[] args) {
        int size = 100000;
        int target = 100000;
        int[] arr = new Random().ints(size, 1, 1000000).toArray();

        long start, end;

        // O(n^2) approach
        start = System.currentTimeMillis();
        findPairBruteForce(arr, target);
        end = System.currentTimeMillis();
        System.out.println("Brute Force Time: " + (end - start) + "ms");

        // O(n) approach
        start = System.currentTimeMillis();
        findPairOptimized(arr, target);
        end = System.currentTimeMillis();
        System.out.println("HashMap Time: " + (end - start) + "ms");
    }

    // O(n^2) approach
    public static boolean findPairBruteForce(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    // O(n) approach using HashMap
    public static boolean findPairOptimized(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

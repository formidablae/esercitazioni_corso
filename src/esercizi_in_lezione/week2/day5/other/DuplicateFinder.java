package esercizi_in_lezione.week2.day5.other;

import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        int size = 100000;
        int[] arr = new Random().ints(size, 1, 1000000).toArray();

        long start, end;

        // Brute Force (O(n^2))
        start = System.currentTimeMillis();
        findDuplicatesBruteForce(arr);
        end = System.currentTimeMillis();
        System.out.println("Brute Force Time: " + (end - start) + "ms");

        // HashSet (O(n))
        start = System.currentTimeMillis();
        findDuplicatesHashSet(arr);
        end = System.currentTimeMillis();
        System.out.println("HashSet Time: " + (end - start) + "ms");
    }

    // O(n^2) approach
    public static void findDuplicatesBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
        }
    }

    // O(n) approach using HashSet
    public static void findDuplicatesHashSet(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                break;
            }
        }
    }
}

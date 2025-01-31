package esercizi_in_lezione.week1.day5.other;

import java.util.Arrays;
import java.util.Random;

public class SortingOptimization {
    public static void main(String[] args) {
        int size = 100000;
        int[] arr1 = new Random().ints(size, 1, 1000000).toArray();
        int[] arr2 = Arrays.copyOf(arr1, arr1.length);

        long start, end;

        // Bubble Sort (O(n^2))
        start = System.currentTimeMillis();
        bubbleSort(arr1);
        end = System.currentTimeMillis();
        System.out.println("Bubble Sort Time: " + (end - start) + "ms");

        // Merge Sort (O(n log n))
        start = System.currentTimeMillis();
        mergeSort(arr2, 0, arr2.length - 1);
        end = System.currentTimeMillis();
        System.out.println("Merge Sort Time: " + (end - start) + "ms");
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1, n2 = right - mid;
        int[] L = Arrays.copyOfRange(arr, left, mid + 1);
        int[] R = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        }
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}

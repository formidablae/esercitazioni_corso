package esercizi_in_lezione.week9.day3.ricorsione_con_divide_and_conquer;


// arr = [1, 3, 5, 6, 9, 14, 18, 25, 33, 34, 60, 67]
// sottoArr1 = [1, 3, 5, 6, 9, 14]
// sottoArr2 = [6, 9, 14]
// sottoArr3 = [6]
// 6
public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 9, 14, 18, 25, 33, 34, 60, 67};
        int target = 6;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Elemento " + target + " trovato all'indice " + result);
        } else {
            System.out.println("Elemento " + target + " non trovato nell'array.");
        }

        target = 15;
        result = binarySearch(arr, target, 0, arr.length - 1);
        if (result != -1) {
            System.out.println("Elemento " + target + " trovato all'indice " + result);
        } else {
            System.out.println("Elemento " + target + " non trovato nell'array.");
        }
    }
}

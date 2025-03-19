package esercizi_in_lezione.week9.day3.ricorsione_lineare;


// arr = [2, 5, 8, 3, 6, 4]
public class ArraySum {
    public static int sumArray(int[] arr, int index) {
        if (index == 0) {
            return arr[0];  // caso base
        }

        return arr[index] + sumArray(arr, index - 1);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 3, 6, 4};
        System.out.println("Somma degli elementi: " + sumArray(arr, arr.length - 1));
    }
}

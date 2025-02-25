package esercizi_in_lezione.week6.day2;

import java.util.ArrayList;

public class SecondLargest {
    public static int findSecondLargest(ArrayList<Integer> arr) {
        arr.sort(Integer::compareTo);  // O(n * log(n))
        return arr.get(arr.size() - 2);
    }

    public static int findSecondLargest2(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {  // O(n)
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(1);
        numbers.add(0);

        System.out.println("Secondo numero più grande: " + findSecondLargest(numbers));
        System.out.println("Secondo numero più grande: " + findSecondLargest2(numbers));
    }
}

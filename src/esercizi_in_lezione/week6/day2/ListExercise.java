package esercizi_in_lezione.week6.day2;

import java.util.*;

public class ListExercise {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

        for (int i = 2; i <= 10; i++) {
            numbers.add(i);
        }

        System.out.println("Numeri in List prima del set: " + numbers);

        numbers.set(3, 200);
        System.out.println("Numeri in List dopo il set  : " + numbers);

        numbers.remove(3);
        numbers.set(2, 7);
        numbers.set(4, 1);
        numbers.set(7, 3);
        System.out.println("Numeri in List dopo il set  : " + numbers);

        boolean numbersHasDuplicates = hasDuplicates(numbers);
        boolean numbersHasDuplicates2 = hasDuplicates2(numbers);
        System.out.println("La lista ha duplicati? " + numbersHasDuplicates);
        System.out.println("La lista ha duplicati2? " + numbersHasDuplicates2);

        Collections.reverse(numbers);
        System.out.println("Numeri in List dopo il reverse: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Numeri in List dopo il shuffle: " + numbers);

        // passaggio da array a ArrayList
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("array: " + Arrays.toString(array));
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("arrayList: " + arrayList);

        int[] arrayTrad = arrayList.stream().mapToInt(i -> i).toArray();
        System.out.println("arrayTrad: " + Arrays.toString(arrayTrad));

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Banana");
        list1.add("Orange");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Apple");

        HashSet<String> set1 = new HashSet<>(list1);
        set1.retainAll(list2);
        System.out.println("Common elements with hashset: " + set1);

        ArrayList<String> commonElements = new ArrayList<>();
        // O(n^2)
        for (String element : list1) {  // O(n)
            if (list2.contains(element)) {  // O(n)
                commonElements.add(element);
            }
        }
        System.out.println("Common elements: " + commonElements);

        HashSet<String> set2 = new HashSet<>(list2);
        ArrayList<String> commonElements2 = new ArrayList<>();
        // O(n)
        for (String element : list1) {  // O(n)
            if (set2.contains(element)) {  // O(1)
                commonElements2.add(element);
            }
        }
        System.out.println("Common elements2: " + commonElements2);
    }

    public static boolean hasDuplicates(List<Integer> numbers) {
        HashSet<Integer> supportDataStructure = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (!supportDataStructure.add(numbers.get(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDuplicates2(List<Integer> numbers) {
        HashSet<Integer> supportDataStructure = new HashSet<>(numbers);
        return supportDataStructure.size() < numbers.size();
    }
}

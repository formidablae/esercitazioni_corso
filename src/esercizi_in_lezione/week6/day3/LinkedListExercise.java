package esercizi_in_lezione.week6.day3;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExercise {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> numbersLL = new LinkedList<Integer>();
        for (int i = 0; i < 500000; i++) {
            // add element in the beginning of the list
            numbersLL.addFirst(1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken to add 500000 elements in the beginning of the LinkedList: " + (endTime - startTime) + "ms");

        long startTime2 = System.currentTimeMillis();
        ArrayList<Integer> numbersAL = new ArrayList<Integer>();
        for (int i = 0; i < 500000; i++) {
            // add element in the beginning of the list
            // numbersAL.add(0, 1);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time taken to add 500000 elements in the beginning of the ArrayList: " + (endTime2 - startTime2) + "ms");

        LinkedList<String> names = new LinkedList<String>();
        names.add("John");
        names.add("Mary");
        System.out.println("LinkedList: " + names);
        names.addFirst("Alice");
        System.out.println("LinkedList: " + names);
        names.addLast("Bob");
        System.out.println("LinkedList: " + names);
        names.removeFirst();
        System.out.println("LinkedList: " + names);
        names.removeLast();
        System.out.println("LinkedList: " + names);
        names.remove(0);
        System.out.println("LinkedList: " + names);
    }
}

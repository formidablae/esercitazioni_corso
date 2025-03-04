package esercizi_compito.week7.colloquio2.pp;

/*
Given an array of strings strs, group the anagrams together.
You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
Input: String strs = {"eat","tea","tan","ate","nat","bat"}
Output: {{"bat"},{"nat","tan"},{"ate","eat","tea"}}

Example 2:
Input: String strs = {""}
Output: {{""}}

Example 3:
Input: strs = {"a"}
Output: {{"a"}}
*/

import java.util.Arrays;

public class StringGroups {
    public static void main(String[] args) {
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        String[] strs2 = {""};
        String[] strs3 = {"a"};

        String[][] risultato1 = solve(strs1);
        String[][] risultato2 = solve(strs1);
        String[][] risultato3 = solve(strs1);

        System.out.println("strs1: " + Arrays.toString(strs1) + "; Risultato 1: " + toStringNestedArray(risultato1));
        System.out.println("strs2: " + Arrays.toString(strs2) + "; Risultato 2: " + toStringNestedArray(risultato2));
        System.out.println("strs3: " + Arrays.toString(strs3) + "; Risultato 3: " + toStringNestedArray(risultato3));
    }

    public static String toStringNestedArray(String[][] nestedArray) {
        StringBuilder result = new StringBuilder("[");
        for (String[] innerArray : nestedArray) {
            result.append(Arrays.toString(innerArray)).append(", ");
        }
        if (result.length() > 1) {
            result.setLength(result.length() - 2);
        }
        result.append("]");
        return result.toString();
    }

    public static String[][] solve(String[] strs) {
        // TODO: code the solution here
        String[][] risultato = {{""}};
        return risultato;
    }
}

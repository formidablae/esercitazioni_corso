package esercizi_in_lezione.week7.day2;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExe {
    // dato questo numero: 13442534
    // restituire:
    // {
    //    "1": 1,
    //    "2": 1,
    //    "3": 2,
    //    "4": 3,
    //    "5": 1
    // }
    public static void main(String[] args) {
        int num1 = 13442534;
        int num2 = 24532534;
        int num3 = 78973534;
        int num4 = 13353456;
        int num5 = 0;
        int num6 = 1;
        int num7 = -5466;
        int num8 = 989;
        int num9 = 77;

        HashMap<String, Integer> map1 = countMultipleDigits(num1);
        HashMap<String, Integer> map2 = countMultipleDigits(num2);
        HashMap<String, Integer> map3 = countMultipleDigits(num3);
        HashMap<String, Integer> map4 = countMultipleDigits(num4);
        HashMap<String, Integer> map5 = countMultipleDigits(num5);
        HashMap<String, Integer> map6 = countMultipleDigits(num6);
        HashMap<String, Integer> map7 = countMultipleDigits(num7);
        HashMap<String, Integer> map8 = countMultipleDigits(num8);
        HashMap<String, Integer> map9 = countMultipleDigits(num9);

        System.out.println("num1: " + num1 + ", risultato: " + map1);
        System.out.println("num2: " + num2 + ", risultato: " + map2);
        System.out.println("num3: " + num3 + ", risultato: " + map3);
        System.out.println("num4: " + num4 + ", risultato: " + map4);
        System.out.println("num5: " + num5 + ", risultato: " + map5);
        System.out.println("num6: " + num6 + ", risultato: " + map6);
        System.out.println("num7: " + num7 + ", risultato: " + map7);
        System.out.println("num8: " + num8 + ", risultato: " + map8);
        System.out.println("num9: " + num9 + ", risultato: " + map9);


        HashMap<String, Integer> map21 = countMultipleDigits2(num1);
        HashMap<String, Integer> map22 = countMultipleDigits2(num2);
        HashMap<String, Integer> map23 = countMultipleDigits2(num3);
        HashMap<String, Integer> map24 = countMultipleDigits2(num4);
        HashMap<String, Integer> map25 = countMultipleDigits2(num5);
        HashMap<String, Integer> map26 = countMultipleDigits2(num6);
        HashMap<String, Integer> map27 = countMultipleDigits2(num7);
        HashMap<String, Integer> map28 = countMultipleDigits2(num8);
        HashMap<String, Integer> map29 = countMultipleDigits2(num9);

        System.out.println("num1: " + num1 + ", risultato2: " + map21);
        System.out.println("num2: " + num2 + ", risultato2: " + map22);
        System.out.println("num3: " + num3 + ", risultato2: " + map23);
        System.out.println("num4: " + num4 + ", risultato2: " + map24);
        System.out.println("num5: " + num5 + ", risultato2: " + map25);
        System.out.println("num6: " + num6 + ", risultato2: " + map26);
        System.out.println("num7: " + num7 + ", risultato2: " + map27);
        System.out.println("num8: " + num8 + ", risultato2: " + map28);
        System.out.println("num9: " + num9 + ", risultato2: " + map29);
    }

    public static HashMap<String, Integer> countMultipleDigits(int num) {
        String numStr = String.valueOf(num);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < numStr.length(); i++) {
            String chiave = String.valueOf(numStr.charAt(i));
            /*
            if (numStr.charAt(i) == '-') {
                System.out.println("Il numero è negativo");
                continue;
            }

            if (!map.containsKey(chiave)) {
                map.put(chiave, 1);
                continue;
            }

            map.put(chiave, map.get(chiave) + 1);
            */

            if (numStr.charAt(i) != '-') {
                if (!map.containsKey(chiave)) {
                    map.put(chiave, 1);
                } else {
                    map.put(chiave, map.get(chiave) + 1);
                }
            }
        }
        return map;
    }

    public static HashMap<String, Integer> countMultipleDigits2(int num) {
        // divisione per 10
        HashMap<String, Integer> map = new HashMap<>();
        num = Math.abs(num);
        while (true) {
            if (map.containsKey(String.valueOf(num % 10))) {
                map.put(String.valueOf(num % 10), map.get(String.valueOf(num % 10)) + 1);
            } else {
                map.put(String.valueOf(num % 10), 1);
            }
            num = num / 10;
            if (num == 0) {  // per non escludere 0
                break;
            }
        }

        return map;
    }
}

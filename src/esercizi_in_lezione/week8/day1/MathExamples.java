package esercizi_in_lezione.week8.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class MathExamples {
    public static void main(String[] args) {
        double num = -25.8;
        System.out.println("Absolute value: " + Math.abs(num));
        System.out.println("Rounded value: " + Math.round(num));
        System.out.println("Ceiling value: " + Math.ceil(num));
        System.out.println("Floor value: " + Math.floor(num));
        System.out.println("Square root: " + Math.sqrt(25));
        System.out.println("Power: " + Math.pow(2, 3));
        System.out.println("Random number: " + Math.random());
        System.out.println("Max value: " + Math.max(10, 20));
        System.out.println("Min value: " + Math.min(10, 20));
        System.out.println("PI value: " + Math.PI);
        System.out.println("E value: " + Math.E);
        System.out.println("Log value: " + Math.log(10));
        System.out.println("Log10 value: " + Math.log10(10));
        System.out.println("Log1p value: " + Math.log1p(10));
        System.out.println("Exp value: " + Math.exp(10));
        System.out.println("Sin value: " + Math.sin(30));
        System.out.println("Cos value: " + Math.cos(90));

        int min = 5;
        int max = 20;
        int randomNumber = generateRandomNumber(min, max);
        System.out.println("Random number between " + min + " and " + max + ": " + randomNumber);

        // riempire un arraylist di 100 elementi con numeri random tra 1 e 100
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(generateRandomNumber(1, 100));
        }
        System.out.println(numbers);
        int[] numbersTrad = new int[100];
        for (int i = 0; i < numbersTrad.length; i++) {
            numbersTrad[i] = generateRandomNumber(1, 100);
        }

        System.out.println("UUID: " + generateUUID());
        ArrayList<String> uuids = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            uuids.add(generateUUID());
        }
        System.out.println(uuids);

        // trovare max di numbers
        int numMax =  numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            numMax = Math.max(numMax, numbers.get(i));
            /*
            if (numbers.get(i) > numMax) {
                numMax = numbers.get(i);
            }
            */
        }
        System.out.println("Max value numbers con c. for: " + numMax);
        Integer maxNumber = numbers.stream().max(Integer::compare).get();
        System.out.println("Max value numbers con stream: " + maxNumber);

        // ottenere massimo di un arraylist
        int minNumbersTrad = Arrays.stream(numbersTrad).min().getAsInt();
        System.out.println("Min value minNumbersTrad: " + minNumbersTrad);
        System.out.println("Max value minNumbersTrad: " + Arrays.stream(numbersTrad).max().getAsInt());
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // genera stringhe UUID (Universally Unique Identifier) in formato xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx
    // usando la libreria Math.random()
    public static String generateUUID() {
        String uuid = "";
        // use random to get random characters
        for (int i = 0; i < 36; i++) {
            if (i == 8 || i == 13 || i == 18 || i == 23) {
                uuid += "-";
            } else {
                int random = (int) (Math.random() * 36);
                if (random < 10) {
                    uuid += random;
                } else {
                    uuid += (char) (random + 87);
                }
            }
        }
        return uuid;
    }
}

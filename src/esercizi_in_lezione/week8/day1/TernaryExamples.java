package esercizi_in_lezione.week8.day1;

public class TernaryExamples {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        /*
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        */
        System.out.println("Max value: " + max);

        int num3 = 30;
        int num4 = 40;
        int min = (num3 < num4) ? num3 : num4;
        System.out.println("Min value: " + min);

        int num5 = 50;
        int num6 = 60;
        int result = (num5 > num6) ? num5 : (num5 < num6) ? num6 : 0;
        /*
        int result;
        if (num5 > num6) {
            result = num5;
        } else if (num5 < num6) {
            result = num6;
        } else {
            result = 0;
        }
        */
        System.out.println("Result: " + result);

        String str1 = result > 0 ? "Positive" : "Negative";
        /*
        String str1;
        if (result > 0) {
            str1 = "Positive";
        } else {
            str1 = "Negative";
        }
        */
        System.out.println(str1);

        String str2 = str1.equals("Positive") ? "Great" : "Not so great";
        /*
        String str2;
        if (str1.equals("Positive")) {
            str2 = "Great";
        } else {
            str2 = "Not so great";
        }
        */
        System.out.println(str2);

        boolean isPari = result % 2 == 0 ? true : false;
        /*
        boolean isPari;
        if (result % 2 == 0) {
            isPari = true;
        } else {
            isPari = false;
        }
        */
        System.out.println(isPari);
    }
}

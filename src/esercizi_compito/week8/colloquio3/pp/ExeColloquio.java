package esercizi_compito.week8.colloquio3.pp;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

class ClasseSingleton {
    private static volatile ClasseSingleton instance;
    private ClasseSingleton() {}
    public static ClasseSingleton getInstance() {
        if (instance == null) {
            instance = new ClasseSingleton();
        }
        return instance;
    }
}

// Interfaccia
interface Formatter {
    String format(String input);
}

// Classe che implementa l'interfaccia
class UpperCaseFormatter implements Formatter {
    public String format(String input) {
        return input.toUpperCase();
    }
}

// Classe con metodo statico
class Utility {
    public static String getFormattedDate() {
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.of("+02:00"));
        return now.toString();
    }
}

// Classe con ternary operator corretto
class TernaryExample {
    public static String checkValue(int value) {
        return value > 10 ? "Greater" : value == 10 ? "Equal" : "Lesser";
    }
}

// Test
public class ExeColloquio {
    public static void main(String[] args) {
        ClasseSingleton singleton1 = ClasseSingleton.getInstance();
        ClasseSingleton singleton2 = ClasseSingleton.getInstance();
        System.out.println(singleton1 == singleton2 ? "Same instance" : "Different instances");

        Formatter formatter = new UpperCaseFormatter();
        System.out.println(formatter.format("test"));

        System.out.println(Utility.getFormattedDate());

        System.out.println(TernaryExample.checkValue(10));
    }
}

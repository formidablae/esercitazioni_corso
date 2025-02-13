package esercizi_in_lezione.week4.day4;

public class ScopeExample {
    // variabile di istanza (appartiene all'instanza dell'oggetto)
    private int instanceVariable = 10;

    // varibile statica (appartiene alla classe)
    private static int staticVariable = 20;

    // il costruttore vuoto
    // public ScopeExample() {}

    // metodo che modifica la variabile di istanza
    public void modifyInstanceVariable(int newValue) {
        System.out.println("Ho modificato la variabile di istanza da " + instanceVariable + " a " + newValue);
        instanceVariable = newValue;
    }

    // metodo che modifica la variabile statica
    public static void modifyStaticVariable(int newValue) {
        System.out.println("Ho modificato la variabile statica da " + staticVariable + " a " + newValue);
        staticVariable = newValue;
    }

    // metodo che stampa il valore della variabili
    public void printVariables() {
        System.out.println("Valore della variabile di istanza: " + instanceVariable);
        System.out.println("Valore della variabile statica: " + staticVariable);
    }

    // variabile locale con stesso nome del campo di istanza
    public void printLocalVariable() {
        int instanceVariable = 5;
        System.out.println("\nValore della variabile locale: " + instanceVariable);
        System.out.println("Valore della variabile di istanza: " + this.instanceVariable);
    }

    public static void main(String[] args) {
        ScopeExample oggetto1 = new ScopeExample();
        ScopeExample oggetto2 = new ScopeExample();

        System.out.println("oggetto1 prima:");
        oggetto1.printVariables();
        System.out.println("\noggetto2 prima:");
        oggetto2.printVariables();

        oggetto1.modifyInstanceVariable(15);

        System.out.println("\noggetto1 dopo la modifica delle variabili di istanza:");
        oggetto1.printVariables();
        oggetto2.modifyInstanceVariable(25);
        System.out.println("\noggetto2 dopo la modifica delle variabili di istanza:");
        oggetto2.printVariables();

        ScopeExample.modifyStaticVariable(30);
        System.out.println("\noggetto1 dopo la modifica della variabile statica:");
        oggetto1.printVariables();
        System.out.println("\noggetto2 dopo la modifica della variabile statica:");
        oggetto2.printVariables();

        System.out.println();
        oggetto1.printLocalVariable();
        System.out.println();

        ScopeExample oggetto3 = new ScopeExample();
        oggetto3.printVariables();
    }
}

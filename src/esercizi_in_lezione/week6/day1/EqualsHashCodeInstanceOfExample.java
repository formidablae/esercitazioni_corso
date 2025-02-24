package esercizi_in_lezione.week6.day1;

import java.util.Objects;

public class EqualsHashCodeInstanceOfExample {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mario", "Rossi", "RSSMRA01A01H501A");
        Persona p2 = new Persona("Luigi", "Verdi", "VRDGLU01A01H501A");
        Persona p3 = new Persona("Maria", "Rossi", "RSSMRA01A01H501A");
        Persona p4 = new Persona("Luigi", "Verdi", "VRDGLU01A01H501A");

        boolean p1eUgualeP1 = p1.equals(p1);
        boolean p1eUgualeP2 = p1.equals(p2);
        boolean p1eUgualeP3 = p1.equals(p3);
        boolean p2eUgualeP3 = p2.equals(p3);
        boolean p2eUgualeP4 = p2.equals(p4);

        System.out.println("p1 e' uguale a p1? " + p1eUgualeP1);
        System.out.println("p1 e' uguale a p2? " + p1eUgualeP2);
        System.out.println("p1 e' uguale a p3? " + p1eUgualeP3);
        System.out.println("p2 e' uguale a p3? " + p2eUgualeP3);
        System.out.println("p2 e' uguale a p4? " + p2eUgualeP4);

        System.out.println("p1 hashcode: " + p1.hashCode());
        System.out.println("p2 hashcode: " + p2.hashCode());
        System.out.println("p3 hashcode: " + p3.hashCode());
        System.out.println("p4 hashcode: " + p4.hashCode());

        Persona p5 = new Studente("Mario", "Rossi", "RSSMRA01A01H501A", "123456");
        Studente s1 = new Studente("Mario", "Rossi", "RSSMRA01A01H501A", "123456");
        Object o1 = new Studente("Mario", "Rossi", "RSSMRA01A01H501A", "123456");

        if(p1 instanceof Persona) {
            System.out.println("p1 e' istanza di Persona");
        }
        if (p1 instanceof Studente) {
            System.out.println("p1 e' istanza di Studente");
        }

        if(p5 instanceof Persona) {
            System.out.println("p5 e' istanza di Persona");
        }
        if (p5 instanceof Studente) {
            System.out.println("p5 e' istanza di Studente");
        }

        if(s1 instanceof Persona) {
            System.out.println("s1 e' istanza di Persona");
        }
        if (s1 instanceof Studente) {
            System.out.println("s1 e' istanza di Studente");
        }

        if(o1 instanceof Persona) {
            System.out.println("o1 e' istanza di Persona");
        }
        if (o1 instanceof Studente) {
            System.out.println("o1 e' istanza di Studente");
        }
    }
}

class Persona {
    private String nome;
    private String cognome;
    private String codiceFiscale;

    public Persona(String nome, String cognome, String codiceFiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codiceFiscale = codiceFiscale;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        boolean nomeUguale = this.nome.equals(((Persona) obj).nome);
        boolean cognomeUguale = this.cognome.equals(((Persona) obj).cognome);
        boolean codiceFiscaleUguale = this.codiceFiscale.equals(((Persona) obj).codiceFiscale);
        return nomeUguale && cognomeUguale && codiceFiscaleUguale;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, codiceFiscale);
    }
}

class Studente extends Persona {
    private String matricola;

    public Studente(String nome, String cognome, String codiceFiscale, String matricola) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
    }
}
package esercizi_compito.week3.dc.gestione_studenti;

/*
Obiettivo:
    Creare una classe Studente che rappresenti uno studente con proprietà e metodi. Il programma gestirà un array di studenti, permettendo di analizzarne le informazioni.

    Istruzioni:
    1. Creare una classe Studente con le seguenti proprietà:

    - nome (String)
    - cognome (String)
    - eta (int)
    - voto (double)

    2. Aggiungere:

    - Un costruttore che accetta tutti i parametri.
    - Getter per ogni proprietà.
    - Un metodo toString() per restituire una descrizione dello studente.

    3. Nel main:

    - Creare un array di 5 studenti con dati casuali.
    - Stampare tutti gli studenti.
    - Trovare e stampare:
    - Lo studente con il voto più alto.
    - La media dei voti.
    - Gli studenti maggiorenni.

    Esempio di output:

    Elenco studenti:
    1. Nome: Luca Rossi, Età: 19, Voto: 8.5
    2. Nome: Giulia Bianchi, Età: 17, Voto: 7.2
    3. Nome: Marco Verdi, Età: 20, Voto: 9.1
    4. Nome: Sara Neri, Età: 18, Voto: 6.8
    5. Nome: Davide Conti, Età: 16, Voto: 7.9

    Studente con voto più alto: Marco Verdi (9.1)
    Media voti: 7.9
    Studenti maggiorenni:
    - Luca Rossi (19 anni)
    - Marco Verdi (20 anni)
    - Sara Neri (18 anni)
 */

class Studente {
    // Implementare qui la soluzione
    String nome;
    String cognome;
    int eta;
    double voto;

    public Studente (String nome, String cognome, int eta, double voto) {

        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }

    public double getVoto() {
        return voto;
    }
    public String toString() {
        return "Nome: " + nome + ", cognome: " + cognome + ", eta: " +eta + ", voto: " + voto;
    }

}



public class GestioneStudenti {
    public static void main(String[] args) {
        // Implementare qui la soluzione
        Studente s1 = new Studente ("Luca", "Rossi", 19, 8.5);
        Studente s2 = new Studente ("Giulia", "Bianchi", 17, 7.5);
        Studente s3 = new Studente ("Marco", "Verdi", 24, 9.0);
        Studente s4 = new Studente ("Silvio", "Blu", 32, 7);
        Studente s5 = new Studente ("Marta", "Arancione", 16, 9.5);

        Studente [] elencoStudenti = {s1, s2, s3, s4, s5};
        double sommaVoti = 0;


        Studente migliorStudente = elencoStudenti[0];
        System.out.println("Elenco studenti:");
        for (int i = 0; i < elencoStudenti.length; i++) {
            System.out.println(elencoStudenti[i]);
            if (elencoStudenti[i].getVoto() > migliorStudente.getVoto()) {
                migliorStudente = elencoStudenti[i];
            }
            sommaVoti += elencoStudenti[i].getVoto();
        }

        System.out.println("Lo studente migliore è: " + migliorStudente);
        System.out.println("La media dei voti è " + sommaVoti/ elencoStudenti.length);

        for (int i = 0; i < elencoStudenti.length; i++) {
            if (elencoStudenti[i].getEta() >= 18) {
                System.out.println("Lo studente " +elencoStudenti[i].getNome() + " è maggiorenne");

            }
        }

    }
}
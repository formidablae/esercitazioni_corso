package esercizi_compito.week3.gg;

/*
Obiettivo:
Creare una classe Libro che rappresenti un libro con proprietà e metodi. Il programma gestirà un array di libri e permetterà di analizzarne le informazioni.

Istruzioni:
1. Creare una classe Libro con le seguenti proprietà:
- titolo (String)
- autore (String)
- annoPubblicazione (int)
- prezzo (double)

2. Aggiungere:
- Un costruttore che accetta tutti i parametri.
- Getter e setter per ogni proprietà.
- Un metodo toString() per restituire una descrizione del libro.

3. Nel main:
- Creare un array di 5 libri con dati casuali.
- Stampare tutti i libri.
- Trovare e stampare:
    - Il libro più costoso.
    - Il prezzo medio dei libri.
    - I libri pubblicati dopo il 2015.

Esempio di output:
Elenco libri:
1. Titolo: Il Signore degli Anelli, Autore: J.R.R. Tolkien, Anno: 1954, Prezzo: 25.99€
2. Titolo: 1984, Autore: George Orwell, Anno: 1949, Prezzo: 15.50€
3. Titolo: Il Codice da Vinci, Autore: Dan Brown, Anno: 2003, Prezzo: 19.99€
4. Titolo: Sapiens, Autore: Yuval Noah Harari, Anno: 2015, Prezzo: 22.00€
5. Titolo: La ragazza del treno, Autore: Paula Hawkins, Anno: 2018, Prezzo: 18.90€

Libro più costoso: Il Signore degli Anelli (25.99€)
Prezzo medio: 20.08€
Libri pubblicati dopo il 2015:
- Sapiens (2015)
- La ragazza del treno (2018)

 */

class Libro {
    // Implementare la soluzione qui
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private double prezzo;

    public Libro(String titolo, String autore, int annoPubblicazione, double prezzo) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.prezzo = prezzo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", prezzo=" + prezzo + "€" +
                '}';
    }
}

public class GestioneLibri {
    public static void main(String[] args) {
        // Implementare la soluzione qui

        Libro libro1 = new Libro("Il Signore degli Anelli", "J.R.R. Tolkien", 1954, 25.99);
        Libro libro2 = new Libro("1984", "George Orwell", 1949, 15.50);
        Libro libro3 = new Libro("Il Codice da Vinci", "Dan Brown", 2003, 19.99);
        Libro libro4 = new Libro("Sapiens", "Yuval Noah Harari", 2015, 22.00);
        Libro libro5 = new Libro( "La ragazza del treno", "Paula Hawkins", 2018, 18.90);

        Libro[] libri = {libro1, libro2, libro3, libro4, libro5};

        Libro piuCostoso = libri[0];
        double somma = 0;
        for(int i = 0; i < libri.length; i++){
            System.out.println(libri[i]);
            if(libri[i].getPrezzo() > piuCostoso.getPrezzo()){
                piuCostoso = libri[i];
            }
            somma += libri[i].getPrezzo();
        }
        System.out.println("\nPrezzo medio dei libri: "+ somma / libri.length);

        System.out.println("\nLibro piu costoso: "+ piuCostoso);

        System.out.println("\nI libri usciti dopo il 2015 sono:");
        for(int i = 0; i < libri.length; i++){
            if(libri[i].getAnnoPubblicazione() > 2015){
                System.out.println(libri[i]);
            }
        }

    }
}

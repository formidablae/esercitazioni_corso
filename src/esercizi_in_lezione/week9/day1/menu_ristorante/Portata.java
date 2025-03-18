package esercizi_in_lezione.week9.day1.menu_ristorante;

import java.util.HashSet;

public class Portata {
    private String nome;
    private double prezzo;
    private String categoria;
    private HashSet<String> ingredienti;

    // serve a Jackson per deserializzare
    public Portata() {}

    public Portata(String nome, double prezzo, String categoria, HashSet<String> ingredienti) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.categoria = categoria;
        this.ingredienti = ingredienti;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getCategoria() {
        return categoria;
    }

    public HashSet<String> getIngredienti() {
        return ingredienti;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setIngredienti(HashSet<String> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public void aggiungiIngrediente(String ingrediente) {
        ingredienti.add(ingrediente);
    }

    public void rimuoviIngrediente(String ingrediente) {
        ingredienti.remove(ingrediente);
    }

    @Override
    public String toString() {
        return "Portata:" +
                "\n      nome='" + nome + '\'' +
                ",\n      prezzo=" + prezzo +
                ",\n      categoria='" + categoria + '\'' +
                ",\n      ingredienti=" + ingredienti;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Portata portata = (Portata) obj;
        return nome.equals(portata.nome) && categoria.equals(portata.categoria) && ingredienti.equals(portata.ingredienti) && Double.compare(portata.prezzo, prezzo) == 0;
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + categoria.hashCode() + ingredienti.hashCode() + Double.hashCode(prezzo);
    }
}

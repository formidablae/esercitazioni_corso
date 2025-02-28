package esercizi_in_lezione.week6.day5;

import java.util.Objects;

class Cliente {
    private final String nome;
    private final String cognome;
    private final String email;

    public Cliente(String nome, String cognome, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
    }

    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return "Cliente{" +
            "nome='" + nome + '\'' +
            ", cognome='" + cognome + '\'' +
            ", email='" + email + '\'' +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome) &&
            cognome.equals(cliente.cognome) &&
            email.equals(cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cognome, email);
    }
}

record ClienteRecord(String nome, String cognome, String email) {
    /*
    public void setNome(String nome) {
        nome = nome; // Non si può fare
        this.nome = nome; // Non si può fare
    }
    */
}

// cliente usa la pagina web -> UI -> richiesta creazione cliente API -> API -> creiamo (in memoria) un Record Cliente -> salviamo/insert il record in DB -> DB
// cliente usa la pagina web -> UI -> richiesta lettura cliente API -> API -> mandiamo una richiesta DB di avere questo record -> DB
// client vede i suoi dati <- UI <- risposta con i dati da API <- API <- da db abbiamo preso il record (che comunque istanzia in memoria un Record Cliente) <- DB
// il cliente si rende conto che c'è un errore nei dati
// vuole modificare i suoi dati
// cliente usa la pagina web -> UI -> richiesta modifica dati cliente API -> API -> creiamo (in memoria) un Record Cliente con i dati modificati -> update/upsert il record in DB -> DB
package esercizi_in_lezione.week6.day5;

record Indirizzo(String via, String citta, String cap) {}

record ClienteR(String nome, Indirizzo indirizzo) {}

public class TestAnnidati {
    public static void main(String[] args) {
        Indirizzo indirizzo = new Indirizzo("Via Roma", "Milano", "20100");
        ClienteR cliente = new ClienteR("Mario", indirizzo);

        System.out.println("Nome: " + cliente.nome());
        System.out.println("Indirizzo: " + cliente.indirizzo());
        System.out.println("Città: " + cliente.indirizzo().citta());
    }
}

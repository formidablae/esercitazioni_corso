package esercizi_in_lezione.week6.day5;

public class TestRecord {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Mario", "Rossi", "mario.rossi@example.com");
        Cliente c2 = new Cliente("Mario", "Rossi", "mario.rossi@example.com");
        System.out.println(c1);
        System.out.println("cliente1 uguale a cliente2?" + c1.equals(c2));

        ClienteRecord cr1 = new ClienteRecord("Mario", "Rossi", "mario.rossi@example.com");
        ClienteRecord cr2 = new ClienteRecord("Mario", "Rossi", "mario.rossi@example.com");

        System.out.println(cr1);
        System.out.println("clienteRecord1 uguale a clienteRecord2?" + cr1.equals(cr2));

        System.out.println("cliente1 uguale a clienteRecord1: " + c1.equals(cr1));

        // System.out.println("clienteRecord1 nome: " + cr1.nome);
        System.out.println("clienteRecord1 nome: " + cr1.nome());
        // System.out.println("clienteRecord1 nome: " + cr1.getNome());
        // System.out.println("clienteRecord1 nome: " + cr1.setNome("Giovanni"));
    }
}

package esercizi_in_lezione.week3.day1;

public class Dipendente {
    String nome;
    double stipendioBase;

    public Dipendente(String nomeParam, double stipendioBaseParam) {
        this.nome = nomeParam;
        this.stipendioBase = stipendioBaseParam;
    }

    public double getStipendio() {
        return stipendioBase;
    }

    public void print() {
        System.out.println("Dip: " + nome + ", Stipendio: " + getStipendio());
    }
}

class Manager extends Dipendente {
    double bonus;

    public Manager(String nomeParam, double stipendioBaseParam, double bonusParam) {
        super(nomeParam, stipendioBaseParam);
        this.bonus = bonusParam;
    }

    @Override
    public double getStipendio() {
        return stipendioBase + bonus;
    }

    public static void main(String[] args) {
        Dipendente dip = new Dipendente("Mario Rossi", 2000);
        Manager man = new Manager("Luigi Bianchi", 3000, 1000);

        dip.print();
        man.print();
    }
}

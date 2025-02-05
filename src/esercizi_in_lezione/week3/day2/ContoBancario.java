package esercizi_in_lezione.week3.day2;

import java.util.Scanner;

public class ContoBancario {
    int numeroConto;
    String intestatario;
    double saldo;

    public ContoBancario(int numeroConto, String intestatario, double saldo) {
        this.numeroConto = numeroConto;
        this.intestatario = intestatario;
        this.saldo = saldo;
    }

    public void deposita(double importo) {
        saldo += importo;
        System.out.println("Deposito di €" + importo + " effettuato.");
    }

    public void preleva(double importo) {
        if (importo <= saldo) {
            saldo -= importo;
            System.out.println("Prelievo di " + importo + " effettuato.");
        } else {
            System.out.println("Saldo insufficiente per prelevare " + importo);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public void setIntestatario(String ilNuovoIntestatario) {
        this.intestatario = ilNuovoIntestatario;
    }

    public String toString() {
        return "Conto #" + numeroConto + " intestato a " + intestatario + " ha saldo " + saldo;
    }

    public static void main(String[] args) {
        Scanner lettore = new Scanner(System.in);
        ContoBancario conto = new ContoBancario(12345, "Mario Rossi", 500.0);
        System.out.println(conto);

        System.out.print("Importo da depositare: ");
        double importo = lettore.nextDouble();
        conto.deposita(importo);
        System.out.println(conto);

        double ilNuovoSaldo = conto.getSaldo();
        System.out.println("Saldo aggiornato: €" + ilNuovoSaldo);

        conto.preleva(60.0);
        System.out.println(conto);
        conto.preleva(600.0);
        System.out.println(conto);

        conto.setIntestatario("Luca Brambilla");
        System.out.println(conto);

        // conto.intestatario = "Luca X";
        // System.out.println(conto);
    }
}

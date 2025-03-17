package esercizi_in_lezione.week9.menu_ristorante;

import java.util.HashSet;

public class Runner {
    public static void main(String[] args) {
        MenuRistorante menu = new MenuRistorante("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");
        System.out.println(menu);

        Portata nuovaP = new Portata("Pasta al pomodoro", 10.0, "Primi", new HashSet<>());
        nuovaP.aggiungiIngrediente("pomodoro");

        menu.aggiungiPortata(nuovaP);
        System.out.println(menu);
        menu.salvaMenuSuFile("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");

        Portata nuovaP2 = new Portata("Pasta alla carbonara", 12.0, "Primi", new HashSet<>());
        nuovaP2.aggiungiIngrediente("uova");
        menu.aggiungiPortata(nuovaP2);
        System.out.println(menu);
        menu.salvaMenuSuFile("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");

        // menu.rimuoviPortataPerNome("Pasta al pomodoro");
        // menu.salvaMenuSuFile("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");
    }
}

package esercizi_in_lezione.week9.day1.menu_ristorante;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        MenuRistorante menu = new MenuRistorante("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Aggiungi Portata");
            System.out.println("2. Rimuovi Portata");
            System.out.println("3. Aggiungi ingredienti a portata");
            System.out.println("4. Modifica portata");
            System.out.println("5. Salva menu su file");
            System.out.println("6. Stampa l'intero menu");
            // TODO: inserire voce menu Ordina
            // nuova classe Ordine
            //   - hashmap chiave stringa num portata, valore un altro hashmap con
            //        chiave counter, che sarebbe quanti piatti di quel tipo sono stati ordinati in quell'ordine
            //        chiave piatto: la portata
            //   - numero coperti
            //   - prezzo
            //   - data
            //   - sconto
            // TODO: inserire voce menu Visualizza portate ordinate
            // TODO: inserire voce menu Visualizza tutti gli ordini
            // TODO: inserire voce menu Trova ordine con una certa portata
            // TODO: inserire voce menu Trova ordini con prezzo più grande di un certo importo
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 0:
                    // TODO: vuoi salvare i dati prima di uscire?
                    System.out.print("Vuoi salvare i dati prima di uscire? (s/n): ? ");
                    String risposta = scanner.nextLine();
                    if (risposta.equalsIgnoreCase("s")) {
                        menu.salvaMenuSuFile("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");
                    } else if (risposta.equalsIgnoreCase("n")) {
                        System.out.println("Arrivederci!");
                        return;
                    } else {
                        System.out.println("Scelta non valida.");
                    }
                    break;
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Prezzo: ");
                    double prezzo = Double.parseDouble(scanner.nextLine());
                    System.out.print("Categoria: ");
                    String categoria = scanner.nextLine();
                    System.out.print("Ingredienti (separati da , ): ");
                    String[] ingredientiArray = scanner.nextLine().split(",");
                    HashSet<String> ingredienti = new HashSet<>(Arrays.asList(ingredientiArray));
                    menu.aggiungiPortata(new Portata(nome, prezzo, categoria, ingredienti));
                    break;
                case 2:
                    System.out.print("Nome portata da rimuovere: ");
                    String nomePortataDaRimuovere = scanner.nextLine();
                    menu.rimuoviPortataPerNome(nomePortataDaRimuovere);
                    break;
                case 3:
                    System.out.print("Selezionare portata per nome: ");
                    String nomePortataACuiAggiungereIngredienti = scanner.nextLine();
                    Portata portataACuiAggiungereIngredienti = menu.getPortataPerNome(nomePortataACuiAggiungereIngredienti);
                    if (portataACuiAggiungereIngredienti != null) {
                        System.out.println("Ingredienti della portata prima: " + portataACuiAggiungereIngredienti.getIngredienti());
                        System.out.print("Nuovi ingredienti da aggiungere (separati da , ): ");
                        String[] ingredientiArrayDaAggiungere = scanner.nextLine().split(",");
                        HashSet<String> ingredientiModDaAggiungere = new HashSet<>(Arrays.asList(ingredientiArrayDaAggiungere));
                        portataACuiAggiungereIngredienti.getIngredienti().addAll(ingredientiModDaAggiungere);
                        // for (String ingredienteDaAggiungere : ingredientiModDaAggiungere) {
                        //     portataACuiAggiungereIngredienti.aggiungiIngrediente(ingredienteDaAggiungere);
                        // }
                        System.out.println("Ingredienti della portata dopo: " + portataACuiAggiungereIngredienti.getIngredienti());
                    } else {
                        System.out.println("Portata non trovata.");
                    }
                    break;
                case 4:
                    System.out.print("Selezionare portata per nome: ");
                    String nomePortataDaSelezionare = scanner.nextLine();
                    Portata portataDaModificare = menu.getPortataPerNome(nomePortataDaSelezionare);
                    if (portataDaModificare != null) {
                        System.out.println("Dati portata prima: " + portataDaModificare);
                        System.out.println("Indicare i nuovi dati della portata (lasciare vuoto per mantenere invariato)");
                        System.out.print("Nome (" + portataDaModificare.getNome() + "): ");
                        String nomeMod = scanner.nextLine();
                        if (nomeMod.isEmpty()) {
                            nomeMod = portataDaModificare.getNome();
                        }
                        System.out.print("Prezzo (" + portataDaModificare.getPrezzo() + "): ");
                        String prezzoModStr = scanner.nextLine();
                        double prezzoMod;
                        if (prezzoModStr.isEmpty()) {
                            prezzoMod = portataDaModificare.getPrezzo();
                        } else {
                            prezzoMod = Double.parseDouble(prezzoModStr);
                        }
                        System.out.print("Categoria (" + portataDaModificare.getCategoria() + "): ");
                        String categoriaMod = scanner.nextLine();
                        if (categoriaMod.isEmpty()) {
                            categoriaMod = portataDaModificare.getCategoria();
                        }
                        System.out.print("Ingredienti (" + portataDaModificare.getIngredienti() + ", aggiungi nuovi separati da , ): ");
                        String[] ingredientiArrayMod = scanner.nextLine().split(",");
                        HashSet<String> ingredientiMod = new HashSet<>(Arrays.asList(ingredientiArrayMod));
                        for (String ingrediente : ingredientiMod) {
                            if (ingrediente.isEmpty()) {
                                ingredientiMod.remove(ingrediente);
                            }
                        }

                        for (String ingrediente : portataDaModificare.getIngredienti()) {
                            ingredientiMod.add(ingrediente);
                        }
                        portataDaModificare.setNome(nomeMod);
                        portataDaModificare.setPrezzo(prezzoMod);
                        portataDaModificare.setCategoria(categoriaMod);
                        portataDaModificare.setIngredienti(ingredientiMod);
                        System.out.println("Dati portata dopo: " + portataDaModificare);
                    } else {
                        System.out.println("Portata non trovata.");
                    }
                    break;
                case 5:
                    System.out.println("Salvataggio menu su file");
                    menu.salvaMenuSuFile("src/esercizi_in_lezione/week9/menu_ristorante/menu.json");
                    break;
                case 6:
                    System.out.println(menu);
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}

package esercizi_in_lezione.week6.day5.file_export_import;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Universita uni = new Universita("Polimi");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Aggiungi Studente");
            System.out.println("2. Aggiungi Docente");
            System.out.println("3. Aggiungi Corso");
            System.out.println("4. Assegna corso a docente");
            System.out.println("5. Iscrivi studente a corso");
            System.out.println("6. Mostra Informazioni Università");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 0:
                    System.out.println("Arrivederci!");
                    return;
                case 1:
                    System.out.print("ID: ");
                    String idS = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeS = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognomeS = scanner.nextLine();
                    uni.aggiungiPersona(new Studente(idS, nomeS, cognomeS));
                    uni.salvaDati();
                    break;
                case 2:
                    System.out.print("ID: ");
                    String idD = scanner.nextLine();
                    System.out.print("Nome: ");
                    String nomeD = scanner.nextLine();
                    System.out.print("Cognome: ");
                    String cognomeD = scanner.nextLine();
                    uni.aggiungiPersona(new Docente(idD, nomeD, cognomeD));
                    uni.salvaDati();
                    break;
                case 3:
                    System.out.print("ID corso: ");
                    String idC = scanner.nextLine();
                    System.out.print("Nome corso: ");
                    String nomeC = scanner.nextLine();
                    uni.aggiungiCorso(new Corso(idC, nomeC));
                    uni.salvaDati();
                    break;
                case 4:
                    System.out.print("ID docente: ");
                    String idDocente = scanner.nextLine();
                    System.out.print("ID corso: ");
                    String idCorso = scanner.nextLine();
                    Docente docente = (Docente) uni.getPersona(idDocente);
                    docente.assegnaCorso(idCorso);
                    uni.salvaDati();
                    break;
                case 5:
                    System.out.print("ID studente: ");
                    String idStudente = scanner.nextLine();
                    System.out.print("ID corso: ");
                    String idCorsoS = scanner.nextLine();
                    Studente studente = (Studente) uni.getPersona(idStudente);
                    studente.iscriviCorso(idCorsoS);
                    uni.salvaDati();
                    break;
                case 6:
                    uni.mostraInformazioni();
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
    }
}


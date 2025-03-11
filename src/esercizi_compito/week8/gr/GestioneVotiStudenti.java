package esercizi_compito.week8.gr;

import java.util.*;

public class GestioneVotiStudenti {
    public static void main(String[] args) {
        // usare simulaVotoRandom() per generare voti casuali

        // 1. creare un array tradizionale con i nomi degli studenti
        String[] studenti = new String[]{"Mario", "Luigi", "Giovanni", "Anna", "Carla", "Marco", "Laura", "Giuseppe", "Elena", "Francesca"};
        System.out.println("studenti: " + Arrays.toString(studenti));

        // 2. creare un HashMap con chiavi stringhe e valori double
        // per associare studenti e loro voti medi
        HashMap <String, Double> voti = new HashMap<String, Double>();

        // 3. creare un ArrayList di tutti i voti dati
        // per ogni studente genera 5 voti e fai una media
        // 4. creare un HashSet di tutti i voti (univoci) dati
        // 5. inserire in un LinkedList i voti nell'ordine inverso

        HashSet<Integer> votiUnivoci = new HashSet<>();
        ArrayList<Integer>  elencoVoti = new ArrayList<>();
        LinkedList<Integer> elencoVotiInverso = new LinkedList<>();
        for (int i = 0; i < studenti.length; i++) {
            double media = 0;
            for (int j = 0; j < 5; j++) {
                int voto = simulaVotoRandom();
                votiUnivoci.add(voto);
                elencoVoti.add(voto);
                elencoVotiInverso.addFirst(voto);
                media += voto;
            }
            media /= 5;
            voti.put(studenti[i], media);
        }
        System.out.println("voti medi: " + voti);
        System.out.println("elenco voti: " + elencoVoti);
        System.out.println("voti univoci: " + votiUnivoci);
        System.out.println("elenco voti inverso: " + elencoVotiInverso);

    }

    public static int simulaVotoRandom() {
        return (int) (Math.random() * 10) + 1;
    }
}

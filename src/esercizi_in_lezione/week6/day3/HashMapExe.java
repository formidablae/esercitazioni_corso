package esercizi_in_lezione.week6.day3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapExe {
    public static void main(String[] args) {
        /*
        {
            "Italia": "Roma",
            "Francia": "Parigi",
            "Germania": "Berlino",
            "Spagna": "Madrid"
        }
        */
        HashMap<String, String> paeseCapitale = new HashMap<>();
        paeseCapitale.put("Italia", "Roma");
        paeseCapitale.put("Francia", "Parigi");
        paeseCapitale.put("Germania", "Berlino");
        paeseCapitale.put("Spagna", "Madrid");

        String capFr = paeseCapitale.get("Francia");
        System.out.println("La capitale della Francia è: " + capFr);

        HashMap<String, Integer> studentiVoti = new HashMap<>();
        /*
        {
            "Mario": 8,
            "Luigi": 6,
            "Piero": 9,
            "Francesco": 7,
            "Marco": 5
        }
        */
        studentiVoti.put("Mario", 8);
        studentiVoti.put("Luigi", 6);
        studentiVoti.put("Piero", 9);
        studentiVoti.put("Francesco", 7);
        studentiVoti.put("Marco", 5);

        int votoLuigi = studentiVoti.get("Luigi");
        System.out.println("Il voto di Luigi è: " + votoLuigi);

        HashMap<String, Person> persone = new HashMap<>();
        Person p1 = new Person("Mario", "Rossi");
        Person p2 = new Person("Luigi", "Verdi");
        Person p3 = new Person("Piero", "Bianchi");

        persone.put(p1.getNome(), p1);

        /*
        {
            "Classe1": Class(
                studenti: ArrayList(
                    Person("Mario", "Rossi"),
                    Person("Luigi", "Verdi"),
                    Person("Piero", "Bianchi")
                ),
                docenti: ArrayList(
                    Person("Francesco", "Neri"),
                    Person("Marco", "Gialli")
                ),
                voti: HashMap(
                    "Mario": 8,
                    "Luigi": 6,
                    "Piero": 9,
                    "Francesco": 7,
                    "Marco": 5
                )
            ),
            "Classe2": Class(
                studenti: ArrayList(
                    Person("Giovanni", "Verdi"),
                    Person("Giuseppe", "Bianchi"),
                    Person("Giacomo", "Rossi")
                ),
                docenti: ArrayList(
                    Person("Francesco", "Neri"),
                    Person("Marco", "Gialli")
                ),
                voti: HashMap(
                    "Giovanni": 8,
                    "Giuseppe": 6,
                    "Giacomo": 9,
                    "Francesco": 7,
                    "Marco": 5
                )
            "Classe3": Class(
                studenti: ArrayList(
                    Person("Giovanni", "Verdi"),
                    Person("Giuseppe", "Bianchi"),
                    Person("Giacomo", "Rossi")
                ),
                docenti: ArrayList(
                    Person("Francesco", "Neri"),
                    Person("Marco", "Gialli")
                ),
                voti: HashMap(
                    "Giovanni": 8,
                    "Giuseppe": 6,
                    "Giacomo": 9,
                    "Francesco": 7,
                    "Marco": 5
                )
            )
        }
         */

        HashMap<String, Class> classi = new HashMap<>();
        Class classe1 = new Class();
        Person stud1 = new Person("Mario", "Rossi");
        Person stud2 = new Person("Luigi", "Verdi");
        Person stud3 = new Person("Piero", "Bianchi");
        Person doc1 = new Person("Francesco", "Neri");
        Person doc2 = new Person("Marco", "Gialli");
        HashMap<String, Integer> voti1 = new HashMap<>();
        voti1.put("Mario", 8);
        voti1.put("Luigi", 6);
        voti1.put("Piero", 9);
        voti1.put("Francesco", 7);
        voti1.put("Marco", 5);
        classe1.studenti.add(stud1);
        classe1.studenti.add(stud2);
        classe1.studenti.add(stud3);
        classe1.docenti.add(doc1);
        classe1.docenti.add(doc2);
        classe1.voti = voti1;
        classi.put("Classe1", classe1);

        // System.out.println(classi);

        Person stud4 = new Person("Giovanni", "Verdi");
        Person stud5 = new Person("Giuseppe", "Bianchi");
        Person stud6 = new Person("Giacomo", "Rossi");
        Person doc3 = new Person("Francesco", "Neri");
        Person doc4 = new Person("Marco", "Gialli");
        HashMap<String, Integer> voti2 = new HashMap<>();
        voti2.put("Giovanni", 8);
        voti2.put("Giuseppe", 6);
        voti2.put("Giacomo", 9);
        voti2.put("Francesco", 7);
        voti2.put("Marco", 5);
        Class classe2 = new Class();
        classe2.studenti.add(stud4);
        classe2.studenti.add(stud5);
        classe2.studenti.add(stud6);
        classe2.docenti.add(doc3);
        classe2.docenti.add(doc4);
        classe2.voti = voti2;
        classi.put("Classe2", classe2);

        System.out.println(classi);
        System.out.println("\n\n");

        HashMap<String, HashMap<String, HashMap<String, Integer>>> scuola = new HashMap<>();
        HashMap<String, HashMap<String, Integer>> classe1Map = new HashMap<>();
        HashMap<String, Integer> voti1Map = new HashMap<>();
        voti1Map.put("Mario", 8);
        voti1Map.put("Luigi", 6);
        voti1Map.put("Piero", 9);
        voti1Map.put("Francesco", 7);

        classe1Map.put("studenti", voti1Map);
        scuola.put("Classe1", classe1Map);

        HashMap<String, Integer> medieDocenti = new HashMap<>();
        medieDocenti.put("Francesco", 7);
        medieDocenti.put("Marco", 5);
        classe1Map.put("docenti", medieDocenti);

        System.out.println(scuola);

        int mediMarco = medieDocenti.get("Marco");
        System.out.println("La media di Marco è: " + mediMarco);

        if (medieDocenti.containsKey("Francesco")) {
            System.out.println("Francesco è un docente della scuola");
        } else {
            System.out.println("Francesco non è un docente della scuola");
        }

        if (medieDocenti.containsKey("Giovanni")) {
            System.out.println("Giovanni è un docente della scuola");
        } else {
            System.out.println("Giovanni non è un docente della scuola");
        }

        // possiamo prendere un elenco delle chiavi di un hashmap
        System.out.println(medieDocenti.keySet());
        System.out.println(voti1Map.keySet());

        // possiamo prendere un elenco dei valori di un hashmap
        System.out.println(medieDocenti.values());
        System.out.println(voti1Map.values());

        // possiamo prendere un elenco delle coppie chiave-valore di un hashmap
        System.out.println("medieDocenti: " + medieDocenti);
        System.out.println("medieDocenti.entrySet(): " + medieDocenti.entrySet());
        System.out.println("voti1Map: " + voti1Map);
        System.out.println("voti1Map.entrySet(): " + voti1Map.entrySet());

        // che tipo è medieDocenti.entrySet()
        System.out.println(medieDocenti.getClass());
        System.out.println(medieDocenti.keySet().getClass());
        System.out.println(medieDocenti.values().getClass());
        System.out.println(medieDocenti.entrySet().getClass());

        for (Map.Entry<String, Integer> entry : voti1Map.entrySet()) {
            System.out.println("Studente: " + entry.getKey() + ", Voto: " + entry.getValue());
        }
    }
}

package esercizi_compito.week3.pp.gestione_veicoli;

/*
1. Scrivere 3 classi Veicolo, Auto e Moto
2. Auto e Moto estendono Veicolo
3. Veicolo non deve essere istanziabile
4. Veicolo ha i seguenti campi: String marca, String modello, int anno
5. Per ogni campo ci deve essere un metodo getter e setter
6. Veicolo ha un metodo toString che dovrà essere implementato nelle classi figlie
7. Auto ha i seguenti campi: int porte
8. Per ogni campo ci deve essere un metodo getter e setter
9. Moto ha i seguenti campi: boolean haCarena
10. Per ogni campo ci deve essere un metodo getter e setter
11. Creare un metodo main in GestioneVeicoli che istanzia un array di:
- Auto: "Toyota", "Corolla", 2022, 5
- Moto: "Yamaha", "R1", 2021, true
- Auto: "Fiat", "Panda", 2020, 3
- Moto: "Ducati", "Monster", 2023, false
- Auto: "Audi", "A4", 2022, 5
12. Chiamare alcuni dei metodi sulle istanze di Auto e Moto istanziate
 */

public class GestioneVeicoli {
    public static void main(String[] args) {
        Veicolo[] veicoli = {
                new Auto("Toyota", "Corolla", 2022, 5),
                new Moto("Yamaha", "R1", 2021, true),
                new Auto("Fiat", "Panda", 2020, 3),
                new Moto("Ducati", "Monster", 2023, false),
                new Auto("Audi", "A4", 2022, 5)
        };

        int lunghezzaArray = veicoli.length;
        for (int i = 0; i < lunghezzaArray; i++) {
            System.out.println(veicoli[i]);
        }

        System.out.println(((Auto) veicoli[0]).getPorte());

        ((Moto) veicoli[1]).setHaCarena(false);
    }
}

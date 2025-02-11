package esercizi_in_lezione.week4.day2.gestione_veicoli;

public class GestioneVeicoli {
    public static void main(String[] args) {
        Auto laMiaAuto = new Auto("Ford", "Focus", 2022, 5);
        laMiaAuto.stampaDettagli();
        String ilModelloDellAuto = laMiaAuto.getModello();
        System.out.println("Il modello dell'auto: " + ilModelloDellAuto);
        laMiaAuto.sterza(false);

        Veicolo unaMiaAuto = new Auto("Ford", "Focus", 2022, 5);
        unaMiaAuto.stampaDettagli();

        Bici laMiaBici = new Bici("BMX", "", 2021);
        laMiaBici.stampaDettagli();
        laMiaBici.accelera();
        laMiaBici.frena();
    }
}

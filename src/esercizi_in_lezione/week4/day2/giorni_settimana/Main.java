package esercizi_in_lezione.week4.day2.giorni_settimana;

public class Main {
    public static void main(String[] args) {
        GiornoSettimanale oggiConClasse = new GiornoSettimanale(2);
        System.out.println(oggiConClasse.getGiorno());
        EnumGiorno oggiConEnum = EnumGiorno.MARTEDI;
        System.out.println(oggiConEnum);

        switch (oggiConEnum) {
            case LUNEDI:
                System.out.println("Inizio settimana!");
                break;
            case VENERDI:
                System.out.println("Quasi weekend!");
                break;
            case DOMENICA:
                System.out.println("Giorno di riposo.");
                break;
            default:
                System.out.println("Giornata normale.");
        }
    }
}

package esercizi_in_lezione.week4.day2.giorni_settimana;

public class GiornoSettimanale {
    private int numGiorno;

    public GiornoSettimanale(int numGiorno) {
        this.numGiorno = numGiorno;
    }

    public String getGiorno() {
        switch (numGiorno) {
            case 1:
                return "Lunedì";
            case 2:
                return "Martedì";
            case 3:
                return "Mercoledì";
            case 4:
                return "Giovedì";
            case 5:
                return "Venerdì";
            case 6:
                return "Sabato";
            case 7:
                return "Domenica";
            default:
                return "Giorno non valido";
        }
    }
}

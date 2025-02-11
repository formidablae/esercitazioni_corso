package esercizi_in_lezione.week4.day2.livelli;

public enum Livello {
    BASSO(1),

    MEDIO(2),
    ALTO(3);

    private int valore;

    Livello(int valore) {
        this.valore = valore;
    }

    public int getValore() {
        return valore;
    }

    public static void main(String[] args) {
        Livello livello = Livello.BASSO;
        System.out.println("Livello selezionato: " + livello.getValore());
    }
}

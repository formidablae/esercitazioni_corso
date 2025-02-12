package esercizi_compito.week4.pp;

class Auto extends Motorizzato{
    public Auto(String marca, String modello, int cilindrata) {
        super(marca, modello, cilindrata);
    }

    @Override
    public void avviaMotore() {
        System.out.println("Motore avviato");
    }
}

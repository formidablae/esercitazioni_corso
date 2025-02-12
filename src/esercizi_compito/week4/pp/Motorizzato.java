package esercizi_compito.week4.pp;

abstract class Motorizzato extends Veicolo{
    protected int cilindrata;

    public Motorizzato(String marca, String modello, int cilindrata) {
        super(marca, modello);
        this.cilindrata = cilindrata;
    }

    public abstract void avviaMotore();
}

package esercizi_compito.week4.pp;

class Tesla extends Motorizzato implements IAutonomo, IElettrico{
    public Tesla(String modello) {
        super("Tesla", modello, 0);
    }

    @Override
    public void guidaAutonoma() {
        System.out.println("Macchina con guida autonoma");
    };

    @Override
    public void ricarica() {
        System.out.println("In ricarica");
    };

    @Override
    public void avviaMotore() {
        System.out.println("Tesla accesa");
    }
}

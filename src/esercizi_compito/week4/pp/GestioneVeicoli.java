package esercizi_compito.week4.pp;

/*
 1. definire una classe Veicolo
 2. definire una classe Motorizzato non istanziabile, che estende Veicolo
 3. definire un'intefaccia IElettrico con un metodo `void ricarica()`
 4. definire un'intefaccia IAutonomo con un metodo `void guidaAutonoma()`
 5. definire una classe Auto che estende Motorizzato
 6. definire una classe Tesla che estende Motorizzato e implementa IElettrico e IAutonomo
 7. creare in main un array con nome variabile garage di 3 Veicoli
   garage[0] = new Auto("Ford", "Mustang", 5000);
   garage[1] = new Tesla("Model S");
   garage[2] = new Auto("BMW", "M3", 3000);
 per ciascun veicolo, chiamare qualche metodo
 */


public class GestioneVeicoli {
    public static void main(String[] args) {
        Veicolo[] garage = {
            new Auto("Ford", "Mustang", 5000),
            new Tesla("Model S"),
            new Auto("BMW", "M3", 3000)
        };

        for (int i = 0; i < garage.length; i++) {
            if (garage[i] instanceof Motorizzato) {
                ((Motorizzato) garage[i]).avviaMotore();
            }
            if (garage[i] instanceof IElettrico) {
                ((IElettrico) garage[i]).ricarica();
            }
            if (garage[i] instanceof IAutonomo) {
                ((IAutonomo) garage[i]).guidaAutonoma();
            }

            System.out.println();
        }
    }
}

package esercizi_in_lezione.week8.day5;

public class Ripasso1BuilderPattern {
    public static void main(String[] args) {
        Camion camion1 = new Camion.CamionBuilder("Mercedes", "Actros", 2020).build();
        camion1.stampaCamion();
    }
}

class Camion {
    private String marca;
    private String modello;
    private int anno;

    private Camion(CamionBuilder builder) {
        this.marca = builder.marca;
        this.modello = builder.modello;
        this.anno = builder.anno;
    }

    public void stampaCamion() {
        System.out.println("Marca: " + marca + " Modello: " + modello + " Anno: " + anno);
    }

    public static class CamionBuilder {
        private String marca;
        private String modello;
        private int anno;

        public CamionBuilder(String marca, String modello, int anno) {
            this.marca = marca;
            this.modello = modello;
            this.anno = anno;
        }

        public Camion build() {
            return new Camion(this);
        }
    }
}

// design pattern utili da sapere:
// - singleton
// - factory
// - visitor
// - observer
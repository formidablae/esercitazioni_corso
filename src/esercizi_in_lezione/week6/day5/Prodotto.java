package esercizi_in_lezione.week6.day5;

record Prodotto(String nome, double prezzo) {
    public Prodotto {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Prezzo non può essere negativo");
        }
    }
}

interface IScontabile {
    double calcolaSconto(double percentuale);
}

record ProdottoScontato(String nome, double prezzo) implements IScontabile {
    @Override
    public double calcolaSconto(double percentuale) {
        return prezzo * (1 - percentuale / 100);
    }
}
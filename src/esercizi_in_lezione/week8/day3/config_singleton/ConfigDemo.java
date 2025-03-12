package esercizi_in_lezione.week8.day3.config_singleton;

import java.util.HashSet;

public class ConfigDemo {
    public static void main(String[] args) {
        Config config1 = Config.getInstance();
        Config config2 = Config.getInstance();
        Config config3 = Config.getInstance();

        System.out.println(config1);
        System.out.println("Sono in ambiente: " + config1.getAmbiente());
        System.out.println(config2);
        System.out.println(config3);
        // verifica che config1 sia la stessa istanza di config2 e config3
        System.out.println("config1 e config2 sono la stessa istanza? " + (config1 == config2));
        System.out.println("config1 e config3 sono la stessa istanza? " + (config1 == config3));
        System.out.println("config2 e config3 sono la stessa istanza? " + (config2 == config3));

        HashSet<Config> lista = new HashSet<>();
        HashSet<ConfigV> listaV = new HashSet<>();
        for (int i = 0; i < 100000; i++) {
            lista.add(Config.getInstance());
            ConfigV configV = new ConfigV();
            listaV.add(configV);
        }

        System.out.println("Numero di elementi nella lista: " + lista.size());
        System.out.println("Numero di elementi nella listaV: " + listaV.size());
    }
}

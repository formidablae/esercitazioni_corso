package esercizi_in_lezione.week8.day3.config_singleton;

public class ConfigV {
    private static Config instance;
    public String ambiente;
    public String region;
    public String dbConnectionUrl;

    public ConfigV() {
        ambiente = "dev";
        region = "eu-central-1";
        dbConnectionUrl = "postgres://localhost:5432/mydb";
    }

    public String getAmbiente() {
        return ambiente;
    }
}

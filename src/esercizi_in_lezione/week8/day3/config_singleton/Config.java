package esercizi_in_lezione.week8.day3.config_singleton;

public class Config {
    private static Config instance;
    public String ambiente;
    public String region;
    public String dbConnectionUrl;

    private Config() {
        ambiente = "dev";
        region = "eu-central-1";
        dbConnectionUrl = "postgres://localhost:5432/mydb";
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public String getRegion() {
        return region;
    }

    public String getDbConnectionUrl() {
        return dbConnectionUrl;
    }

    @Override
    public String toString() {
        return "Config{" +
                "ambiente='" + ambiente + '\'' +
                ", region='" + region + '\'' +
                ", dbConnectionUrl='" + dbConnectionUrl + '\'' +
                '}';
    }
}

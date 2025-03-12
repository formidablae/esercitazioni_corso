package esercizi_in_lezione.week8.day3.database_connection_singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String url;
    private String username;
    private String password;
    private String databaseName;
    private boolean isConnected;

    private DatabaseConnection(String url, String username, String password, String databaseName) {
        this.url = url;
        this.username = username;
        this.password = password;
        this.databaseName = databaseName;
        this.isConnected = false;
    }

    public static DatabaseConnection getInstance(String url, String username, String password, String databaseName) {
        if (instance == null) {
            instance = new DatabaseConnection(url, username, password, databaseName);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "DatabaseConnection{" +
                "url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", databaseName='" + databaseName + '\'' +
                ", isConnected=" + isConnected +
                '}';
    }
}

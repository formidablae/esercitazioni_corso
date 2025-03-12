package esercizi_in_lezione.week8.day3.database_connection_singleton;

public class DatabaseConnectionExample {
    public static void main(String[] args) {
        DatabaseConnection dc1 = DatabaseConnection.getInstance("url", "un1", "p", "d");
        DatabaseConnection dc2 = DatabaseConnection.getInstance("url", "un2", "p", "d");
        DatabaseConnection dc3 = DatabaseConnection.getInstance("url", "un3", "p", "d");
        DatabaseConnection dc4 = DatabaseConnection.getInstance("url", "un4", "p", "d");
        DatabaseConnection dc5 = DatabaseConnection.getInstance("url", "un5", "p", "d");

        System.out.println(dc1);
        System.out.println(dc2);
        System.out.println(dc3);
        System.out.println(dc4);
        System.out.println(dc5);
        // verifica che config1 sia la stessa istanza di config2 e config3
        System.out.println("dc1 e dc2 sono la stessa istanza? " + (dc1 == dc2));
        System.out.println("dc1 e dc3 sono la stessa istanza? " + (dc1 == dc3));
        System.out.println("dc2 e dc3 sono la stessa istanza? " + (dc2 == dc3));

        for (int i = 0; i < 100000; i++) {
            DatabaseConnection dc = DatabaseConnection.getInstance("url", "un1", "p", "d");
            System.out.println(dc);
        }
    }
}

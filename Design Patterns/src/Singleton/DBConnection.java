package Singleton;
// Singleton Class : Only one object to be created and re-used whenever required.
public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if(instance == null) {
            synchronized (DBConnection.class) {
                if(instance == null) instance = new DBConnection();
            }
        }
        return instance;
    }
}

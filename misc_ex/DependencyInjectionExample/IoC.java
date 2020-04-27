/**
 * Based on https://www.youtube.com/watch?time_continue=445&v=EPv9-cHEmQw&feature=emb_logo
 * 
 * Run: use VS Code and just run main class from there :)
 */

public class IoC {
    public static void main(String args[]) {
        IoC container = new IoC();
        User user = container.new User(container.new OracleDatabase());
        user.add("This is some data.");
    }

    public interface Database {
        void persist(String data);
    }

    /**
     * Businees layer logic
     */
    public class User {
        Database database;

        public User(Database database) {
            this.database = database;
        }

        public void add(String data) {
            database.persist(data);
        }
    }

    /**
     * Database access layer
     */
    public class MySqlDatabase implements Database {
        public void persist(String data) {
            System.out.println("MySQL has persisted: " + data);
        }
    }

    public class OracleDatabase implements Database {
        public void persist(String data) {
            System.out.println("Oracle has persisted: " + data);
        }
    }
}
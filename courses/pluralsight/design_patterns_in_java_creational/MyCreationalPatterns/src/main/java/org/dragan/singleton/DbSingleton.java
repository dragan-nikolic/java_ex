package org.dragan.singleton;

public class DbSingleton {
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        // prevent reflection
        if (instance != null) {
            throw new RuntimeException("Create DbSingleton using getInstance method!");
        }
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}

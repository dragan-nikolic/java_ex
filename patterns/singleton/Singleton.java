public class Singleton 
{
    private static Singleton instance = null;

    // Private constructor prevents instantiation
    private Singleton() {}

    
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance  = new Singleton();
                }
            }
        }

        return instance;
    }

    public int x;
}
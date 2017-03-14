public class SingletonDemo 
{
    public static void main(String args[]) {
        Singleton s1 = Singleton.getInstance();
        s1.x = 5;

        Singleton s2 = Singleton.getInstance();
        System.out.println("x=" + s2.x);
    }
}
import java.util.Random;

/*
java Random example
*/
public class RandomDemo {
    public static void randomClassDemo() {
        Random rand = new Random();

        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
        System.out.println(rand.nextInt(2));
    }

    public static void main(String args[]) {
        randomClassDemo();
    }
}

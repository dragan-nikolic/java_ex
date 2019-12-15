import java.util.Scanner;

public class IdeaGradleHello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter: ");
        String input = in.nextLine();
        System.out.println("Hello, you entered: " + input);
        in.close();
    }
}

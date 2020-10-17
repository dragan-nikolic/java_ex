package dragan;

import java.util.Scanner;

public class IdeaHello {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name: ");
        String input = in.nextLine();
        System.out.println("Hello, you entered: " + input);
        in.close();
    }
}

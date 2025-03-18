import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        Set<String> names = new HashSet<>();

        // Add elements to the set
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Alice"); // Duplicate, won't be added
        System.out.println("Set after adding elements: " + names);

        // Check if an element exists
        if (names.contains("Bob")) {
            System.out.println("The set contains Bob.");
        }

        // Remove an element from the set
        names.remove("Charlie");
        System.out.println("Set after removing Charlie: " + names);

        // Iterate over the set
        System.out.println("Iterating over the set:");
        for (String name : names) {
            System.out.println(name);
        }

        // Check if the set is empty
        if (names.isEmpty()) {
            System.out.println("The set is empty.");
        } else {
            System.out.println("The set is not empty.");
        }
    }
}

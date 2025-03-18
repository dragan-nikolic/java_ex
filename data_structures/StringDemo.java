public class StringDemo {
    public static void main(String[] args) {
        // Creating strings
        String s1 = "Hello, Java!";
        String s2 = new String("Hello, Java!");

        // Comparing strings using '==' (checks reference) and equals() (checks content)
        System.out.println("s1 == s2: " + (s1 == s2));         // false, different objects
        System.out.println("s1.equals(s2): " + s1.equals(s2));     // true, same content

        // Finding the length of a string
        System.out.println("Length of s1: " + s1.length());

        // Accessing a character at a specific index
        System.out.println("Character at index 7: " + s1.charAt(7));

        // Extracting a substring
        System.out.println("Substring from index 7: " + s1.substring(7));

        // Finding the index of a substring
        System.out.println("Index of 'Java': " + s1.indexOf("Java"));

        // Concatenating strings
        String s3 = s1 + " It's a string demo.";
        System.out.println("Concatenated string: " + s3);

        // Changing the case of the string
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());

        // Splitting the string into an array of substrings
        String[] parts = s1.split(" ");
        System.out.println("Splitting s1 by spaces:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}


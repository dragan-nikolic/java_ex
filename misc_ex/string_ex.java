/*
java string example

Here is excellent tutorial: https://www.tutorialspoint.com/java/java_strings.htm

The String class has 11 constructors that allow you to provide the initial value 
of the string using different sources, such as an array of characters.
*/
public class StringDemo {
    public static void ConstructFromArray() {
        char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
        String helloString = new String(helloArray);  
        System.out.println( helloString );
    }

    public static void StringLengthEx() {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println( "String Length is : " + len );
    }
    public static void main(String args[]) {
        ConstructFromArray();
        StringLengthEx();
    }
}
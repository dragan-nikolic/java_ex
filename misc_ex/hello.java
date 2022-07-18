/*
This is Hello World java app :)

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file> 

Note: do not run with class extension 'java <file>.class'
*/

// name of the class must be same as name of the file
public class hello {
    public static void main(String[] args) {
        System.out.println("Hello World by Dragan!");

        double d = 75.0;
        Integer x = new Integer((int)(d/10.0));

        String s = String.valueOf((int)(d/10.0));
        System.out.println(s);

    }
}
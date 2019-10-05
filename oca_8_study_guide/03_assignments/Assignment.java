/*
Demo data types conversions

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file> 

Note: do not run 'java <file>.class'
*/
class Assignment {
    public static void main(String args[]) {
        char c1 = 'a';
        byte b1 = 100;

        int i1;
        // i1 = 67L;  // compiler error
        i1 = (int)67L;

        int i2;
        // i2 = 1_000_000L;  // compiler error
        i2 = (int)1_000_000_000_001L;
        
        System.out.println("char c1=" + c1 + "\nbyte b1=" + b1 + "\nint i1=" + i1 + "\nint i2=" +i2);

        // b1 = i1 + i2;  // compiler error
        b1 = (byte)(i1 + i2); // works :)

        System.out.println("char c1=" + c1 + ", byte b1=" + b1 + ", int i1=" + i1 + ", int i2=" +i2);
    }
}

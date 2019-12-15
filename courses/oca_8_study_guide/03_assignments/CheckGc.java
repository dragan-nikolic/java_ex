/*
Demo Garbage Collection

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file> 

Note: do not run 'java <file>.class'

The following program lets us know how much total memory the JVM has
available to it and how much free memory it has. It then creates 10,000 Date objects. After this, it tells us
how much memory is left and then calls the garbage collector (which, if it decides to run, should halt the
program until all unused objects are removed). The final free memory result should indicate whether it
has run.
*/
import java.util.Date;

class CheckGc {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Total JVM memory: " + rt.totalMemory());
        System.out.println("Before memory: " + rt.freeMemory());

        Date d = null;
        for(int i = 0; i < 10_000; i++) {
            d = new Date();
            d = null;
        }

        System.out.println("After memory: " + rt.freeMemory());

        rt.gc();  // call garbage collector

        System.out.println("After GC memory: " + rt.freeMemory());
    }
}

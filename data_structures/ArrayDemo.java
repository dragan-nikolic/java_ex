/*
Array Demo
========
T[]

Methods:
- length

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

    private static void printArray(int[] arr, String title) {
        System.out.println(title);

        for (int e: arr) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        // direct initialization
        int[] arr1 = {1, -2, 3, -4, 5};
        System.out.println(arr1);
        
        printArray(arr1, "=== arr1 array ===");

        // init using new
        int[] arr2 = new int[5];

        Random rand = new Random();
        for (int i=0; i<arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }

        printArray(arr2, "=== arr2 array ===");
        Arrays.sort(arr2);
        printArray(arr2, "=== sorted arr2 array ===");
   }
}

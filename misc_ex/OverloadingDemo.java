/*
Function overloading examples

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/
import java.util.*;

/**
 * Q: Can overloading functions return dufferent types
 * A: Yes, but only if they have different input types too
 */
public class OverloadingDemo {

   public static List<String> foo(String x) {
      List<String> result = new ArrayList<String>();

      result.add(x);
      result.add("dragan");

      return result;
   }

   public static List<List<String>> foo(List<String> x) {
      List<List<String>> result = new ArrayList<List<String>>();

      List<String> nikolic = new ArrayList<String>();
      nikolic.add("Dragan");
      nikolic.add("Malena");

      result.add(x);
      result.add(nikolic);

      return result;
   }

   public static void main(String args[]) {
      List<String> result = new ArrayList<String>();
      
      result = foo("pera");
      System.out.println(result);

      List<List<String>> result2 = new ArrayList<List<String>>();

      List<String> pera = new ArrayList<String>();
      pera.add("Pera1");
      pera.add("Pera2");

      result2 = foo(pera);

      System.out.println(result2);
   }
}

/*
Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/

import java.util.*;
public class HashMapDemo {

   public static void main(String args[]) {
   
      // Create a hash map
      HashMap<String,Double> hm = new HashMap<String, Double>();
      
      // Put elements to the map
      hm.put("Zara", new Double(3434.34));
      hm.put("Mahnaz", new Double(123.22));
      hm.put("Ayan", new Double(1378.00));
      hm.put("Daisy", new Double(99.22));
      hm.put("Qadir", new Double(-19.08));
      
      // Get a set of the entries
      Set set = hm.entrySet();
      
      // Get an iterator
      Iterator i = set.iterator();
      
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();

      for (Map.Entry entry: hm.entrySet()) {
         System.out.print(entry.getKey() + "::: ");
         System.out.println(entry.getValue());
      }
      
      // Deposit 1000 into Zara's account
      double balance = ((Double)hm.get("Zara")).doubleValue();
      hm.put("Zara", new Double(balance + 1000));
      System.out.println("Zara's new balance: " + hm.get("Zara"));
   }
}
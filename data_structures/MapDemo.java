/*
Map Demo
========
Map<K, V>

methods:
- void put(K key, V value)
- V get(K key): returns null if map does not contain the key
- Set<K> keySet()
- V remove(K key)
- int size()
- boolean containsKey(K key)

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static java.util.Map.entry;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {

   // Map initialization
   // ==================

   private static Map<String, Integer> createUsingHashMap() {
      
      Map<String, Integer> map = new HashMap<>();
      map.put("Alice", 25);
      map.put("Bob", 30);
      map.put("Charlie", 35);

      System.out.println(map);

      return map;
   }

   // Maintains Insertion Order
   private static Map<String, Integer> createUsingLinkedHashMap() {
      
      Map<String, Integer> map = new LinkedHashMap<>();
      map.put("Delta", 32);
      map.put("Alice", 25);
      map.put("Bob", 30);
      map.put("Charlie", 35);

      System.out.println(map);

      return map;
   }

   // Sorted Order by Keys
   private static Map<String, Integer> createUsingTreeMap() {
      
      Map<String, Integer> map = new TreeMap<>();
      map.put("Delta", 32);
      map.put("Alice", 25);
      map.put("Bob", 30);
      map.put("Charlie", 35);

      System.out.println(map);

      return map;
   }

   // Introduced in Java 9, Map.of() provides a way to create an immutable map,
   // meaning you cannot add or remove elements after initialization.
   private static Map<String, Integer> createUsingMapOf() {
      Map<String, Integer> map = Map.of(
         "Alice", 25,
         "Bob", 30,
         "Charlie", 35
      );

      System.out.println(map);

      try {
         map.put("Delta", 32);
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add entry to immutable Map.of map!");
         System.out.println(e);
      }
   
      return map;
   }

   // also immutable
   private static Map<String, Integer> createUsingMapOfEntries() {
      Map<String, Integer> map = Map.ofEntries(
         entry("Alice", 25),
         entry("Bob", 30),
         entry("Charlie", 35)
      );

      try {
         map.put("Delta", 32);
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add entry to immutable Map.of map!");
         System.out.println(e);
      }

      System.out.println(map);
      
      return map;
   }

   private static void iterateUsingEntrySet(Map<String, Integer> map) {
      System.out.println("=== Iterate using for-each with entrySet ===");
      for (Map.Entry<String, Integer> entry : map.entrySet()) {
         System.out.println(entry.getKey() + " -> " + entry.getValue());
      }      
   }

   private static void iterateUsingKeySet(Map<String, Integer> map) {
      System.out.println("=== Iterate using for-each with keySet ===");
      for (String key : map.keySet()) {
         System.out.println(key + " -> " + map.get(key));
      }      
   }

   private static void getUnknownKey(Map<String, Integer> map) {
      System.out.println("=== Get unknown key ===");
      String key = "unknownKey";
      System.out.println(key + " -> " + map.get(key));
   }

   private static void removeKey(Map<String, Integer> map) {
      String key = "Alice";
      System.out.println("=== Remove key Alice ===");
      System.out.println("Before remove");
      System.out.println(map);
      Integer value = map.remove(key);
      System.out.println(String.format("After removing (%s, %d)", key, value));
      System.out.println(map);
   }

   public static void main(String args[]) {
      //Map<String, Integer> map = createUsingMapOf();
      //Map<String, Integer> map = createUsingMapOfEntries();
      //Map<String, Integer> map = createUsingHashMap();
      Map<String, Integer> map = createUsingLinkedHashMap();
      //Map<String, Integer> map = createUsingTreeMap();

      iterateUsingEntrySet(map);
      iterateUsingKeySet(map);
      getUnknownKey(map);
      removeKey(map);
   }
}

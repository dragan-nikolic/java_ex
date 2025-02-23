/*
List Demo
========
List<E>
-------
- boolean add(E e)
- void add(int index, E e)
- boolean contains(E e)
- boolean equals(E e)
- E get(int index)
- E set(int index, E e)
- E remove(int index)
- boolean remove(E e): removes first occurence of 'e'
- int size()
- ListIterator<E> listIterastor()

ListIterator<E>
---------------
- void add(E e)
- void set(E e)
- void remove()
- E next()
- E previous()
- boolean hasNext()
- boolean hasPrevious()

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

public class ListDemo {

   // List initialization
   // ===================

   // Introduced in Java 9, List.of() creates an immutable list,
   // meaning add(), remove(), and modifications are not allowed.
   private static List<String> createUsingListOf() {
      System.out.println("=== Create List using List.of ===");
      List<String> list = List.of(
         "Dewbarry",
         "Apple",
         "Banana",
         "Cherry"
      );
        
      System.out.println(String.format("Original list: %s", list.toString()));

      try {
         list.add("Melown");
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add element to immutable List.of list!");
         System.out.println(e);
      }
   
      try {
         list.set(1, "Melown");
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to change element of the immutable List.of list!");
         System.out.println(e);
      }
   
      System.out.println(String.format("Final list: %s", list.toString()));

      return list;
   }

   // Using Arrays.asList() (Fixed-Size List)
   // This list is fixed in size. You cannot add/remove elements, but you can 
   // modify existing elements.
   private static List<String> createUsingArraysAsList() {
      System.out.println("=== Create List using Arrays.asList ===");
      List<String> list = Arrays.asList(
         "Dewbarry",
         "Apple",
         "Banana",
         "Cherry"
      );
        
      System.out.println(String.format("Original list: %s", list.toString()));

      try {
         list.add("Melown");
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add element to immutable List.of list!");
         System.out.println(e);
      }
   
      try {
         list.set(1, "Melown");
         System.out.println(
            String.format(
               "Element %s, changed to Melown.", 
               list.get(1)));
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to change element of the Array.asList list!");
         System.out.println(e);
      }
   
      System.out.println(String.format("Final list: %s", list.toString()));

      return list;
   }

   // Using new ArrayList<>(Arrays.asList()) (Modifiable List)
   // Creating a list with initial values while still allowing modifications.
   private static List<String> createUsingArrayList() {
      System.out.println("=== Create List using ArraysList ===");
      List<String> list = new ArrayList<>(
         Arrays.asList(
            "Dewbarry",
            "Apple",
            "Banana",
            "Cherry"
      ));
        
      System.out.println(String.format("Original list: %s", list.toString()));

      try {
         list.add("Melown");
         System.out.println("Added new element Melown.");
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add element to ArrayList list!");
         System.out.println(e);
      }
   
      try {
         int index = 1;
         String elementName = list.get(index);
         list.set(index, "Bluebarry");
         System.out.println(
            String.format(
               "Element %s changed to Bluebarry.", 
               elementName));
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to change element of the ArrayList list!");
         System.out.println(e);
      }
   
      System.out.println(String.format("Final list: %s", list.toString()));

      return list;
   }

   // Using LinkedList (When Frequent Insertions/Deletions Are Needed)
   // Best for: When frequent insertions/deletions occur at the beginning or 
   // middle of the list.
   private static List<String> createUsingLinkedList() {
      System.out.println("=== Create List using LinkedList ===");
      List<String> list = new LinkedList<>(
         Arrays.asList(
            "Dewbarry",
            "Apple",
            "Banana",
            "Cherry"
      ));
        
      System.out.println(String.format("Original list: %s", list.toString()));

      try {
         list.add("Melown");
         System.out.println("Added new element Melown.");
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to add element to ArrayList list!");
         System.out.println(e);
      }
   
      try {
         int index = 1;
         String elementName = list.get(index);
         list.set(index, "Bluebarry");
         System.out.println(
            String.format(
               "Element %s changed to Bluebarry.", 
               elementName));
      } catch (UnsupportedOperationException e) {
         System.out.println("Unable to change element of the ArrayList list!");
         System.out.println(e);
      }
   
      System.out.println(String.format("Final list: %s", list.toString()));

      return list;
   }

   public static void main(String args[]) {
      //List<String> list = createUsingListOf();
      //List<String> list = createUsingArraysAsList();
      //List<String> list = createUsingArrayList();
      List<String> list = createUsingLinkedList();
   }
}

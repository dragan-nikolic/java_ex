/*
stack examples

tutorial: https://www.tutorialspoint.com/java/java_stack_class.htm

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/
import java.util.*;
public class StackDemo {

   static void showpush(Stack<Integer> st, int a) {
      st.push(Integer.valueOf(a));
      System.out.println("push(" + a + ")");
      System.out.println("stack: " + st);
   }

   static void showpop(Stack<Integer> st) {
      System.out.print("pop -> ");
      Integer a = (Integer) st.pop();
      System.out.println(a);
      System.out.println("stack: " + st);
   }

   public static void main(String args[]) {
      Stack<Integer> st = new Stack<Integer>();
      System.out.println("stack: " + st);
      showpush(st, 42);
      showpush(st, 66);
      showpush(st, 99);
      showpop(st);
      showpop(st);
      showpop(st);
      try {
         showpop(st);
      }catch (EmptyStackException e) {
         System.out.println("empty stack");
      }

      if (st.isEmpty()) {
         System.out.println("Stack is empty!");
      }
   }
}
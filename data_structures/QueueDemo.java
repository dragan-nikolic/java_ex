/*
queue examples

Build:
$ javac <file>.java
This creates <file>.class

Run:
$ java <file>
Note: $ java <file>.class will produce error 
*/
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        System.out.println("Initial queue: " + queue);

        // Peek at the head of the queue without removing it
        String head = queue.peek();
        System.out.println("Head of the queue: " + head);

        // Remove the head element from the queue
        String removed = queue.poll();
        System.out.println("Removed element: " + removed);
        System.out.println("Queue after removal: " + queue);

        // Iterate over the remaining elements in the queue
        System.out.println("Remaining elements in the queue:");
        for (String name : queue) {
            System.out.println(name);
        }

        // Check if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            System.out.println("The queue is not empty.");
        }
    }
}
import java.util.*;
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("John");
        queue.add("Mary");
        queue.add("Peter");
        System.out.println("Queue: " + queue);
        String head = queue.remove();
        System.out.println("Removed element: " + head);
        System.out.println("Queue after removal: " + queue);
        String peek = queue.peek();
        System.out.println("Head element: " + peek);
        boolean contains = queue.contains("Mary");
        System.out.println("Queue contains Mary: " + contains);
        queue.clear();
        System.out.println("Queue after clear: " + queue);
        queue.offer("Alice");
        queue.offer("Bob");
        System.out.println("Queue after offer: " + queue);
        String poll = queue.poll();
        System.out.println("Removed element: " + poll);
        System.out.println("Queue after poll: " + queue);
        while (!queue.isEmpty()) {
            String element = queue.poll();
            System.out.println("Removed element: " + element);
        }
        System.out.println("Queue after removing all elements: " + queue);
    }
}

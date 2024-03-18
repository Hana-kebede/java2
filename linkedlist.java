import java.util.LinkedList;
public class linkedlist{
public static void main(String []args){
    LinkedList<String> list = new LinkedList<>();
    list.add("apple");
    list.add("banana");
    list.add("orange");
    System.out.println(list);
    list.addFirst("grape");
    System.out.println("After adding element at the beginning:" + list);
    list.addLast("pear");
    System.out.println("After adding element at the end: " + list);
    System.out.println("First element: " + list.getFirst());
    System.out.println("Last element: " + list.getLast());
    list.removeFirst();
    System.out.println("After removing first element: " + list);
    list.removeLast();
    System.out.println("After removing last element: " + list);
    list.remove(1);
    System.out.println("After removing element at index 1: " + list);
    list.set(0, "kiwi");
    System.out.println("After replacing element at index 0: " + list);
    list.add(2, "mango");
    System.out.println("After inserting element at index 2: " + list);
}
}

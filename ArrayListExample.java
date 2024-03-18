import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        System.out.println("Element at index 1: " + list.get(1));
        list.set(0, "grape");
        System.out.println("After replacing element at index 0: " + list);
        list.add(2, "pear");
        System.out.println("After inserting element at index 2: " + list);
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);
    }
}
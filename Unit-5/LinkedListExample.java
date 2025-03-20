import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango"); // Adds at the beginning
        list.addLast("Grapes"); // Adds at the end
        // Printing the LinkedList
        System.out.println("LinkedList: " + list);
        // Accessing elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        // Removing elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removing First & Last: " + list);
        // Checking if an element exists
        System.out.println("Contains Banana? " +
                list.contains("Banana"));
        // Getting the size of the LinkedList

        System.out.println("Size of LinkedList: " + list.size());
    }
}
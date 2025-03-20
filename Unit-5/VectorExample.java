import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();
        // Adding elements
        vector.add("Java");
        vector.add("Python");

        vector.add("C++");
        // Displaying Vector elements
        System.out.println("Vector Elements: " + vector);
        // Accessing elements
        System.out.println("Element at index 1: " +
                vector.get(1));
        // Removing an element
        vector.remove("Python");
        System.out.println("After Removing 'Python': " +
                vector);
        // Checking size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());
        // Using firstElement() and lastElement()
        System.out.println("First Element: " +
                vector.firstElement());
        System.out.println("Last Element: " +
                vector.lastElement());
        vector.add(2,"html");
        System.out.println("Vector Elements: " + vector);
        vector.add("css");
        vector.add("javascript");
        vector.add("php");
        System.out.println("Vector Elements: " + vector);
        vector.set(3, "xml");
        System.out.println("Vector Elements: " + vector);
    }
}

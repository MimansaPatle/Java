import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();
        // Adding elements
        numbers.add(30);
        numbers.add(10);

        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        // Display TreeSet (will be in sorted order)
        System.out.println("TreeSet: " + numbers);
        // Accessing elements
        System.out.println("First Element: " + numbers.first());
        System.out.println("Last Element: " + numbers.last());
        // Using higher() and lower()
        System.out.println("Higher than 20: " +
                numbers.higher(20));
        System.out.println("Lower than 40: " +
                numbers.lower(40));
        // Removing an element
        numbers.remove(30);
        System.out.println("After Removing 30: " + numbers);
        // Checking if an element exists
        System.out.println("Contains 50? " +
                numbers.contains(50));
    }

}

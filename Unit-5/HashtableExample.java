import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(3, "Mango");
        table.put(1, "Apple");
        table.put(2, "Banana");
       
        // Printing the Hashtable
        System.out.println("Hashtable: " + table);
        // Getting a value using a key
        System.out.println("Value for key 2: " + table.get(2));
        // Checking if a key exists
        System.out.println("Contains key 3? " +
                table.containsKey(3));
        // Checking if a value exists
        System.out.println("Contains value 'Banana'? " +
                table.containsValue("Banana"));
        // Removing a key-value pair
        table.remove(1);
        System.out.println("After removing key 1: " + table);
        // Iterating through Hashtable using Enumeration

       
        
    }
}

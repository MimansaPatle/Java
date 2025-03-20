import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();
        // Adding key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");

        students.put(3, "Charlie");
        students.put(4, "David");
        // Displaying the HashMap
        System.out.println("HashMap: " + students);
        // Retrieving a value using a key
        System.out.println("Student with ID 2: " +
                students.get(2));
        // Removing an entry
        students.remove(3);
        System.out.println("After removing key 3: " + students);
        // Checking if a key exists
        System.out.println("Contains key 4? " +
                students.containsKey(4));
        // Checking if a value exists
        System.out.println("Contains value 'Alice'? " +
                students.containsValue("Alice"));
        // Iterating over HashMap
        System.out.println("Iterating through HashMap:");

        for (Integer key : students.keySet()) {
            System.out.println("Key: " + key + ", Value: " +
                    students.get(key));
        
        }
        

        // Using entrySet()
        System.out.println("Iterating through HashMap using entrySet:");
        students.entrySet().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() +
                    ", Value: " + entry.getValue());
        
        }
    }
}
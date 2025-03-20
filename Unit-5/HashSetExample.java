import java.util.HashSet;

public class HashSetExample {
public static void main(String[] args) { 
// Creating a HashSet 
HashSet<String> fruits = new HashSet<>(); 

// Adding elements 
fruits.add("Apple"); 
fruits.add("Banana"); 
fruits.add("Mango"); 
fruits.add("Orange"); 
fruits.add("Banana"); // Duplicate, will not be added 
// Displaying HashSet 
System.out.println("HashSet: " + fruits); 
// Checking if an element exists 
System.out.println("Contains Banana? " + 
fruits.contains("Banana")); 
// Removing an element 
fruits.remove("Apple"); 
System.out.println("After removing Apple: " + fruits); 
// Iterating over HashSet 
System.out.println("Iterating HashSet:"); 
for (String fruit : fruits) { 
System.out.println(fruit); 
} 
}


}
import java.util.ArrayList;

public class ArrayListOperations {
public static void main(String[] args) { 
// Creating an ArrayList of Integers 
ArrayList<Integer> numbers = new ArrayList<>(); 
// Adding elements 
numbers.add(10); 

numbers.add(20); 
numbers.add(30); 
numbers.add(40); 
System.out.println("Original List: " + numbers); 
// Accessing an element 
System.out.println("Element at index 2: " + 
numbers.get(2)); 
// Modifying an element 
numbers.set(1, 25); 
System.out.println("After Modification: " + numbers); 
// Removing an element 
numbers.remove(Integer.valueOf(30)); // Removes the first occurrence of 30 
System.out.println("After Removing 30: " + numbers); 
// Checking if an element exists 
System.out.println("List contains 40? " + 
numbers.contains(40)); 
// Getting size of the list 
System.out.println("Size of List: " + numbers.size()); 
// Clearing the list 
numbers.clear(); 
System.out.println("After Clearing: " + numbers); 
}
}
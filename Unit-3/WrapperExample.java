import java.util.ArrayList;
public class WrapperExample { 
public static void main(String[] args) { 
// Autoboxing: primitive to wrapper conversion 
 
        int primitiveInt = 100; 
        Integer wrapperInt = primitiveInt; // Autoboxing occurs here 
 
        // Unboxing: wrapper to primitive conversion 
        Integer anotherWrapperInt = 200; 
        int anotherPrimitiveInt = anotherWrapperInt; // Unboxing occurs here 
 
        // Using utility methods to parse a string to an integer 
        String numberString = "300"; 
        int parsedInt = Integer.parseInt(numberString); 
        System.out.println("Parsed integer: " + parsedInt); 
 
        // Using valueOf to convert a String into an Integer object 
        Integer valueOfInt = Integer.valueOf(numberString); 
        System.out.println("Value of integer: " + valueOfInt); 
 
        // Boolean wrapper class example 
        String boolString = "true"; 
        Boolean boolValue = Boolean.parseBoolean(boolString); 
        System.out.println("Parsed boolean: " + boolValue); 
 
        // Character wrapper class example 
        char ch = 'A'; 

        Character characterWrapper = ch; // Autoboxing char to Character 
        System.out.println("Character: " + characterWrapper); 
                                               
        // Using a collection with wrappers 
       ArrayList<Integer> numbers = new ArrayList<>(); 
        numbers.add(10);  // autoboxing from int to Integer 
        numbers.add(20); 
        numbers.add(30); 
        System.out.println("ArrayList elements: " + numbers); 
 
        // Demonstrating mathematical operations with wrappers 
        Integer sum = wrapperInt + anotherWrapperInt; // unboxing happens automatically 
        System.out.println("Sum: " + sum); 
    } 
}
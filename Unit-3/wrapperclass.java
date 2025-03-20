import java.util.ArrayList;

public class wrapperclass {
    public static void main(String[] args) {
        // Creating an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding primitive int values (autoboxing happens here)
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Calculating sum of all elements (unboxing happens here)
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing Integer to int
        }

        // Printing the result
        System.out.println("Numbers: " + numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
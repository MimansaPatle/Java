import java.util.*;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            if (age < 18) {
                throw new InvalidAgeException("Invalid Age! Age is less than 18.");
            }

            System.out.println("Your age is valid: " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close(); // Closing scanner to prevent resource leak
        }
    }
}
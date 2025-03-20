import java.util.Scanner;

public class ATMPinSystem {
    public static void main(String[] args) {
        final int CORRECT_PIN = 1234;
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            System.out.print("Enter your ATM PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                System.out.println("PIN accepted. Access granted!");
                break;
            } else {
                attempts--;
                if (attempts == 0) {
                    System.out.println("Incorrect PIN! Your account is locked.");
                } else {
                    System.out.println("Incorrect PIN! Attempts left: " + attempts);
                }
            }
        }
        scanner.close();
    }
}

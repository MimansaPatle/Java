import java.util.concurrent.TimeUnit;

public class WashingMachineTimer {
    public static void main(String[] args) throws InterruptedException {
        int time = 10; // Timer starts from 10 seconds

        while (time > 0) {
            System.out.println("Washing in progress... Time left: " + time + " seconds");
            TimeUnit.SECONDS.sleep(1); // Simulating one second per countdown
            time--;
        }

        System.out.println("Washing complete! Please take out your clothes.");
    }
}

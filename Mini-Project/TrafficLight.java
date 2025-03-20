import java.util.concurrent.TimeUnit;

public class TrafficLight {
    public static void main(String[] args) throws InterruptedException {
        String[] lights = {"RED", "YELLOW", "GREEN"};

        for (String light : lights) {
            System.out.println("Traffic Light: " + light);

            // Simulate waiting time for each light
            switch (light) {
                case "RED":
                    TimeUnit.SECONDS.sleep(5); // Red light stays for 5 seconds
                    break;
                case "YELLOW":
                    TimeUnit.SECONDS.sleep(2); // Yellow light stays for 2 seconds
                    break;
                case "GREEN":
                    TimeUnit.SECONDS.sleep(4); // Green light stays for 4 seconds
                    break;
            }
        }

        System.out.println("Cycle Complete. Restarting...");
    }
}

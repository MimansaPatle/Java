class SharedResource { 
    private int data; 
    private boolean available = false; 
 
    public synchronized void produce(int value) { 
        while (available) { 
            try { 
                wait(); // Wait until data is consumed 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        
        data = value; 
        available = true; 
        System.out.println("Produced: " + data);

        notify(); // Notify consumer 
    } 
 
    public synchronized void consume() { 
        while (!available) { 
            try { 
                wait(); // Wait until data is produced 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
        System.out.println("Consumed: " + data); 
        available = false; 
        notify(); // Notify producer 
    } 
} 
 
public class InterThreadExample  { 
    public static void main(String[] args) { 
        SharedResource resource = new SharedResource(); 
 
        Thread producer = new Thread(() -> { 
            for (int i = 1; i <= 5; i++) { 
                resource.produce(i); 
            } 
        }); 
 
        Thread consumer = new Thread(() -> { 
            for (int i = 1; i <= 5; i++) { 
                resource.consume(); 
            } 
        }); 
 
        producer.start(); 
        consumer.start(); 
    } 
}

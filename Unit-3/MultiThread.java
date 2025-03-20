 class a extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread A: " + i);
        }
        System.out.println("Exiting from Thread A ...");
    }
}
class b extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread B: " + i);
        }
        System.out.println("Exiting from Thread B ...");
    }
}
public class  MultiThread{
    public static void main(String[] args) {
        a t1 = new a();
        t1.start();
       t1.setPriority(3);
        b t2 = new b();
        t2.start();
    }
} 
    


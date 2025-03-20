class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread" + " - " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
class MyThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("thread1" + " - " + i);
            try {
                Thread.sleep(2000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}
public class MultiThreadJoin {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread1 t2 = new MyThread1();
        
        // Sequential Execution using join()
        t1.start();
        try {
            t2.join(); // Ensures t1 completes before t2 starts
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        t2.start();
}
}

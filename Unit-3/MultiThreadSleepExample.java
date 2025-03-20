class MultiThreadDemo extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MultiThreadDemo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultiThreadSleepExample {
    public static void main(String[] args) {
        MultiThreadDemo t1 = new MultiThreadDemo();
        MultiThreadDemo1 t2 = new MultiThreadDemo1();

        t1.start();
        t2.start();
    }
}

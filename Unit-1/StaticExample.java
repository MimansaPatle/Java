public class StaticExample {
    static int count = 0;

    public StaticExample() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        new StaticExample();
        new StaticExample();
        StaticExample.displayCount();
    }
}
class Counter {
    static int count = 0; // Static Variable
    int instanceVar = 0;  // Instance Variable
    
    Counter() {
        count++;
        instanceVar++;
    }
    
    void display() {
        System.out.println("Static Count: " + count + "  Instance Variable: " + instanceVar);
    }
}

public class StaticInstance {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c1.display();
        c2.display();
        c3.display();
    }
}




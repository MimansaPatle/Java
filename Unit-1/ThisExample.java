class ClassA {
    int number; // Instance variable of ClassA
    public ClassA(int num) {
        this.number = num; // 'this' refers to the instance variable of ClassA
    }

    public void display() {
        System.out.println("ClassA number: " + this.number);
    }
}
class ClassB {
    int number; // Instance variable of ClassB
    public ClassB(int num) {
        this.number = num; // 'this' refers to the instance variable of ClassB
    }
    public void display() {
        System.out.println("ClassB number: " + this.number);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        // Create an object of ClassA
        ClassA objA = new ClassA(20);
        objA.display(); // Output: ClassA number: 10

        // Create an object of ClassB
        ClassB objB = new ClassB(40);
        objB.display(); // Output: ClassB number: 20
    }
}
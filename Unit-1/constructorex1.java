class Car {
    String brand;
    int speed;
    
    // Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }
    
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class constructorex1 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 150); // Constructor invoked
        myCar.display();
    }
}

class Car {
    String brand;
    int speed;
    
    // Parameterized Constructor
    Car(String b, int s) {
        brand = b;
        speed = s;
    }
    
    // Copy Constructor
    Car(Car c) {
        this.brand = c.brand;
        this.speed = c.speed;
    }
    
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

public class copyconstructorex1 {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", 180); // Original Object
        Car car2 = new Car(car1); // Copying Object
        
        car1.display();
        car2.display();
    }
}

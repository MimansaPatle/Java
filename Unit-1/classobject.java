class Car {
    // Attributes (Instance Variables)
    String brand;
    int speed;
    
    // Method (Behavior)
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}
public class classobject {
    public static void main(String[] args) {
        Car myCar = new Car(); // Object Creation
        myCar.brand = "Honda";
        myCar.speed = 120;
        myCar.display();
    }
}

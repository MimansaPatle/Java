// Generic class with a type parameter <T> 
class GenericBox<T> {
    private T item;

    // Constructor
    public GenericBox(T item) {
        this.item = item;
    }

    // Getter method
    public T getItem() {
        return item;
    }

    // Setter method
    public void setItem(T item) {

        this.item = item;
    }

    public void displayType() {
        System.out.println("Type of T is: " + item.getClass().getName());
    }
}

public class GenericExample {
    public static void main(String[] args) {
        // Creating instance for Integer type
        GenericBox<Integer> intBox = new GenericBox<>(100);
        System.out.println("Integer Value: " + intBox.getItem());
        intBox.displayType();
        // Creating instance for String type
        GenericBox<String> strBox = new GenericBox<>("Hello Generics");
        System.out.println("String Value: " + strBox.getItem());
        strBox.displayType();
    }
}
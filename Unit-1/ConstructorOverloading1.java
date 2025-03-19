public class ConstructorOverloading1 {
    int number;
    String text;
    // Default constructor with additional String argument
    public ConstructorOverloading1(String txt) {
        number = 0;
        text = txt;
    }

    // Parameterized constructor with additional String argument
    public ConstructorOverloading1(int num, String txt) {
        number = num;
        text = txt;
    }

    public static void main(String[] args) {
        ConstructorOverloading1 obj1 = new ConstructorOverloading1("Default Text");
        ConstructorOverloading1 obj2 = new ConstructorOverloading1(50, "Parameterized Text");

        System.out.println("Default Constructor: number = " + obj1.number + ", text = " + obj1.text);
        System.out.println("Parameterized Constructor: number = " + obj2.number + ", text = " + obj2.text);
    }
}
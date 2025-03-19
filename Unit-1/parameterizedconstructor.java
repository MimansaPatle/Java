public class parameterizedconstructor {
    int number;

    // Parameterized Constructor
    public parameterizedconstructor(int num) {
        number = num;
    }

    public static void main(String[] args) {
        parameterizedconstructor obj = new parameterizedconstructor(25);
        System.out.println("Number: " + obj.number);
    }
}
public class copyconstructorex2 {
    int number;
    String text;

    public copyconstructorex2(String txt,int num) {
        number = num;
        text = txt;
    }
    // Parameterized constructor with additional String argument
    public copyconstructorex2(String txt) {
        number = 0;
        text = txt;
    }

    public static void main(String[] args) {
        copyconstructorex2 obj1 = new copyconstructorex2("Default Text",50);
        copyconstructorex2 obj2 = new copyconstructorex2("Parameterized Text");

        System.out.println("Default Constructor: number = " + obj1.number + ", text = " + obj1.text);
        System.out.println("Parameterized Constructor: number = " + obj2.number + ", text = " + obj2.text);
    }
}
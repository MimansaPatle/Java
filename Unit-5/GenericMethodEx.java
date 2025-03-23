class GenericMethodExample {
    // Generic method
    public static <T> void printArray(T[] elements) {
        for (T element : elements) {
            System.out.print(element + " ");

        }
        System.out.println();
    }
}

public class GenericMethodEx {
        public static void main(String[] args) {
            Integer[] intArray = { 1, 2, 3, 4 };         //Integer is a class
            String[] strArray = { "Java", "Generics", "Example" };
            System.out.print("Integer Array: ");
            // GenericMethodExample.printArray(intArray);
           GenericMethodExample obj = new GenericMethodExample();
           obj.printArray(intArray);


            System.out.print("String Array: ");
            // GenericMethodExample.printArray(strArray);

            obj.printArray(strArray);

        }
    }


public class StringBufferExampl {
    public static void main(String[] args) {
        // Creating a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Appending text
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Inserting text at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // Reversing the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Deleting a part of the string
        sb.reverse(); // Reverse back to original order
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        // Replacing a part of the string
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);
    }
}
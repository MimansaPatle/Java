public class StringBufferExample {
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

        // Getting the length of the string
        int length = sb.length();
        System.out.println("Length of string: " + length);

        // Getting the capacity of the StringBuffer
        int capacity = sb.capacity();
        System.out.println("Capacity of StringBuffer: " + capacity);

        // Ensuring a minimum capacity
        sb.ensureCapacity(50);
        System.out.println("New capacity after ensuring: " + sb.capacity());

        // Setting the length of the string
        sb.setLength(5);
        System.out.println("After setting length: " + sb);

        // Getting a substring
        if (sb.length() >= 3) {
            String substring = sb.substring(0, 3);
            System.out.println("Substring: " + substring);
                } else {
                    System.out.println("Substring: length is less than 3");
        }
    }
}
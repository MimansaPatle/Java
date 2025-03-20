public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, Java!";
        String str2 = new String("Hello, Java!");
        System.out.println("Using equals: " + str1.equals(str2)); // true
        System.out.println("Using ==: " + (str1 == str2)); // false (different objects)
        String upperStr = str1.toUpperCase();
        System.out.println("Original: " + str1); // remains "Hello, Java!"
        System.out.println("Uppercase: " + upperStr); // "HELLO, JAVA!"

        String sub = str1.substring(7, 11); // Extracts "Java"
        System.out.println("Substring: " + sub);
       String[]  words = str1.split(" ");
        System.out.println("Splitting into words:");
        for (String word : words) {
            System.out.println(word);
        }
        int index = str1.indexOf("Java");
        System.out.println("\"Java\" found at index: " + index);
        char[] charArray = str1.toCharArray();
        System.out.println("Characters in the string:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}

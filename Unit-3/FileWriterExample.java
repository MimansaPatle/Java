import java.io.FileWriter;
import java.io.IOException;


public class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("mini.txt");
            writer.write("Hello, world!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

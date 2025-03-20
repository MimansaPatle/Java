import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class BufferFileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter reader = new BufferedWriter(new FileWriter("mini.txt"));
            reader.write("Hello, world!");
            reader.write("\nGini pagla");
            reader.close();
            
            System.out.println("\nSuccessfully write from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class BufferFileReader {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("mini.txt"));
            String character;
            while ((character = reader.readLine()) != null) {
                System.out.print(character);
            }
            reader.close();
            System.out.println("\nSuccessfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

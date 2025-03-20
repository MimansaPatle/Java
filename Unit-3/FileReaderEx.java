import java.io.FileReader;
import java.io.IOException;


public class FileReaderEx {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("mini.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char)character);                                                                    
            }
            reader.close();
            System.out.println("\nSuccessfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }                                      
    }
}

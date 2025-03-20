import java.io.FileInputStream;
import java.io.IOException;

//read the file

public class ReadInputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("mini.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;

public class BufferInputStream {
    public static void main(String[] args) {
        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream("mini.txt"))) {
            int content;
            while ((content = fis.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} 
    


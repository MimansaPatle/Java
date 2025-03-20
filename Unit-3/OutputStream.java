import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    public static void main(String[] args) {
        String data = "Hello, Byte Stream!";
        try (FileOutputStream fos = new FileOutputStream("mini.txt")) {
            fos.write(data.getBytes());
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


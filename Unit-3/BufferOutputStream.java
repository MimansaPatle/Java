import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedOutputStream;

public class BufferOutputStream {
    public static void main(String[] args) {
        String data = "Tumm akele khare";
        try (BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("mini.txt"))) {
            fos.write(data.getBytes());
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



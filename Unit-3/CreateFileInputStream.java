import java.io.File;

//creating a file

public class CreateFileInputStream {
    public static void main(String[] args) {
        try {
            File file = new File("mini.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

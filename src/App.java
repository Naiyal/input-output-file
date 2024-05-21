import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * App
 */
public class App {

    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\USER\\Desktop\\t4-logo-large.png");
        FileInputStream file = new FileInputStream(f);

        byte[] arr = new byte[(int) f.length()];
        file.read(arr);

        // for (int i = 0; i < f.length(); i++) {
        // System.out.println(arr[i]);
        // }
        File f2 = new File("C:\\Users\\USER\\Desktop\\t4-logo-large2.png");

        FileOutputStream file2 = new FileOutputStream("t4-logo-large3.png");

        file2.write(arr);

    }
}
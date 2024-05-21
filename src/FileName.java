import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileName {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\USER\\Desktop");
        File file1 = new File(file, "myname.txt");
        file1.createNewFile();
        // file1.delete();
        FileOutputStream file2 = new FileOutputStream(file1, true);
        file2.write("\nnull".getBytes());
        FileInputStream file3 = new FileInputStream(file1);
        int x;
        while ((x = file3.read()) != -1) {
            System.out.print((char) x);
        }
    }
}

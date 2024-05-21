import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        File file1 = new File("C:\\Users\\USER\\Desktop");
        File file2 = new File(file1, "src.txt");
        // FileOutputStream f = new FileOutputStream(file);
        // file.createNewFile();
        // System.out.println(file.exists());
        // System.out.println(file.getName());
        // System.out.println(file.getAbsolutePath());
        // file.mkdirs();
        // file.delete();
        file2.createNewFile();
        // for (String string : file.list()) {
        // System.out.println(string);
        // }
    }

}

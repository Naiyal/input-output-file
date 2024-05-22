import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class Output {

    public static void main(String[] args) throws Exception {
        File f = new File("text file.txt");
        // File f1 = new File("file write.txt");
        // f.createNewFile();
        // FileOutputStream file = new FileOutputStream(f);
        // byte[] b;
        // String s = "he eats pasta";
        // b = s.getBytes();
        // file.write(b);

        // FileWriter file2 = new FileWriter("file write.txt", true);
        // file2.write("You welcome here");
        // file2.write("\n");
        // file2.append("i am hungry");
        // file2.flush();
        ;
        ;
        FileReader file3 = new FileReader("file write.txt");

        int n;
        while ((n = file3.read()) != -1) {
            System.out.print((char) n);
        }
    }

}

import java.io.File;
import java.io.PrintWriter;

public class FilePrint {
    public static void main(String[] args) throws Exception {
        PrintWriter file = new PrintWriter("file2.txt");
        file.println("pasta has onion");
        file.println(50);

        file.flush();
        file.close();
    }

}

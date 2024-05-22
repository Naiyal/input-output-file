import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

public class Buffered {

    public static void main(String[] args) throws Exception {
        File name = new File("file.txt");
        BufferedWriter file = new BufferedWriter(new FileWriter(name, true));
        file.newLine();
        file.write("null data");
        file.newLine();

        file.close();

        BufferedReader file2 = new BufferedReader(new FileReader(name));
        ;
        // System.out.println(file2.readLine());
        // System.out.println(file2.readLine());
        // System.out.println(file2.readLine());
        // System.out.println(file2.readLine());
        // System.out.println(file2.readLine());
        // System.out.println(file2.readLine());
        ;
        String s = file2.readLine();
        while (s != null) {
            System.out.println(s);
            s = file2.readLine();
        }

        ;
        // char[] arr = new char[(int) name.length()];
        // file2.read(arr);
        // for (char i : arr) {
        // System.out.print(i);
        // }
        // file2.close();
    }

}

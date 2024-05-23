import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerFile {
    public static void main(String[] args) throws Exception {
        File f = new File("file.txt");
        Scanner file = new Scanner(f);

        while (file.hasNextLine()) {
            fun(file.nextLine());

        }
        file.close();

    }

    static void fun(String s) {
        String name, address, phone;
        Scanner file1 = new Scanner(s);
        file1.useDelimiter(",");
        while (file1.hasNext()) {
            name = file1.next();
            address = file1.next();
            phone = file1.next();

            System.out.println("name= " + name + ", address= " + address + ", phone= " + phone);
        }
        file1.close();

    }
}

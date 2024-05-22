import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class excersice {
    public static void main(String[] args) throws Exception {
        File f = new File("C:\\Users\\USER\\Desktop\\GIkltzzWoAAD09P.jpeg");
        FileInputStream file = new FileInputStream(f);

        byte[] arr = new byte[(int) f.length()];
        // for (int i = 0; i < arr.length; i++) {
        // arr[i]=file.read();
        // }
        file.read(arr);

        FileOutputStream f2 = new FileOutputStream(
                "C:\\Users\\USER\\Desktop\\New oop\\File input output\\GIkltzzWoAAD09P.jpeg");

        f2.write(arr);

        File f3 = new File("src");
        for (String b : f3.list()) {
            System.out.println(b);
        }

    }
}

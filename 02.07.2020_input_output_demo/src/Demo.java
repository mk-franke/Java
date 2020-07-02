import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;

public class Demo {

    public static void main(String[] args) throws Exception {

        try (InputStream inputStream = new FileInputStream("test.txt")) {
            int a = 0;
            int b = 10/0;
            while ((a = inputStream.available()) != 0) {
                byte[] buf = new byte[a];
                int readBytes = inputStream.read(buf);
                System.out.println("bytes available: " + a);
                System.out.println("bytes read: " + readBytes);
            }
        } catch (Exception ex) {
            System.out.println("Something went wrong");
            ex.printStackTrace();
        }
        System.out.println("Finalizing");

        BufferedReader in = new BufferedReader(new FileReader("test.txt"));
        in.lines().forEach(System.out::println);

        String str = null;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }

    }

}

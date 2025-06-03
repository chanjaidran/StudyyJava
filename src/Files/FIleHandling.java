package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FIleHandling {

    public static void main(String[] args) throws FileNotFoundException {


        String data="Hello World";
        try(FileOutputStream outputStream=new FileOutputStream("output.txt"))
        {
            byte[] bytes=data.getBytes();
            outputStream.write(bytes);
            System.out.println("data written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try(FileInputStream fis=new FileInputStream("output.txt")) {
            int mod;
            while ((mod = fis.read()) != -1) {
                System.out.print((char) mod); // Convert byte to char
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

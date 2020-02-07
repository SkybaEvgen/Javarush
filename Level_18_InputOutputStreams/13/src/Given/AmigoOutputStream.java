package Given;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream {
    public static String fileName = "C:/tmp/result.txt";

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

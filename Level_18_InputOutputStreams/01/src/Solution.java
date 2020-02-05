import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        long maxBite = 0;

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            if (maxBite < data) {
                maxBite = data;
            }
        }
        inputStream.close();
        System.out.println(maxBite);
    }
}

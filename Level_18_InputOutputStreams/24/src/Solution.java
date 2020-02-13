/*
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String fileName = reader.readLine();
            try {
                FileInputStream input = new FileInputStream(fileName);
                input.close();
            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }

        }
    }
}

/*
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream fileInputStream1 = new FileInputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        List<Integer> listFile1 = new ArrayList<>();

        while (fileInputStream1.available() > 0) {
            int data = fileInputStream1.read();
            listFile1.add(data);
        }

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        while (fileInputStream2.available() > 0) {
            byte[] buffer = new byte[fileInputStream2.available()];
            int count = fileInputStream2.read(buffer);
            fileOutputStream1.write(buffer, 0, count);
        }

        for (Integer i : listFile1) {
            fileOutputStream1.write(i);
        }

        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();

    }
}

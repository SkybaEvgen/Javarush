/*
Разделение файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream1 = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);

        List<Integer> listFile1 = new ArrayList<>();

        while (inputStream1.available() > 0) {
            int data = inputStream1.read();
            listFile1.add(data);
        }

        for (int i = 0; i < listFile1.size(); i++) {
            int data = listFile1.get(i);

            if (listFile1.size() % 2 == 0) {
                if (i < (listFile1.size())/2) {
                    outputStream2.write(data);
                } else outputStream3.write(data);
            } else {
                if (i <= (listFile1.size())/2) {
                    outputStream2.write(data);
                } else outputStream3.write(data);
            }

        }
        inputStream1.close();
        outputStream2.close();
        outputStream3.close();
    }
}

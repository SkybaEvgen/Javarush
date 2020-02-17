/*
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        StringBuilder s = new StringBuilder();

        while (fileReader.ready()) {
            int data = fileReader.read();
            s.append((char) data);
        }
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 != 0) {
                fileWriter.write(s.charAt(i));
            }
        }
        reader.close();
        fileReader.close();
        fileWriter.close();*/

        //---------------------second way--------------------------

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file2);

        while (fileReader.ready()) {
            int dataA = fileReader.read();
            int dataB = fileReader.read();
            fileWriter.write(dataB);
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }


}

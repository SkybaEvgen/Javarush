/*
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();
        FileOutputStream outputStreamFile1 = new FileOutputStream(file1, true);
        FileInputStream inputStreamFile2 = new FileInputStream(file2);
        FileInputStream inputStreamFile3 = new FileInputStream(file3);

        while (inputStreamFile2.available() > 0) {
            byte[] buffer = new byte[inputStreamFile2.available()];
            int count = inputStreamFile2.read(buffer);
            outputStreamFile1.write(buffer, 0, count);
        }

        while (inputStreamFile3.available() > 0) {
            byte[] buffer = new byte[inputStreamFile3.available()];
            int count = inputStreamFile3.read(buffer);
            outputStreamFile1.write(buffer, 0, count);
        }


        outputStreamFile1.close();
        inputStreamFile2.close();
        inputStreamFile3.close();
    }
}

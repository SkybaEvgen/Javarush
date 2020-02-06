/*
Реверс файла
*/

import java.io.*;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream = new FileOutputStream(fileName2);

        Stack<Integer> stackFile1 = new Stack<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            stackFile1.push(data);
        }

        while (!stackFile1.empty()) {
            int data = stackFile1.pop();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();

    }
}

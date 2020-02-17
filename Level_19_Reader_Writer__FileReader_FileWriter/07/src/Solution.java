/*
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileName);

        StringBuilder s = new StringBuilder();

        while (fileReader.ready()) {
            int data = fileReader.read();
            s.append((char)data);
        }
        fileReader.close();

        Pattern world = Pattern.compile("\\bworld\\b");
        Matcher matcher = world.matcher(s);
        int count = 0;
        while (matcher.find()) ++count;
        System.out.println(count);
    }
}

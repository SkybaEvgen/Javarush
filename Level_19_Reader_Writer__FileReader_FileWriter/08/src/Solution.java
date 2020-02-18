/*
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        Pattern number = Pattern.compile("\\b\\d+\\b");     // регулярка соответсвует лубому отдельно стоящему числу
        while (reader.ready()) {
           String s = reader.readLine();
           Matcher matcher = number.matcher(s);
           while (matcher.find()) {
               writer.write(s.substring(matcher.start(), matcher.end()) + " ");
           }
        }
        reader.close();
        writer.close();
    }
}

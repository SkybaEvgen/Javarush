/*
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while (reader.ready()) {
            String s = reader.readLine();
            String d = s.replaceAll("\\p{Punct}", "");
            writer.write(d);
        }


       /* Pattern words = Pattern.compile("\\w+");

        while (reader.ready()) {
            String s = reader.readLine();
            Matcher matcher = words.matcher(s);
            while (matcher.find()) {
                writer.write(matcher.group());
            }
        }*/


        reader.close();
        writer.close();
    }
}

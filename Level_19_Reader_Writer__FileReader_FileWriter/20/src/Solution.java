/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        while (reader.ready()) {
            String s = reader.readLine();
            String[] words = s.split(" ");
            for (String w : words) {
                if (w.matches("\\b\\S*\\d+\\S*\\b")) {
                    writer.write(w + " ");
                }
            }
        }

        reader.close();
        writer.close();
    }
}

/*
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        List<String> list = new ArrayList<>();
        double spaceCount = 0;
        double anyCharacter = 0;
        while (file.available() > 0) {
            list.add(String.valueOf((char) file.read()));
        }

        file.close();

        for (String s : list) {
            if (s.matches("\\s")) spaceCount++;
            if (s.matches(".")) anyCharacter++;
        }

        double q = 0;
        q = (spaceCount/anyCharacter) * 100;
        System.out.println(String.format("%.4g%n", q));
    }
}

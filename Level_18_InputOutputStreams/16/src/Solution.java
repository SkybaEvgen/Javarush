/*
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream(args[0]);
        List<String> list = new ArrayList<>();
        int i = 0;
        while (file.available() > 0) {
            list.add(String.valueOf((char) file.read()));
        }
        file.close();

        for (String s : list) {
            if (s.matches("\\w")) i++;
        }
        System.out.println(i);
    }
}

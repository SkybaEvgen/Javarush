/*
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader = new BufferedReader(new FileReader(fileName));
        List<String> list = new ArrayList<>();

        while (reader.ready()) {
            list.add(reader.readLine());        // добавили в лист элементы, где каждый элемент это строка в файле
        }
        reader.close();

        for (String s : list) {
            if (s.startsWith(args[0] + " ")) {
                System.out.println(s);
            }
        }
    }
}

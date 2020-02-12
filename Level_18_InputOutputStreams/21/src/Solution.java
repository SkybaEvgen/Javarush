/*
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
        List<Integer> listWords = new ArrayList<>();

        while (input.available() > 0) {
            listWords.add(input.read());
        }

        input.close();

        Map<Integer, Integer> treeMap = new TreeMap<>();        // сортируем и подсчитываем количество символов
        for (Integer i : listWords) {
            if (!treeMap.containsKey(i)) {
                treeMap.put(i, 1);
            } else treeMap.put(i, treeMap.get(i) + 1);
        }

        for (Map.Entry entry : treeMap.entrySet()) {
            char c = (char) (int) entry.getKey();           // преобразовываем Integer -> int -> char
            System.out.println(c + " " + entry.getValue());
        }
    }
}

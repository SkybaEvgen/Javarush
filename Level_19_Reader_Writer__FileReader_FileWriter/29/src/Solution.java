/*
Знакомство с тегами
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
        String file = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file));

        StringBuilder sb = new StringBuilder();
        String line;
        while (reader.ready()) {
            String s = reader.readLine();
            sb.append(s);
        }

        reader.close();

        String openTag = "<"+args[0];
        String closeTag = "</"+args[0]+">";

        // ищем все открывающие тэги и запоминаем их индексы расположения в строке
        List<Integer> openList = new ArrayList<>();
        int startIndex = 0;
        int index;
        while (true) {
            index = sb.indexOf(openTag, startIndex);
            if (index == -1) break;
            openList.add(index);
            startIndex = index+1;
        }

        // ищем все закрывающие тэги и запоминаем их индексы расположения в строке
        List<Integer> closeList = new ArrayList<>();
        startIndex = 0;
        while (true) {
            index = sb.indexOf(closeTag, startIndex);
            if (index == -1) break;
            closeList.add(index);
            startIndex = index+1;
        }

        // берем первый openTag и идем до closeTag, считаю openTag-и по пути (уровень вложенности)
        int closeID, openID, level = 0;
        while (openList.size() != 0) {
            for (Integer integer : openList) {
                if (integer < closeList.get(0)) level++;
                else break;
            }
            for (int i = level-1; i >= 0; i--) {
                openID = openList.get(0);
                closeID = closeList.get(i);
                line = sb.substring(openID, closeID);
                System.out.println(line+closeTag);
                openList.remove(0);
                closeList.remove(i);
                level = 0;
                break;
            }
        }
    }
}

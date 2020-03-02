import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file1));
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        while (reader.ready()) {
            list1.add(reader.readLine());
        }
        reader.close();

        reader = new BufferedReader(new FileReader(file2));
        while (reader.ready()) {
            list2.add(reader.readLine());
        }
        reader.close();


        int i = 0;
        int j = 0;
        while (i < list1.size() || j < list2.size()) {
            if (i < list1.size() && j < list2.size() && list1.get(i).equals(list2.get(j))) {
                lines.add(new LineItem(Type.SAME, list1.get(i)));
                i++;
                j++;
                continue;
            }
            if ((j < list2.size() && i < list1.size() && list1.get(i).equals(list2.get(j + 1))) || i >=list1.size()) {
                lines.add(new LineItem(Type.ADDED, list2.get(j)));
                j++;
                continue;
            }
            lines.add(new LineItem(Type.REMOVED, list1.get(i)));
            i++;

        }

        System.out.println(lines);

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type +" " + line;
        }
    }
}

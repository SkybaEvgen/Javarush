import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(file));

        while (reader.ready()) {
            String s = reader.readLine();
            String[] arr = s.split("[\\p{Space}\\p{Punct}]+");
            int count = 0;
            /*for (String word : words) {
                for (String value : arr) {
                    if (word.equals(value)) {
                        count++;
                    }
                }
            }*/
//            second wey
            for (String word : arr) {
                if (words.contains(word)) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(s);
            }
        }
        reader.close();
    }
}

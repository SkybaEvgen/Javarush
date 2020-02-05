import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Map<Integer, Integer> mapBites = new HashMap<>();

        while (inputStream.available() > 0 ) {
            int data = inputStream.read();
            mapBites.merge(data, 1, (oldValue, newValue) -> oldValue + newValue);   /* этот метод делает вот что:
                                                                                            - ищет в мапе ключ data
                                                                                            - если ключ не находится, то добавляет этот ключ со значением 1
                                                                                            - если ключ найден, то к его значению дабавляется 1 */
        }

        inputStream.close();

        int minValue = Collections.min(mapBites.values());      // в map вычисляем минимальное значение

        mapBites.forEach((key, value) -> {
            if (value == minValue) {
                System.out.print(key + " ");
            }
        });
    }
}

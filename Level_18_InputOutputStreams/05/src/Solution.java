import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Set<Integer> hashSetBites = new HashSet<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            hashSetBites.add(data);
        }
        inputStream.close();

        List<Integer> listBites = new ArrayList<>(hashSetBites);
        Collections.sort(listBites);

        for (Integer listBite : listBites) {
            System.out.print(listBite + " ");
        }
    }
}

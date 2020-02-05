import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName);

        Set<Integer> setBites = new TreeSet<>();
//        List<Integer> listTemp = new ArrayList<>();

        while (inputStream.read() > 0) {
            int data = inputStream.read();
//            listTemp.add(data);
            setBites.add(data);
        }
        inputStream.close();

        System.out.println(setBites.iterator().next());  // выводим первый элемент
//        System.out.println(listTemp);
    }
}

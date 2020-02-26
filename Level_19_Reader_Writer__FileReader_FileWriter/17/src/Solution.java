/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        Map<String, Double> map = new HashMap<>();
        List<String> listName = new ArrayList<>();

        while (reader.ready()) {
            String s = reader.readLine();
            String[] words = s.split("\\s");
            map.merge(words[0], Double.valueOf(words[1]), Double::sum);
        }

        /*Double value = 0.0;
        for (Map.Entry entry : map.entrySet()) {
            if ((Double) entry.getValue() > value) {
                value = (Double) entry.getValue();
            }
            if (value.equals(entry.getValue())) {
                listName.add(String.valueOf(entry.getKey()));
            }

        }
        for (String s : listName) {
            System.out.println(s);
        }*/
//----------------------------------------------------------------------------------------------------------------------
        /*
        second way

         */
        map.forEach((s, d) -> {
            if (d.equals(Collections.max(map.values()))) {
                System.out.println(s);
            }
        });


        reader.close();

    }
}

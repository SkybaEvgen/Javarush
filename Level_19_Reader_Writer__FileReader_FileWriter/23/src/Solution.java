/*
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String line = reader.readLine();
           /* char[] symbol = line.toCharArray();
            List<Character> list = new ArrayList<>();
            for (int i = symbol.length-1; i >= 0; i--) {
                list.add(symbol[i]);
            }
            String s = "";
            for (Character c : list) {
                s = s.concat(String.valueOf(c));
            }
            System.out.println(s);*/
            System.out.println(new StringBuilder(line).reverse());
        }
        reader.close();
    }
}

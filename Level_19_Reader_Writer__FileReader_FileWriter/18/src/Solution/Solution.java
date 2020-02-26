package Solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

        while (reader.ready()) {
            String s = reader.readLine();
            String[] words = s.split(" ");
            String name = "";
            Date date = format.parse(words[words.length-3] + " " + words[words.length-2] + " " + words[words.length-1]);
            for (int i = 0; i < words.length - 3; i++) {
                name += words[i] + " ";
            }
            name = name.trim();
            PEOPLE.add(new Person(name, date));
        }
        reader.close();

        for (int i = 0; i < PEOPLE.size(); i++) {
            System.out.println(PEOPLE.get(i));
        }
    }
}

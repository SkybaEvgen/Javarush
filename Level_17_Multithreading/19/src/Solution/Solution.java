package Solution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat newFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String crud = args[0];

        switch (crud) {
            case ("-c"):

                String name1 = args[1];
                String sex1 = args[2];
                Date date1 =  format.parse(args[3]);
                if(sex1.equals("м")) allPeople.add(Person.createMale(name1, date1));
                else if(sex1.equals("ж")) allPeople.add(Person.createFemale(name1, date1));
                System.out.println(allPeople.size() - 1);

                break;

            case ("-u"):
                int id2 = Integer.parseInt(args[1]);
                Date date2 = format.parse(args[4]);
                String name2 = args[2];
                String sex2 = args[3];

                if(sex2.equals("м")) allPeople.set(id2, Person.createMale(name2, date2));
                else if(sex2.equals("ж")) allPeople.set(id2, Person.createFemale(name2, date2));

                break;

            case ("-d"):
                int id3 = Integer.parseInt(args[1]);
                allPeople.set(id3, new Person(null, null, null));

                break;

            case ("-i"):
                String name;
                name = allPeople.get(Integer.parseInt(args[1])).getName();
                char sex;
                if (allPeople.get(Integer.parseInt(args[1])).getSex() == Sex.FEMALE)
                    sex = 'ж';
                else
                    sex = 'м';

                String bd;
                bd = newFormat.format(allPeople.get(Integer.parseInt(args[1])).getBirthDate());

                System.out.println(name + " " + sex + " " + bd);
                break;
        }

    }
}

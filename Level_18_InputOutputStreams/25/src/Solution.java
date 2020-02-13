import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
       /* BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> namesList = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            }
            namesList.add(s);
        }
        reader.close();
        int[] partsIndex = new int[namesList.size()];

        for (int i = 0; i < namesList.size(); i++) {
            String[] partsOfFileName = namesList.get(i).split("\\.");
            int part = Integer.parseInt(partsOfFileName[partsOfFileName.length - 1].substring(4));
            partsIndex[part - 1] = i;
        }
        FileOutputStream outputStream = new FileOutputStream(namesList.get(0).split("\\.")[0] + "." + namesList.get(0).split("\\.")[1], true);
        byte[] buffer = new byte[1024];
        for (int i = 0; i < namesList.size(); i++) {
            FileInputStream inputStream = new FileInputStream(namesList.get(partsIndex[i]));
            while (inputStream.available() > 0) {
                int count = inputStream.read(buffer);
                outputStream.write(buffer, 0, count);
            }
            inputStream.close();
        }
        outputStream.close();*/

       //------------------second way--------------------------
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String fileName = name;
        name = name.substring(0, name.lastIndexOf('.'));
        Map<String, byte[]> map = new TreeMap<>();
        while (!fileName.equals("end")) {
            FileInputStream file = new FileInputStream(fileName);
            byte[] bytes = new byte[file.available()];
            file.read(bytes);
            file.close();
            map.putIfAbsent(fileName, bytes);
            fileName = scanner.nextLine();
        }

        File file = new File(name);
        if (!file.exists()) file.createNewFile();
        FileOutputStream out = new FileOutputStream(file, true);
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            out.write(entry.getValue());
        }
        out.close();
        scanner.close();
    }
}

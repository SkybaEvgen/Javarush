/*
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader = new BufferedReader(new FileReader(fileName1));                 // Считываем файл BufferedReader-ом в одну строку
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        String num = reader.readLine();

        String[] numbers = num.split(" ");                                 // Разбиваем строку на массив строк методом split(" ")
        long[] doubleNums = new long[numbers.length];

        for (int i = 0; i < numbers.length; i++) {                              // парсинг, округление и запись
            doubleNums[i] = Math.round(Double.parseDouble(numbers[i]));
            writer.write(doubleNums[i] + " ");
        }

        reader.close();
        writer.close();

    }
}

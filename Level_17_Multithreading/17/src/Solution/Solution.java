package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1;
        String file2;
        file1 = reader.readLine();
        file2 = reader.readLine();
        allLines = Files.readAllLines(Paths.get(file1), StandardCharsets.UTF_8);
        forRemoveLines = Files.readAllLines(Paths.get(file2), StandardCharsets.UTF_8);
        Files.lines(Paths.get(file1)).close();
        Files.lines(Paths.get(file2)).close();

        Solution s = new Solution();
        s.joinData();

    }

    public void joinData() throws CorruptedDataException {

            if (allLines.containsAll(forRemoveLines)) {
                allLines.removeAll(forRemoveLines);
            } else {
                allLines.removeAll(allLines);
                throw new CorruptedDataException();
            }



    }
}


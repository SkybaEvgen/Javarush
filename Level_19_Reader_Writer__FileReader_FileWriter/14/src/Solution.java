/*
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);

        String[] numbers = result.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[2]);
        if (numbers[1].equals("-")) {
            System.out.println(a + " - " + b + " = " + (a - b));
        }
        if (numbers[1].equals("+")) {
            System.out.println(a + " + " + b + " = " + (a + b));
        }
        if (numbers[1].equals("*")) {
            System.out.println(a + " * " + b + " = " + (a * b));
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}


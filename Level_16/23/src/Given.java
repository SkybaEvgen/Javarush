/*
Рекурсивное создание нитей
*/

public class Given {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread {
    }
}

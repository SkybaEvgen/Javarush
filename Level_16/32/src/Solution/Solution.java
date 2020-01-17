package Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);

    }

    public static void main(String[] args) {
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true){}
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {

            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        boolean isRun = true;

        @Override
        public void showWarning() {
            isRun = false;
        }

        public void run() {
            while (isRun) {

            }
        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String tmp;
            int result = 0;
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    tmp = reader.readLine();
                    if (tmp.equals("N")) {
                        System.out.println(result);
                        interrupt();
                    }
                    result += Integer.parseInt(tmp);
                }
            } catch (IOException e) {
            }
        }
    }

}
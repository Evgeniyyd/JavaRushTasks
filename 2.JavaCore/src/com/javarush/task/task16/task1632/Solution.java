package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FlowOne());
        threads.add(new FlowTwo());
        threads.add(new FlowThree());
        threads.add(new FlowFor());
        threads.add(new FlowFive());
    }

    public static void main(String[] args) {
    }

    public static class FlowOne extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class FlowTwo extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class FlowThree extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static class FlowFor extends Thread implements Message {
        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            interrupt();
        }
    }

    public static class FlowFive extends Thread {
        @Override
        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                int sum = 0;
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line.equals("N")) {
                        break;
                    }
                    int number = Integer.parseInt(line);

                    sum += number;

                }
                System.out.println(sum);
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}


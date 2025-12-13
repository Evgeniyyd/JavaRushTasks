package com.javarush.task.task16.task1626;

/* 
Создание по образцу
*/

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountUpRunnable(), "Увеличиваем").start();

    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexDown = 1;

        @Override
        public void run() {
            try {
                while (true) {

                    System.out.println(toString());
                    countIndexDown += 1;
                    Thread.sleep(500);
                    if (countIndexDown > number) {
                        break;
                    }
                }
            } catch (InterruptedException e) {
            }
        }
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}

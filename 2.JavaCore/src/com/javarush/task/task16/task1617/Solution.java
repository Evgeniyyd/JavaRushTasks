package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

import static java.lang.System.out;

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (numSeconds >= 0){
                    if (numSeconds == 0){
                       out.print("Марш!");
                    }else {
                        out.print(numSeconds + " ");
                        Thread.sleep(1000);
                    }
                    numSeconds--;
                }

           } catch (InterruptedException e) {
                out.println("Прервано!");
            }
        }
    }
}

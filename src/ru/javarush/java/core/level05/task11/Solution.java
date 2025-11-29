package ru.javarush.java.core.level05.task11;

import java.util.Random;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(100) + 1; // 1..100
        Scanner console = new Scanner(System.in);

        // Игра с духом
        while (true) {
            int nextInt = console.nextInt();
     if (nextInt < secret){
         System.out.println("Больше!");
     }else if (nextInt > secret){
         System.out.println("Меньше!");
     }else {
         System.out.println("Верно!");
         break;
     }
        }
    }
}

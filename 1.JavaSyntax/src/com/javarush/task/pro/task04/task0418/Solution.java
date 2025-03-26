package com.javarush.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Стакан наполовину пуст или наполовину полон?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        double floor = Math.floor(glass);
        double ceil = Math.ceil(glass);
        Scanner scanner = new Scanner(System.in);
        if (scanner.nextBoolean()) {
            System.out.println((int) ceil);
        } else {
            System.out.println((int) floor);

        }
    }
}

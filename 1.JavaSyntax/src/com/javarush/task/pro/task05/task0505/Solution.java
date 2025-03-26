package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namber = scanner.nextInt();
        int[] array = new int[namber];
        for (int i = 0; i < namber; i++) {
            array[i] = scanner.nextInt();
        }
        if (namber % 2 == 0) {
            for (int i = array.length - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else {
            for (int i = 0; i < namber; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
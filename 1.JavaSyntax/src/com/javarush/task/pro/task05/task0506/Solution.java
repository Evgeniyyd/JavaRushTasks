package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new int[number];
        for (int i =0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i=0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }

        }
        System.out.println(min);
    }
}
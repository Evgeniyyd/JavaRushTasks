package com.javarush.task.pro.task05.task0509;

import java.util.Scanner;

public class numberMax {

    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        array = new int[size]; // заполнения массива
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < max; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
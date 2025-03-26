package com.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        array = new int[max]; // заполнения массива
        for (int i =0; i < array.length; i++) {
            array[i] = max;
            array[i] = scanner.nextInt();
        }
        int indexMax =0;
        for (int j =0; j < max; j++){
            if (array[j] > array[indexMax]){
                indexMax = j;
            }
        }
        System.out.println(array[indexMax]);



        }
    }


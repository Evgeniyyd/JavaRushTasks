package com.javarush.task.pro.task05.task0510;

/* 
Треугольный массив
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            int[] array = new int[i + 1];
            result[i] = array;
            for (int j = 0; j < array.length; j++) {
            result[i][j] = i+j;
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }
}
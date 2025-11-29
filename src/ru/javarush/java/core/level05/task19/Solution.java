package ru.javarush.java.core.level05.task19;

public class Solution {
    public static void main(String[] args) {
        int size = 8; // Размер доски 8x8
        // Внешний цикл — по строкам
        for (int i = 0; i < size; i++) {
            // Внутренний цикл — по клеткам строки
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("##");
                } else if ((i + j) % 2 != 0) {
                    System.out.print("__");
                }
            }
            System.out.println();
        }
    }
}

package ru.javarush.java.core.level07.task13;

public class Solution {
    public static void main(String[] args) {
        // Создаем зубчатый массив (каждая "строка" может иметь свою длину)
             int[][] playerAchievements = new int[3][];
                // 1-й уровень: 2 достижения
      playerAchievements[0] =  new int[]{15,17};
        // 2-й уровень: 4 достижения
        playerAchievements[1] = new int[]{123,12,123,8};
        // 3-й (бонусный) уровень: 1 достижение
        playerAchievements[2] = new int[]{554};
        for (int i = 0; i < playerAchievements.length; i++) {
            for (int j = 0; j < playerAchievements[i].length; j++) {
                    System.out.print(playerAchievements[i][j] + " ");

                }
                System.out.println();

        }
        // Выводим каждую строку массива на отдельной строке

        // Печатаем элементы строки, разделяя пробелом

        // перед первым элементом пробел не ставим


        // перенос строки после каждой "строки" массива


    }
}
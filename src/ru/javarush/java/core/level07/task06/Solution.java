package ru.javarush.java.core.level07.task06;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Создаем массив фиксированной длины 3 для любимых фильмов
        String[] favoriteMovies = new String[3];
        // Создаем Scanner для чтения строк с клавиатуры
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < favoriteMovies.length; i++) {
            favoriteMovies[i] = scanner.nextLine();
        }
        for (int j = favoriteMovies.length-1; j >= 0; j--) {
            System.out.println(favoriteMovies[j]);

        }
    }
}
// Считываем три названия фильмов и сохраняем по порядку в массив
// Выводим фильмы в обратном порядке: третий, второй, первый
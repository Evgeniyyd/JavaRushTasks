package ru.javarush.java.core.level11.task10;

public class Solution {
    // Метод выводит положительный счёт или генерирует исключение для неположительных значений
    public static void displayPositiveScore(int currentScore) {

            if (currentScore >0){
                System.out.println(currentScore);
            }else {
            throw new IllegalArgumentException("Невозможно отобразить отрицательный счёт! Число отрицательное.");
        }

        // Генерируем IllegalArgumentException с требуемым сообщением


    }

    public static void main(String[] args) {
        // Корректный вызов: положительное значение
              displayPositiveScore(5);
try {

    displayPositiveScore(-1);
    // Некорректный вызов: отрицательное значение, перехватываем исключение
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}

        // Выводим сообщение перехваченного исключения

    }
}
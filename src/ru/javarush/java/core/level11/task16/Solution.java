package ru.javarush.java.core.level11.task16;

public class Solution {

    // Метод для преобразования строки в число с пробросом исключения NumberFormatException
    public static int convertToGoldAmount(String playerInput)throws NumberFormatException  {
        int parseInt = Integer.parseInt(playerInput);
        // Используем Integer.parseInt для преобразования строки в число
return parseInt;
    }

    public static void main(String[] args) {
        try {

            convertToGoldAmount("dds");
        } catch (NumberFormatException e) {
            System.out.println( "Игрок ввел неверное значение. Ошибка преобразования числа.");
        }
        // Пробуем преобразовать некорректную строку в число


        // Обрабатываем исключение и выводим сообщение об ошибке

    }
}
package ru.javarush.java.core.level11.task12;

public class Solution {

    // Метод для проверки имени пользователя
    public static void validateUserName(String userName) {
        try {
            // Проверяем, является ли имя пользователя пустым
            System.out.println(userName.equals(""));
            // Генерируем исключение IllegalArgumentException с заданным сообщением
       throw  new IllegalArgumentException("Регистрация отклонена: Имя пользователя не может быть пустым.");
            // Сообщение, которое выводится всегда, независимо от результата проверки
        }finally {
            System.out.println("Проверка имени пользователя завершена.");
        }




    }

    public static void main(String[] args) {
        try {

            validateUserName("");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Вызываем метод validateUserName с пустой строкой

        // Перехватываем исключение и выводим его сообщение

    }
}
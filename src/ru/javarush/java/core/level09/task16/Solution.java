package ru.javarush.java.core.level09.task16;

public class Solution {
    public static void main(String[] args) {
        // Объявляем две переменные с email-адресами
        String emailOne = "User@Example.com";
        String emailTwo = "user@example.com";
        // Сравниваем email-адреса без учёта регистра
        boolean ignoreCase = emailOne.equalsIgnoreCase(emailTwo);
      String  registrationMessage = "user@example.com is registered";
        boolean example = registrationMessage.contains("example");
        // Создаем сообщение о регистрации пользователя


        // Проверяем, содержит ли сообщение подстроку "example"

        System.out.println(ignoreCase +" "+ example);
        // Выводим оба результата в одной строке через пробел

    }
}
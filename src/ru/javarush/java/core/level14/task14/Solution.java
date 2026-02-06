package ru.javarush.java.core.level14.task14;

public class Solution {
    public static void main(String[] args) {
        // Регистрируем анонимного пользователя (конструктор без параметров)
       User user = new User();
       User user1 = new User("Алиса");
        System.out.println("Имя пользователя: "+ user.getUserName()+ ", возраст:"+user.getUserAge());
        System.out.println("Имя пользователя: "+ user1.getUserName()+ ", возраст:"+user1.getUserAge());
        // Регистрируем пользователя с именем "Алиса" (конструктор с одним параметром)


        // Выводим значения полей каждого пользователя

    }
}
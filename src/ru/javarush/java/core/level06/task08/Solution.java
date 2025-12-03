package ru.javarush.java.core.level06.task08;

public class Solution {
    public static void main(String[] args) {
        // Объявляем общее количество магических яблок
     int totalApples =2;
        // Объявляем количество друзей-авантюристов
        int numberOfFriends =3;
        // Приводим totalApples к типу double перед делением, чтобы сохранить дробную часть результата
           double applesPerFriend = (double) totalApples / numberOfFriends;

        // Выводим точную долю яблок на одного друга (с дробной частью) на экран
        System.out.println(applesPerFriend);
    }
}
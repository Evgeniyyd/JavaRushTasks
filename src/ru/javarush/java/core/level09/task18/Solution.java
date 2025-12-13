package ru.javarush.java.core.level09.task18;

public class Solution {
    public static void main(String[] args) {
        // Создаем StringBuilder с исходной фразой
       StringBuilder builder = new StringBuilder("Привет, мир!");
        // Находим позицию запятой
        int indexOf = builder.indexOf(",");
        StringBuilder java = builder.insert(indexOf+2, "Java ");

        // В исходной строке после запятой стоит пробел,
        // поэтому вставляем после запятой и пробела (+2)
        System.out.println(java);

        // Вставляем подстроку "Java " (с пробелом в конце)


        // Выводим результат

    }
}
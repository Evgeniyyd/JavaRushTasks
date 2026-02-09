package ru.javarush.java.core.level09.task20;

public class Solution {
    public static void main(String[] args) {
        // Инициализация стартовой фразы в StringBuilder
StringBuilder builder = new StringBuilder("Я люблю Java!");
        StringBuilder delete = builder.delete(2, 8).insert(2,"");
        int indexOf = delete.indexOf("J");
        int indexOf1 = delete.indexOf("!");

      StringBuilder stringBuilder = delete.replace(indexOf, indexOf1,"программирование");
        // Удаление слова "люблю" с сохранением пробелов

        // Замена слова "Java" на "программирование"
        System.out.println(delete);

        // Вывод обновленной фразы на экран
        
    }
}
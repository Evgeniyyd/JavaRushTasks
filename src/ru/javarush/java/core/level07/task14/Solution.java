package ru.javarush.java.core.level07.task14;

public class Solution {
    public static void main(String[] args) {
        // Объявляем и инициализируем зубчатый массив guestLists,
        // где каждая вложенная строка — список гостей за отдельным столом
        // Стол 1: два гостя
        // Стол 2: три гостя
        // VIP-стол 3: один гость
        String[][] guestLists = new String[3][];
        guestLists[0] = new String[]{"Петя", "Ваня"};
        guestLists[1] = new String[]{"Маша","Катя","Оля"};
        guestLists[2] = new String[]{"Алиса"};
        // Внешний цикл for-each: перебираем каждый подмассив (каждый стол)

        // Внутренний цикл for-each: выводим поочерёдно имена гостей текущего стола
     for (String[] string: guestLists){
         for (String str : string){
             System.out.print(str+" ");

         }
            System.out.println();
        }

        // выводим имя и пробел

        // После вывода всех гостей одного стола — перевод строки


    }
}
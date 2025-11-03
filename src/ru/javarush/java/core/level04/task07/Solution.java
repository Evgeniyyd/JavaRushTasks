package ru.javarush.java.core.level04.task07;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную N для хранения количества товаров
int n =7;

        // Переменная для хранения общей стоимости
        int sum =0;

        // Используем цикл for для подсчета общей стоимости товаров
        for (int i =1; i <= n; i++) {
            sum+=i;
            // Добавляем стоимость текущего товара (равную его порядковому номеру)

        }
        System.out.println(sum);

        // Выводим общую стоимость всех товаров

    }
}
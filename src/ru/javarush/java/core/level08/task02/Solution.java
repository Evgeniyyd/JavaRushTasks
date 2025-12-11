package ru.javarush.java.core.level08.task02;

public class Solution {
    public static void main(String[] args) {
  MathMagic.showSum(7,5);

        // Вызовем наш "калькулятор": сложим 7 и 5 и выведем результат
 }
}

// Класс-инструмент для простых математических операций
class MathMagic {
   public static void showSum(int oneNumber, int twoNamber) {
       System.out.println(oneNumber + twoNamber);
    }

    // Статический метод принимает два int, считает сумму и выводит её

}
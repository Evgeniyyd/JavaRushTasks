package ru.javarush.java.core.level03.task16;

public class Solution {
    public static void main(String[] args) {
        // Исходные данные
int yourAge =25;
boolean hasJob =true;
boolean hasCreditHistory =false;
boolean hasGuarantor =true;
 boolean history = (yourAge >21 && hasJob) || (hasCreditHistory && hasGuarantor);
 boolean history2 = (yourAge > 21) &&  (hasJob || hasCreditHistory) && hasGuarantor;
        System.out.println(history);
        System.out.println(history2);


        // Кредит одобрят, если (возраст > 21 и есть работа) ИЛИ (есть кредитная история и поручитель)
        // Кредит одобрят, если (возраст > 21) И (есть работа ИЛИ кредитная история) И (есть поручитель)
        // Выводим результаты по двум правилам


    }
}
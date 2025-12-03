package ru.javarush.java.core.level06.task18;

public class Solution {
    public static void main(String[] args) {
        // Исходный символ агента — часть шифра
         char secretAgentLetter ='G';
         int numericCode = (int) secretAgentLetter;
        System.out.println(numericCode);
        char decodedAgentLetter = (char) numericCode;
        System.out.println(decodedAgentLetter);

        // Явно приводим char к int, получаем числовой код символа


        // Явно приводим int обратно к char, восстанавливаем символ

    }
}
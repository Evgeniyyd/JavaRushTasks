package ru.javarush.java.core.level06.task04;

public class Solution {
    public static void main(String[] args) {
        // Объявляем переменную secretSpellCode типа int и присваиваем ей значение 8364
     int secretSpellCode =8364;
     char revealedSymbol =(char) secretSpellCode;
        // Явно приводим число secretSpellCode к типу char и сохраняем в revealedSymbol
        System.out.println( "Символ с кодом 8364: " + revealedSymbol);

        // Выводим символ, соответствующий коду 8364

char enigmaticLetter ='Ж';
int numericEssenceOfLetter =(int) enigmaticLetter;
        // Объявляем переменную enigmaticLetter типа char и присваиваем ей символ 'Ж'
        System.out.println("Код символа 'Ж': " +numericEssenceOfLetter);

        // Явно приводим символ enigmaticLetter к типу int и сохраняем в numericEssenceOfLetter


        // Выводим числовой код символа 'Ж'

    }
}
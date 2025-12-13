package ru.javarush.java.core.level09.task14;

public class Solution {
    public static void main(String[] args) {
        // Исходное имя файла
        String filename = "document.pdf";
        boolean doc = filename.startsWith("doc");
        // Проверяем, начинается ли строка с "doc"
        boolean endsWith = filename.endsWith(".pdf");
        System.out.println(doc+" "+ endsWith);
        // Проверяем, заканчивается ли строка на ".pdf"


        // Выводим результаты через пробел: сначала startsWith, затем endsWith

    }
}
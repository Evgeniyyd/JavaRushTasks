package ru.javarush.java.core.level12.task10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Задаем путь к файлу "note.txt" с помощью класса Path
        Path path = Paths.get("note.txt");
        String s = Files.readString(path);
        System.out.println(s);
        // Считываем весь текст файла целиком удобным методом Files.readString


        // Выводим считанное содержимое без добавления лишней новой строки

    }
}
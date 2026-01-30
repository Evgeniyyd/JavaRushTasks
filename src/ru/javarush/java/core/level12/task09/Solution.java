package ru.javarush.java.core.level12.task09;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        // Создаем объект Path для файла "note.txt" в текущей директории
       Path path = Paths.get( "note.txt");

        String str = "Сегодня отличный день!";
        // Строка, которую нужно записать в файл
        // Записываем строку в файл с использованием кодировки UTF-8
        try {
            Files.write(path, str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ru.javarush.java.core.level12.task11;


import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;


public class Solution {
    public static void main(String[] args) throws IOException {
        // 1) Создаем массив байтов с ASCII-кодами букв H, I, J
        byte[] string = new byte[]{72, 73, 74};
        Path filePath  = Files.createFile(Path.of("letters.bin"));
        // 2) Записываем массив в бинарный файл "letters.bin"
        Path write1 = Files.write(filePath , string);
        // 3) Читаем содержимое файла обратно в новый массив байтов
        byte[] bytes = Files.readAllBytes(write1);
        for (byte b : bytes){

            System.out.print((char) b +" ");
        }
    }
    // 4) Выводим каждый байт как символ, разделяя пробелами
}


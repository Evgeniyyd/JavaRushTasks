package ru.javarush.java.core.level12.task12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Определяем пути к файлам в текущей рабочей папке
        Path path = Paths.get("letters.bin");
        // Считываем все байты исходного файла с помощью Files.readAllBytes
        byte[] bytes = Files.readAllBytes(path);
        Path path1 = Paths.get("letters_copy.bin");
        Path write = Files.write( path1, bytes);
        byte[] bytes1 = Files.readAllBytes(write);
        for (byte byt: bytes1){
            System.out.println(byt);
            // Записываем байты в новый файл с помощью Files.write
             }
        // Это создаст файл, если его нет, и перезапишет, если он уже существует
    }
}
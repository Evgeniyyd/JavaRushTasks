package ru.javarush.java.core.level11.task15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void extractFirstLineFromData(String dataFile) throws IOException, FileNotFoundException {
            // Создаем FileReader для чтения файла
            // Оборачиваем FileReader в BufferedReader для построчного чтения
        FileReader fileReader = new FileReader(dataFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            // Читаем первую строку из файла
            String line = bufferedReader.readLine();
            System.out.println(line);
            // Закрываем BufferedReader (он автоматически закроет и FileReader)

            // Выводим первую строку на экран (опционально, если требуется)

    }
    public static void main(String[] args) throws IOException {
        extractFirstLineFromData("");

    }
}
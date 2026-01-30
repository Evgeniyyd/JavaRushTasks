package ru.javarush.java.core.level12.task13;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Solution {
    public static void main(String[] args) throws IOException {
        try {
            // URL изображения, которое нужно скачать

            String imageUrl = "https://httpbin.org/image/png";
            URL url = new URL(imageUrl);
            InputStream inputStream = url.openStream();
            // Имя файла, в который будет сохранено изображение
            String fileName = "image01.png";
            Files.copy(inputStream, Paths.get(fileName));
            inputStream.close();
        } catch (Exception e) {
           e.printStackTrace();

        }
    }
}
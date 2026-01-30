package ru.javarush.java.core.level12.task16;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Готовим GET-запрос на указанный URL
        URI uri = URI.create("https://httpbin.org/image/png");
        // Создаем HttpClient из стандартной библиотеки Java
        HttpClient client = HttpClient.newHttpClient();
           HttpRequest request = HttpRequest.newBuilder(uri).build();
        // Отправляем запрос и сразу получаем тело как массив байт
        HttpResponse<byte[]> response = client.send(request, HttpResponse.BodyHandlers.ofByteArray());

      String type =response.headers().firstValue("Content-Type").orElse("null");
        // Извлекаем тип содержимого из заголовка Content-Type
        int length = response.body().length;
        // Определяем размер файла по длине массива байт ответа

        System.out.println("Тип: "+type +", Размер: "+ length+" байт");

        // Сначала выводим информацию о типе и размере

    Files.write(Path.of("image04.png"),response.body());
        // Только после вывода сохраняем изображение на диск

    }
}
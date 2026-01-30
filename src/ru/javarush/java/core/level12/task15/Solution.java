package ru.javarush.java.core.level12.task15;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Адрес изображения
        URI url = URI.create("https://avatars.mds.yandex.net/i?id=032190dddf17b1e2dcf2c23ff1a2ed8b68ebdee5-2465358-images-thumbs&n");
        // Создаем клиент HTTP (стандартная конфигурация)
        HttpClient httpClient = HttpClient.newHttpClient();
        // Готовим GET-запрос к нужному URL
        HttpRequest httpRequest = HttpRequest.newBuilder(url).build();
        // Отправляем запрос и получаем ответ как массив байт (тело — бинарные данные картинки)
        HttpResponse<byte[]> response = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofByteArray());


        int status = response.statusCode(); // Проверяем HTTP-статус
        if (status == 200) {
            // Сохраняем файл только при успешном ответе 200
            Path target = Path.of("image03.webp");
            Files.write(target, response.body()); // Записываем байты на диск
        } else {
            // Если сервер вернул неуспешный код — выводим сообщение об ошибке
            System.out.println("Ошибка загрузки: код ответа " + status);
        }
    }
}
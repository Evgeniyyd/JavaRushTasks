package ru.javarush.java.core.level12.task19;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solution {
    public static void main(String[] args) throws Exception {
        // Создаем HTTP‑клиент по умолчанию
    URI uri = new URI("https://catfact.ninja/fact");
        // Готовим GET‑запрос к API фактов о кошках
        HttpClient client = HttpClient.newHttpClient();
      HttpRequest request = HttpRequest.newBuilder(uri).build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        // Отправляем запрос и получаем ответ в виде строки


        // Выводим тело ответа на экран (JSON-строка с фактом о кошках)

    }
}